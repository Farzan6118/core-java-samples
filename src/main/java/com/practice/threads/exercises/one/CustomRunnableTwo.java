package com.java.practice.threads.exercises.one;

import com.java.practice.threads.exercises.one.constant.Language;

public class CustomRunnableTwo implements Runnable {
    private final Language language;

    public CustomRunnableTwo(Language language) {
        this.language = language;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": CustomRunnableTwo is processing " + language);
    }

}