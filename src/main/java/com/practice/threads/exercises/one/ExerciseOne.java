package com.practice.threads.exercises.one;

import com.java.practice.threads.exercises.exerciseOne.RunnerClass;
import com.practice.threads.exercises.one.constant.Language;

public class ExerciseOne {

    public void one() {
        // 1. تعریف یک مقدار enum
        Language language = Language.KOTLIN;

        // 2. ایجاد یک Runnable مشترک
        RunnerClass sharedRunner = new RunnerClass();

        // 3. اجرای چند Thread با Runnable مشترک
        System.out.println("===> Running multiple threads with shared RunnerClass:");
        Thread[] sharedThreads = {
                new Thread(sharedRunner, "Shared-Thread-1"),
                new Thread(sharedRunner, "Shared-Thread-2"),
                new Thread(sharedRunner, "Shared-Thread-3"),
                new Thread(sharedRunner, "Shared-Thread-4")
        };

        for (Thread t : sharedThreads) {
            t.start();
        }

        // 4. اجرای دو Thread با Runnable های مختلف و مقدار enum خاص
        System.out.println("\n===> Running threads with individual runnable and enum state:");
        CustomRunnableOne one = new CustomRunnableOne(language);
        CustomRunnableTwo two = new CustomRunnableTwo(language);

        Thread customThread = new Thread(one, "CustomRunnable-Thread");
        Thread setterThread = new Thread(two, "RunnableSetterTwo-Thread");

        customThread.start();
        setterThread.start();

        // 5. صبر برای پایان هر دو Thread
        try {
            customThread.join();
            setterThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n===> All threads have finished.");
    }
}
