package com.other_samples.pack_one;

public class RunnableTwo implements Runnable{
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
