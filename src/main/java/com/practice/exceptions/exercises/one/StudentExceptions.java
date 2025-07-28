package com.practice.exceptions.exercises.one;

import lombok.extern.slf4j.Slf4j;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

@Slf4j
public class StudentExceptions {

    public void throwUncheckedExceptions(int age) {
        if (age == 18) {
            throw new ArithmeticException("Age is 18");
        } else if (age == 19) {
            throw new RuntimeException("Age is 19");
        } else if (age == 20) {
            throw new IllegalStateException("Age is 20");
        }
    }

    // Throws three checked exceptions and declares them in the method signature
    public void throwCheckedExceptionsWithSignature(int age)
            throws ClassNotFoundException, IOException, FileNotFoundException {
        if (age == 18) {
            throw new IOException("Age is 18");
        } else if (age == 19) {
            throw new ClassNotFoundException("Age is 19");
        } else if (age == 20) {
            throw new FileNotFoundException("Age is 20");
        }
    }

    // Catches three checked exceptions and rethrows them as a RuntimeException
    public void throwCheckedExceptionsWithTryCatch(int age) {
        try {
            if (age == 18) {
                throw new IOException("Age is 18");
            } else if (age == 19) {
                throw new ClassNotFoundException("Age is 19");
            } else if (age == 20) {
                throw new EOFException("Age is 20");
            }
        } catch (IOException | ClassNotFoundException e) {
            log.error("Wrapped exception: {}", e.getMessage(), e);
        }
    }

    public void throwCheckedExceptionsWithTryWithResource(int age) {
        try (DummyResource resource = new DummyResource()) {
            if (age == 18) {
                throw new IOException("Age is 18");
            } else if (age == 19) {
                throw new ClassNotFoundException("Age is 19");
            } else if (age == 20) {
                throw new EOFException("Age is 20");
            }
        } catch (IOException | ClassNotFoundException e) {
            log.error("Wrapped exception: {}", e.getMessage(), e);
        }
    }

    // Dummy AutoCloseable for try-with-resources
    static class DummyResource implements AutoCloseable {
        public DummyResource() {
            log.info("DummyResource opened");
        }

        @Override
        public void close() {
            log.info("DummyResource closed");
        }
    }
}
