package com.codegnan.collectionsframework.recursionbased;

import java.util.Scanner;

/**
 * Interactive menu for recursive operations.
 */
public class RecursiveMenuApp {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            System.out.println("\n===== RECURSIVE UTILITY MENU =====");
            System.out.println("1. Calculate Factorial");
            System.out.println("2. Sum of Digits");
            System.out.println("3. Reverse Number");
            System.out.println("4. Check Palindrome");
            System.out.println("5. Calculate Power");
            System.out.println("6. Find GCD");
            System.out.println("7. Fibonacci Number");
            System.out.println("8. Count Digits");
            System.out.println("9. Print Numbers 1 to N");
            System.out.println("10. Sum Range 1 to N");
            System.out.println("11. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter number: ");
                int n = scanner.nextInt();
                try {
                    long result = RecursiveUtility.factorial(n);
                    System.out.println("Factorial of " + n + " = " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                
            } else {
                if (choice == 2) {
                    System.out.print("Enter number: ");
                    int n = scanner.nextInt();
                    int result = RecursiveUtility.sumOfDigits(n);
                    System.out.println("Sum of digits of " + n + " = " + result);
                    
                } else {
                    if (choice == 3) {
                        System.out.print("Enter number: ");
                        int n = scanner.nextInt();
                        int result = RecursiveUtility.reverseNumber(n);
                        System.out.println("Reverse of " + n + " = " + result);
                        
                    } else {
                        if (choice == 4) {
                            System.out.print("Enter number: ");
                            int n = scanner.nextInt();
                            boolean result = RecursiveUtility.isPalindrome(n);
                            if (result) {
                                System.out.println(n + " is a palindrome");
                            } else {
                                System.out.println(n + " is not a palindrome");
                            }
                            
                        } else {
                            if (choice == 5) {
                                System.out.print("Enter base: ");
                                int base = scanner.nextInt();
                                System.out.print("Enter exponent: ");
                                int exp = scanner.nextInt();
                                try {
                                    long result = RecursiveUtility.power(base, exp);
                                    System.out.println(base + "^" + exp + " = " + result);
                                } catch (IllegalArgumentException e) {
                                    System.out.println("Error: " + e.getMessage());
                                }
                                
                            } else {
                                if (choice == 6) {
                                    System.out.print("Enter first number: ");
                                    int a = scanner.nextInt();
                                    System.out.print("Enter second number: ");
                                    int b = scanner.nextInt();
                                    int result = RecursiveUtility.gcd(a, b);
                                    System.out.println("GCD of " + a + " and " + b + " = " + result);
                                    
                                } else {
                                    if (choice == 7) {
                                        System.out.print("Enter position: ");
                                        int n = scanner.nextInt();
                                        try {
                                            int result = RecursiveUtility.fibonacci(n);
                                            System.out.println("Fibonacci(" + n + ") = " + result);
                                        } catch (IllegalArgumentException e) {
                                            System.out.println("Error: " + e.getMessage());
                                        }
                                        
                                    } else {
                                        if (choice == 8) {
                                            System.out.print("Enter number: ");
                                            int n = scanner.nextInt();
                                            int result = RecursiveUtility.countDigits(n);
                                            System.out.println("Number of digits in " + n + " = " + result);
                                            
                                        } else {
                                            if (choice == 9) {
                                                System.out.print("Enter N: ");
                                                int n = scanner.nextInt();
                                                System.out.print("Numbers 1 to " + n + ": ");
                                                RecursiveUtility.printNumbers(n);
                                                System.out.println();
                                                
                                            } else {
                                                if (choice == 10) {
                                                    System.out.print("Enter N: ");
                                                    int n = scanner.nextInt();
                                                    int result = RecursiveUtility.sumRange(n);
                                                    System.out.println("Sum 1 to " + n + " = " + result);
                                                    
                                                } else {
                                                    if (choice == 11) {
                                                        running = false;
                                                        System.out.println("Goodbye!");
                                                    } else {
                                                        System.out.println("Invalid choice");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        scanner.close();
    }
}
