package com.codegnan.methodsdemo;

import java.util.Scanner;

/**
 * Student Grading System
 * Complete system with topper, average, and grading.
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class StudentGradingSystem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        
        // Arrays to store data
        String[] names = new String[numStudents];
        int[] totalMarks = new int[numStudents];
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        // Input student data
        inputStudentData(scanner, names, totalMarks, percentages, grades);
        
        // Find topper
        int topperIndex = findTopper(percentages);
        
        // Calculate class average
        double classAverage = calculateClassAverage(percentages);
        
        // Display results
        displayResults(names, totalMarks, percentages, grades, 
                      topperIndex, classAverage);
        
        scanner.close();
    }
    
    /**
     * Inputs data for all students.
     */
    private static void inputStudentData(Scanner scanner, String[] names,
                                        int[] totalMarks, double[] percentages,
                                        char[] grades) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            
            System.out.print("Enter marks in 3 subjects: ");
            int m1 = scanner.nextInt();
            int m2 = scanner.nextInt();
            int m3 = scanner.nextInt();
            scanner.nextLine();
            
            totalMarks[i] = m1 + m2 + m3;
            percentages[i] = (totalMarks[i] / 3.0);
            grades[i] = calculateGrade(percentages[i]);
        }
    }
    
    /**
     * Calculates grade based on percentage.
     */
    private static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else {
            if (percentage >= 80) {
                return 'B';
            } else {
                if (percentage >= 70) {
                    return 'C';
                } else {
                    if (percentage >= 60) {
                        return 'D';
                    } else {
                        return 'F';
                    }
                }
            }
        }
    }
    
    /**
     * Finds topper index.
     */
    private static int findTopper(double[] percentages) {
        int topperIndex = 0;
        for (int i = 1; i < percentages.length; i++) {
            if (percentages[i] > percentages[topperIndex]) {
                topperIndex = i;
            } else {
                // current topper remains
            }
        }
        return topperIndex;
    }
    
    /**
     * Calculates class average.
     */
    private static double calculateClassAverage(double[] percentages) {
        double sum = 0;
        for (double percentage : percentages) {
            sum += percentage;
        }
        return sum / percentages.length;
    }
    
    /**
     * Displays complete results.
     */
    private static void displayResults(String[] names, int[] totalMarks,
                                      double[] percentages, char[] grades,
                                      int topperIndex, double classAverage) {
        System.out.println("\n==========================================");
        System.out.println("         CLASS PERFORMANCE REPORT         ");
        System.out.println("==========================================");
        System.out.printf("%-15s %8s %8s %6s%n", "Name", "Total", "%", "Grade");
        System.out.println("------------------------------------------");
        
        for (int i = 0; i < names.length; i++) {
            String marker = (i == topperIndex) ? " 🏆" : "";
            System.out.printf("%-15s %8d %8.2f %6c%s%n", 
                            names[i], totalMarks[i], 
                            percentages[i], grades[i], marker);
        }
        
        System.out.println("==========================================");
        System.out.printf("Class Average: %.2f%%%n", classAverage);
        System.out.printf("Topper: %s (%.2f%%)%n", 
                         names[topperIndex], percentages[topperIndex]);
        System.out.println("==========================================");
    }
}
