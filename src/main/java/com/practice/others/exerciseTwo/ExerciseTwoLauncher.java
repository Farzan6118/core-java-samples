package com.java.practice.threads.exercises;


import com.java.practice.threads.exercises.exerciseTwo.function.JavaBiConsumer;

public class ExerciseTwoLauncher {

    public static void main(String[] args) {

        new ExerciseTwoLauncher().call();

    }

    public void call() {
        new JavaBiConsumer().biConsumerCaller();
//        new JavaPredicate().printTheResult();
//        new JavaStream().sampleOne();
//        new JavaStream().sampleTwo();

    }

}
