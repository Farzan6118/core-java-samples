package com.practice.collections.exercises.one;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapConcatDemo {

    private final List<String> stringList = new ArrayList<>();
    private final List<Integer> integerList = new ArrayList<>();

    public MapConcatDemo() {
        stringList.addAll(List.of("one", "two", "three", "four", "five"));
        integerList.addAll(List.of(1, 2, 3, 4, 5));
    }

    private void listSizesValidation() {
        if (stringList.size() != integerList.size()) {
            throw new RuntimeException("the list size is not equal to the one list size.");
        }
    }

    public void concatTwoListInOneMapOne() {
        listSizesValidation();
        Map<Integer, String> collect = IntStream.range(0, integerList.size()).boxed()
                .collect(Collectors.toMap(integerList::get, stringList::get));
        System.out.println(collect);
    }

    public void concatTwoListInOneMapTwo() {
        listSizesValidation();
        Map<String, String> collect = IntStream.range(0, stringList.size()).boxed()
                .collect(Collectors.toMap(stringList::get, stringList::get));
        System.out.println(collect);

    }

}
