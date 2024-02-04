package com.mixed_sample.pack_one;

public enum TestEnum {
    d(2), r(4);


    private final int s;

    TestEnum(int s) {
        this.s = s;
        System.out.println("number of calls");
    }

    public int getS() {
        return s;
    }

}
