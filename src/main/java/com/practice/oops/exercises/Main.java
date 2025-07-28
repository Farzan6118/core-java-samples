package com.practice.oops.exercises;

import com.practice.oops.exercises.one.Animal;
import com.practice.oops.exercises.one.Cat;
import com.practice.oops.exercises.one.Dog;

/**
 * Demonstrates object-oriented programming concepts using Animal, Dog, and Cat classes.
 * Shows encapsulation, inheritance, and polymorphism.
 */
public class Main {
    public static void main(String[] args) {
        // Creating Animal references to Dog and Cat objects - Encapsulation
        Animal dog = new Dog("the Doggy");
        Animal cat = new Cat("the Kitty");

        // Demonstrating polymorphism (dynamic method dispatch)
        dog.makeSound();  // Buddy says: Woof!
        cat.makeSound();  // Whiskers says: Meow!

        // Shared method from parent class
        dog.sleep();      // Buddy is sleeping...
        cat.sleep();      // Whiskers is sleeping...
    }
}