package com.practice.collections.exercises;

import com.practice.collections.exercises.one.MapConcatDemo;
import com.practice.collections.exercises.two.MapFilterDemo;

/**
 * Entry point to demonstrate various collection operations
 * such as list-to-map concatenation and filtering across device lists.
 */
public class Main {

    public static void main(String[] args) {
        // Uncomment the desired demo to run
//        runConcatDemo();
//        runFilterDemoWithSet();
        runFilterDemoWithMap();
    }

    /**
     * Runs list-to-map concatenation demos using MapConcatDemo.
     * - concatTwoListInOneMapOne: Map<Integer, String>
     * - concatTwoListInOneMapTwo: Map<String, Integer> with filtering
     */
    public static void runConcatDemo() {
        MapConcatDemo demo = new MapConcatDemo();
        demo.concatTwoListInOneMapOne();
        demo.concatTwoListInOneMapTwo();
    }

    /**
     * Runs filtering demo using Set comparison between DeviceOne and DeviceTwo codes.
     */
    public static void runFilterDemoWithSet() {
        MapFilterDemo demo = new MapFilterDemo();
        demo.mapMatchingCodesToDeviceTwoIds();

        demo.printDeviceOneList();
        demo.printDeviceTwoList();
        demo.printMatchedDeviceTwoIds();
    }

    /**
     * Runs filtering demo using Map comparison between DeviceOne and DeviceTwo codes.
     */
    public static void runFilterDemoWithMap() {
        MapFilterDemo demo = new MapFilterDemo();
        demo.mapMatchingCodesToDeviceTwoIdsWithMap();

        demo.printDeviceOneList();
        demo.printDeviceTwoList();
        demo.printMatchedDeviceTwoIds();
    }
}
