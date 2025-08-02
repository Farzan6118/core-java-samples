package com.practice.threads.exercises.two;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class VirtualThreadDemo {

    public void demoOne() {

        // Create a virtual thread per task executor
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 5; i++) {
                int taskId = i;
                executor.submit(() -> {
                    log.info("Task {} started on thread: {}", taskId, Thread.currentThread());
                    Thread.sleep(Duration.ofSeconds(2));
                    log.info("Task {} finished on thread: {}", taskId, Thread.currentThread());
                    return null;
                });
            }
        }
    }
}
