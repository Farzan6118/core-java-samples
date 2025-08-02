package com.practice.threads.exercises.one;


import com.practice.threads.exercises.one.constant.Language;

public class CustomRunnableOne implements Runnable {
    private final Language language;

    public CustomRunnableOne(Language language) {
        this.language = language;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": CustomRunnableOne is processing " + language);
    }
}