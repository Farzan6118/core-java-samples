package com.java.practice.threads.exercises.exerciseOne;

public class RunnerClass implements Runnable {
    final Object lock = new Object();
    private Integer counter = 0;

    @Override
    public void run() {

        System.out.println(++counter);

    }
}
