package com.practice.exceptions.exercises;

import com.practice.exceptions.exercises.one.StudentExceptions;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.runExceptionDemo();

    }

    public void runExceptionDemo() {
        StudentExceptions demo = new StudentExceptions();
        int[] testAges = {18, 19, 20};

        for (int age : testAges) {
            log.info("\n--- Testing with age: {} ---", age);

            // Unchecked exceptions
            try {
                demo.throwUncheckedExceptions(age);
            } catch (RuntimeException e) {
                log.warn("Unchecked Exception caught: {} - {}",
                        e.getClass().getSimpleName(), e.getMessage());
            }

            // Checked exceptions with try-catch wrapping
            try {
                demo.throwCheckedExceptionsWithTryCatch(age);
            } catch (RuntimeException e) {
                log.warn("Wrapped Checked Exception caught: {} - {}",
                        e.getClass().getSimpleName(), e.getMessage());
            }

            // Checked exceptions with throws signature
            try {
                demo.throwCheckedExceptionsWithSignature(age);
            } catch (IOException | ClassNotFoundException e) {
                log.warn("Checked Exception caught: {} - {}",
                        e.getClass().getSimpleName(), e.getMessage());
            }
        }
    }
}
