package com.codegnan.controlflow.ifdemo;
public class NestedIfExample {
	
	//Important: We use nested if-else, NOT else-if in this course.

    public static void main(String[] args) {

        int number = -5;

        if (number > 0) {
            System.out.println("Number is Positive");
        } else {
            if (number < 0) {
                System.out.println("Number is Negative");
            } else {
                if (number == 0) {
                    System.out.println("Number is Zero");
                } else {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
