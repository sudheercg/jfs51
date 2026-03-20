package com.codegnan.methodsdemo;

import java.util.Scanner;

/**
 * Calculator V1 - Basic Operations
 * 
 * A simple calculator that performs basic arithmetic operations.
 * Supports: addition, subtraction, multiplication, division, modulus
 * 
 * Features:
 * - User-friendly input prompts
 * - Division by zero handling
 * - Formatted output
 * - Input validation ready
 * 
 * Learning Objectives:
 * - Variable usage
 * - Arithmetic operators
 * - Conditional logic (nested if-else)
 * - Error handling basics
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class CalculatorV1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display calculator header
        System.out.println("========================================");
        System.out.println("     BASIC CALCULATOR - VERSION 1      ");
        System.out.println("========================================");
        System.out.println();
        
        // Get first number
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        
        // Get operator
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        
        // Get second number
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        
        // Variable to store result
        double result = 0;
        boolean validOperation = true;
        
        // Perform calculation based on operator
        if (operator == '+') {
            result = number1 + number2;
        } else {
            if (operator == '-') {
                result = number1 - number2;
            } else {
                if (operator == '*') {
                    result = number1 * number2;
                } else {
                    if (operator == '/') {
                        // Check for division by zero
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println("\nError: Cannot divide by zero!");
                            validOperation = false;
                        }
                    } else {
                        if (operator == '%') {
                            // Check for modulus by zero
                            if (number2 != 0) {
                                result = number1 % number2;
                            } else {
                                System.out.println("\nError: Cannot perform modulus by zero!");
                                validOperation = false;
                            }
                        } else {
                            System.out.println("\nError: Invalid operator!");
                            validOperation = false;
                        }
                    }
                }
            }
        }
        
        // Display result if operation was valid
        if (validOperation) {
            System.out.println();
            System.out.println("========================================");
            System.out.printf("%.2f %c %.2f = %.2f%n", number1, operator, number2, result);
            System.out.println("========================================");
        }
        
        // Close scanner
        scanner.close();
    }
}
