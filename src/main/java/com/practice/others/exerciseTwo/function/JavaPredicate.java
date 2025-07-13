package com.java.practice.threads.exercises.exerciseTwo.function;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class JavaPredicate {

    private final Predicate<String> stringPredicate = x -> x.toLowerCase().startsWith("a");
    private final Boolean aBoolean = stringPredicate.and(x -> x.toLowerCase().endsWith("d")).test("d");

    public void printTheResult() {

        List<Integer> integers = Arrays.stream("4,56,3,5,6,7".split(",")).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
        System.out.println(integers);
        ListIterator<Integer> integerListIterator = integers.listIterator();
        for (Integer intval : integers) {
            if (integerListIterator.hasNext() && integerListIterator.hasPrevious()) {
                integerListIterator.set(3);
            }

        }

        List<String> strings = new ArrayList<>();

        strings.add("mkyong");
        strings.add("java");
        strings.add("kotlin");
        strings.add("spring boot");
        strings.add("android");

        ListIterator<String> stringListIterator = strings.listIterator();

        List<Integer> integerList = StreamSupport.stream(Spliterators.spliteratorUnknownSize(stringListIterator, Spliterator.ORDERED), false).map(String::length).toList();
        integerList.forEach(System.err::println);

        System.out.println(aBoolean);
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> objectStream = Arrays.stream(arr, 1, 2);
        System.out.println(objectStream.collect(Collectors.toList()));

    }

}
