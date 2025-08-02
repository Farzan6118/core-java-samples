package com.practice.collections.exercises.three;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {


    private static final int ELEMENT_COUNT = 100_000;

    public static void main(String[] args) {
        System.out.println("=== INSERT AT END ===");
        testInsertionAtEnd(new ArrayList<>(), "ArrayList");
        testInsertionAtEnd(new LinkedList<>(), "LinkedList");

        System.out.println("\n=== INSERT IN MIDDLE ===");
        testInsertionInMiddle(new ArrayList<>(), "ArrayList");
        testInsertionInMiddle(new LinkedList<>(), "LinkedList");

        System.out.println("\n=== READ BY INDEX ===");
        testReadByIndex(new ArrayList<>(prepareTestData()), "ArrayList");
        testReadByIndex(new LinkedList<>(prepareTestData()), "LinkedList");
    }

    // Insert elements at the end: Both are generally fast (amortized O(1))
    private static void testInsertionAtEnd(List<Integer> list, String name) {
        long start = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println(name + " - Insertion at end: " + durationMs(start, end) + " ms");
    }

    // Insert elements repeatedly in the middle (size()/2): Both are O(n), ArrayList usually faster
    private static void testInsertionInMiddle(List<Integer> list, String name) {
        long start = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(list.size() / 2, i);
        }
        long end = System.nanoTime();
        System.out.println(name + " - Insertion in middle: " + durationMs(start, end) + " ms");
    }

    // Access elements by index: ArrayList is O(1), LinkedList is O(n) per get
    private static void testReadByIndex(List<Integer> list, String name) {
        long start = System.nanoTime();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.get(i);
        }
        long end = System.nanoTime();
        System.out.println(name + " - Read by index: " + durationMs(start, end) + " ms");
    }

    private static long durationMs(long start, long end) {
        return (end - start) / 1_000_000;
    }

    private static List<Integer> prepareTestData() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < ELEMENT_COUNT; i++) {
            list.add(i);
        }
        return list;
    }
}