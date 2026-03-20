package com.codegnan.oop.constructors;

/**
 * Student class with controlled object creation.
 */
public class Student {

    private String name;
    private int age;

    // Private constructor
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Static factory method
    public static Student createStudent(String name, int age) {

        // Validate name
        if (name == null || name.trim().isEmpty() || !name.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid name! Student not created.");
            return null;
        }

        // Validate age
        if (age <= 0 || age >= 120) {
            System.out.println("Invalid age! Student not created.");
            return null;
        }

        // If all validations pass → create object
        return new Student(name.trim(), age);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
