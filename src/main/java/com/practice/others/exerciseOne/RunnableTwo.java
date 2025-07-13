package com.java.practice.threads.exercises.exerciseOne;

import com.java.practice.threads.exercises.exerciseOne.constant.ConstantTwo;

public class RunnableTwo implements Runnable {
    private final ConstantTwo constantTwo;

    public RunnableTwo(ConstantTwo constantTwo) {
        this.constantTwo = constantTwo;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(constantTwo.getKey());
    }
}
