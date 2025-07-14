package com.practice.basics.exercises;

import com.practice.basics.exercises.one.PassByValueDemo;
import com.practice.basics.exercises.one.Person;

public class Main {
    public static void main(String[] args) {
        PassByValueDemo demo = new PassByValueDemo();

        // ==========================
        // Person (Custom Object)
        // ==========================
        System.out.println("=== Object (Person) ===");
        Person person = new Person("Alice");
        System.out.println("Before changeName: " + person.getName());
        demo.changeName(person);
        System.out.println("After changeName: " + person.getName() +
                "  // internal state changed (same object, ref copied by value)");

        demo.resetPerson(person);
        System.out.println("After resetPerson: " + person.getName() +
                "  // no effect: reassigning local ref does not affect caller");
        System.out.println();

        // ==========================
        // int (Primitive)
        // ==========================
        System.out.println("=== int (Primitive) ===");
        int num = 10;
        System.out.println("Before changeInt: " + num);
        demo.changeInt(num);
        System.out.println("After changeInt: " + num +
                "  // no effect: primitive passed by value");
        System.out.println();

        // ==========================
        // Integer (Wrapper)
        // ==========================
        System.out.println("=== Integer (Wrapper) ===");
        Integer integer = 20;
        System.out.println("Before changeInteger: " + integer);
        demo.changeInteger(integer);
        System.out.println("After changeInteger: " + integer +
                "  // no effect: Integer is immutable and ref passed by value");
        System.out.println();

        // ==========================
        // String (Immutable Object)
        // ==========================
        System.out.println("=== String (Immutable) ===");
        String str = "Original";
        System.out.println("Before changeString: " + str);
        demo.changeString(str);
        System.out.println("After changeString: " + str +
                "  // no effect: String is immutable and ref passed by value");
        System.out.println();

        // ==========================
        // int[] (Array)
        // ==========================
        System.out.println("=== int[] (Array) ===");
        int[] array = {1, 2, 3};
        System.out.println("Before changeArray: " + array[0]);
        demo.changeArray(array);
        System.out.println("After changeArray: " + array[0] +
                "  // element changed: array is mutable, ref copied by value");

        demo.resetArray(array);
        System.out.println("After resetArray: " + array[0] +
                "  // no effect: reassigning local ref does not affect caller");
    }
}

