package com.codegnan.oop.constructors;
public class TestStudent {
    public static void main(String[] args) {

        Student s1 = Student.createStudent("Rahul", 20);
        Student s2 = Student.createStudent("Ravi123", 25);  // invalid name
        Student s3 = Student.createStudent("Anil", -5);     // invalid age

        if (s1 != null) {
            System.out.println(s1.getName() + " - " + s1.getAge());
        }
    }
}