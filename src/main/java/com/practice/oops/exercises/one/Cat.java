package com.practice.oops.exercises.one;

import lombok.extern.slf4j.Slf4j;

/**
 * The Cat class represents a specific type of Animal.
 * It overrides the makeSound method to provide cat-specific behavior.
 */
@Slf4j
public class Cat extends Animal {

    /**
     * Constructs a new Cat with the given name.
     *
     * @param name The name of the cat.
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * Makes a cat-specific sound.
     */
    @Override
    public void makeSound() {
        log.info("{} says: Meow!", name);
    }
}