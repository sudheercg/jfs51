package com.codegnan.printformatter;
import java.util.Scanner;

public class PrintfCompleteDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
       // System.out.print("Enter student name: ");
       // String name = sc.nextLine();

        String name ="Sudheer";

        
        //System.out.print("Enter age: ");
        //int age = sc.nextInt();
        int age =33;

        //System.out.print("Enter marks: ");
       // double marks = sc.nextDouble();
        double marks = 55.98;

        // Printing formatted output
        System.out.println("\n===== Student Details =====");

        System.out.printf("Name  : %s%n", name);
        System.out.printf("Age   : %d years%n", age);
        System.out.printf("Marks : %.2f%n", marks);

        // Showing alignment and formatting
        System.out.println("\n===== Formatted Table =====");

        System.out.printf("%s %-10s %-10s%n", "Name", "Age", "Marks");
        System.out.printf("%-25s %-10d %-10.2f%n", name, age, marks);

        // Zero padding example
        System.out.printf("%nRoll No (Zero padded): %05d%n", 7);

        sc.close();
    }
}
