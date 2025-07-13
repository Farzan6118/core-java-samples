package com.java.practice.threads.exercises.exerciseOne.constant;

public enum ConstantTwo {
    KOTLIN("kotlin", "23423423"),
    JAVA("java", "sdfsdfsf");

    private final String key;
    private final String value;

    ConstantTwo(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
    }

    public String getValue() {
        return value;
    }
}
