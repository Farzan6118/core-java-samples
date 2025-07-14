package com.practice.basics.exercises.one;

public class PassByValueDemo {
    // --- Methods for Person ---
    public void changeName(Person p) {
        p.setName("Bob"); // Use setter instead of accessing field directly
    }

    public void resetPerson(Person p) {
        p = new Person("Charlie"); // Reassigns local reference only
    }

    // --- Methods for int ---
    public void changeInt(int x) {
        x = 100; // No effect outside: primitive is passed by value
    }

    // --- Methods for Integer ---
    public void changeInteger(Integer x) {
        x = 200; // No effect outside: Integer is immutable, passed by value
    }

    // --- Methods for String ---
    public void changeString(String s) {
        s = "New String"; // No effect outside: String is immutable
    }

    // --- Methods for int[] ---
    public void changeArray(int[] arr) {
        arr[0] = 999; // Modifies array contents — works because array is mutable
    }

    public void resetArray(int[] arr) {
        arr = new int[]{1, 2, 3}; // Reassigns local reference only
    }
}