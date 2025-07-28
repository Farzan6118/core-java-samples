package com.practice.oops.exercises.one;

import lombok.extern.slf4j.Slf4j;

/**
 * The Dog class represents a specific type of Animal.
 * It overrides the makeSound method to provide dog-specific behavior.
 */
@Slf4j
public class Dog extends Animal {

    /**
     * Constructs a new Dog with the given name.
     *
     * @param name The name of the dog.
     */
    public Dog(String name) {
        super(name);
    }

    /**
     * Makes a dog-specific sound.
     */
    @Override
    public void makeSound() {
        log.info("{} says: Woof!", name);
    }
}
