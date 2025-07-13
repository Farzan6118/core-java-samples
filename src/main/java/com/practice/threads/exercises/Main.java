package com.practice.threads.exercises;

import com.java.practice.threads.exercises.one.ExerciseOne;

public class Main {
    public static void main(String[] args) {
        launchExerciseOne();
//        launchExerciseTwo();
    }

    public static void launchExerciseOne(){
        new ExerciseOne().one();
    }

    public static void launchExerciseTwo(){
        new ExerciseOne().one();
    }

}
