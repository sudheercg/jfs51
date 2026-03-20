package com.codegnan.methodsdemo;

import java.util.Scanner;

/**
 * Calculator - Refactored with Methods
 * Demonstrates proper code organization using methods.
 * 
 * @author Codegnan IT Solutions
 * @version 2.0
 */
public class CalculatorRefactored {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculating = true;
        
        while (continueCalculating) {
            displayMenu();
            int choice = getUserChoice(scanner);
            
            if (choice == 6) {
                displayExitMessage();
                continueCalculating = false;
            } else {
                if (choice >= 1 && choice <= 5) {
                    performCalculation(scanner, choice);
                    continueCalculating = askToContinue(scanner);
                } else {
                    System.out.println("Invalid choice! Select 1-6.");
                }
            }
        }
        
        scanner.close();
    }
    
    /**
     * Displays calculator menu.
     */
    private static void displayMenu() {
        System.out.println("\n========================================");
        System.out.println("        CALCULATOR - REFACTORED        ");
        System.out.println("========================================");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("========================================");
    }
    
    /**
     * Gets valid user choice.
     */
    private static int getUserChoice(Scanner scanner) {
        System.out.print("Enter choice: ");
        return scanner.nextInt();
    }
    
    /**
     * Gets two numbers from user.
     */
    private static double[] getNumbers(Scanner scanner) {
        double[] numbers = new double[2];
        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextDouble();
        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextDouble();
        return numbers;
    }
    
    /**
     * Performs calculation based on choice.
     */
    private static void performCalculation(Scanner scanner, int choice) {
        double[] numbers = getNumbers(scanner);
        double num1 = numbers[0];
        double num2 = numbers[1];
        double result = 0;
        String operation = "";
        boolean valid = true;
        
        if (choice == 1) {
            result = add(num1, num2);
            operation = "+";
        } else {
            if (choice == 2) {
                result = subtract(num1, num2);
                operation = "-";
            } else {
                if (choice == 3) {
                    result = multiply(num1, num2);
                    operation = "*";
                } else {
                    if (choice == 4) {
                        if (num2 != 0) {
                            result = divide(num1, num2);
                            operation = "/";
                        } else {
                            System.out.println("Error: Division by zero!");
                            valid = false;
                        }
                    } else {
                        if (choice == 5) {
                            if (num2 != 0) {
                                result = modulus(num1, num2);
                                operation = "%";
                            } else {
                                System.out.println("Error: Modulus by zero!");
                                valid = false;
                            }
                        }
                    }
                }
            }
        }
        
        if (valid) {
            displayResult(num1, num2, operation, result);
        }
    }
    
    /**
     * Addition operation.
     */
    private static double add(double a, double b) {
        return a + b;
    }
    
    /**
     * Subtraction operation.
     */
    private static double subtract(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplication operation.
     */
    private static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * Division operation.
     */
    private static double divide(double a, double b) {
        return a / b;
    }
    
    /**
     * Modulus operation.
     */
    private static double modulus(double a, double b) {
        return a % b;
    }
    
    /**
     * Displays calculation result.
     */
    private static void displayResult(double num1, double num2, 
                                     String operation, double result) {
        System.out.println("\n========================================");
        System.out.printf("%.2f %s %.2f = %.2f%n", num1, operation, num2, result);
        System.out.println("========================================");
    }
    
    /**
     * Asks if user wants to continue.
     */
    private static boolean askToContinue(Scanner scanner) {
        System.out.print("\nContinue? (yes/no): ");
        String response = scanner.next().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
    
    /**
     * Displays exit message.
     */
    private static void displayExitMessage() {
        System.out.println("\nThank you for using Calculator!");
    }
}
