package com.practice.collections.exercises.one;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapCompareDemo {

   private final List<String> stringList = new ArrayList<>();
   private final List<Integer> integerList = new ArrayList<>();

    public MapCompareDemo() {
        stringList.addAll(List.of("one", "two", "three", "four", "five"));
        integerList.addAll(List.of(1,2,3,4,5));
    }

    public Map<Integer, String> concatTwoListInOneMap(){
        if(stringList.size() != integerList.size()){
            throw new RuntimeException("the list size is not equal to the one list size.");
        }

        return IntStream.range(0, integerList.size()).boxed()
                .collect(Collectors.toMap(integerList::get, stringList::get));

    }

}
