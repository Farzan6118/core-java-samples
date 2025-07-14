package com.practice.collections.exercises;

import com.practice.collections.exercises.one.MapConcatDemo;
import com.practice.collections.exercises.two.MapFilterDemo;

public class Main {
    public static void main(String[] args) {
        one();
//        two();
    }

    public static void one() {
        new MapConcatDemo().concatTwoListInOneMapOne();
        new MapConcatDemo().concatTwoListInOneMapTwo();
    }

    public static void two() {
        new MapFilterDemo().concatTwoListInOneMapDemoOne();
    }


}
