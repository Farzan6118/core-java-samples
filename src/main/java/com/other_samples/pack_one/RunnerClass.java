package com.other_samples.pack_one;

public class RunnerClass implements Runnable {
    private Integer counter = 0;
    final Object lock = new Object();
    @Override
    public void run() {

            System.out.println(++counter);

    }
}
