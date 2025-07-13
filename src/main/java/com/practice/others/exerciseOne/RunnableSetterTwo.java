package com.java.practice.threads.exercises.exerciseOne;

import com.java.practice.threads.exercises.exerciseOne.constant.ConstantTwo;

public class RunnableSetterTwo implements Runnable {
    private ConstantTwo constantTwo;

    public RunnableSetterTwo(ConstantTwo constantTwo) {
        this.constantTwo = constantTwo;
    }

    @Override
    public void run() {
        this.constantTwo.setKey("java");
    }
}
