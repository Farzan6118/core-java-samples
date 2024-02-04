package com.mixed_sample.pack_one;

public class RunnerClass implements Runnable {
    final Object lock = new Object();
    private Integer counter = 0;

    @Override
    public void run() {

        System.out.println(++counter);

    }
}
