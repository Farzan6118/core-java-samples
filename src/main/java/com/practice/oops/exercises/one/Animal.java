package com.practice.oops.exercises.one;

import lombok.extern.slf4j.Slf4j;

/**
 * The Animal class represents a general animal with a name.
 * It provides methods to simulate basic animal behavior such as making a sound and sleeping.
 * <p>
 * This class is intended to be extended by more specific animal classes
 * that implement the makeSound() method.
 */
@Slf4j
public abstract class Animal {
    protected String name;

    /**
     * Constructs a new Animal with the given name.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Makes a sound. This method should be overridden by subclasses.
     */
    public abstract void makeSound();

    /**
     * Simulates the animal sleeping.
     */
    public void sleep() {
        log.info("{} is sleeping...", name);
    }
}
