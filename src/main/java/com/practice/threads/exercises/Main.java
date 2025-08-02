package com.practice.threads.exercises;


import com.practice.threads.exercises.one.ExerciseOne;
import com.practice.threads.exercises.two.VirtualThreadDemo;

public class Main {
    public static void main(String[] args) {
//        launchExerciseOne();
//        launchExerciseTwo();
        launchVirtualThreadDemo();

    }

    public static void launchExerciseOne() {
        new ExerciseOne().one();
    }

    public static void launchExerciseTwo() {
        new ExerciseOne().one();
    }

    public static void launchVirtualThreadDemo() {
        new VirtualThreadDemo().demoOne();
    }

}
