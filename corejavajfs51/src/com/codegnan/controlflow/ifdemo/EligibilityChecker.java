package com.codegnan.controlflow.ifdemo;

import java.util.Scanner;

/**
 * Eligibility Checker Application
 * 
 * Checks user eligibility for various age-based services.
 * Demonstrates comprehensive input validation and conditional logic.
 * 
 * Services Checked:
 * - School Education (5-18 years)
 * - Voting Rights (18+ years)
 * - Driving License (18+ years)
 * - Senior Citizen Benefits (60+ years)
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class EligibilityChecker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display header
        displayHeader();
        
        // Get and validate age
        int age = getValidAge(scanner);
        
        // Check eligibilities
        checkEligibilities(age);
        
        // Display footer
        displayFooter();
        
        scanner.close();
    }
    
    /**
     * Displays application header.
     */
    private static void displayHeader() {
        System.out.println("==========================================");
        System.out.println("     ELIGIBILITY CHECKER SYSTEM          ");
        System.out.println("==========================================");
        System.out.println();
    }
    
    /**
     * Gets valid age from user with comprehensive validation.
     * 
     * @param scanner Scanner object for input
     * @return valid age between 1 and 120
     */
    private static int getValidAge(Scanner scanner) {
        int age = 0;
        boolean valid = false;
        
        while (!valid) {
            System.out.print("Enter your age: ");
            
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                
                if (age >= 1 && age <= 120) {
                    valid = true;
                } else {
                    System.out.println("❌ Invalid age! Age must be between 1 and 120.");
                    System.out.println();
                }
            } else {
                System.out.println("❌ Invalid input! Please enter a number.");
                System.out.println();
                scanner.next();  // Clear invalid input
            }
        }
        
        return age;
    }
    
    /**
     * Checks and displays all eligibilities based on age.
     * 
     * @param age user's age
     */
    private static void checkEligibilities(int age) {
        System.out.println();
        System.out.println("==========================================");
        System.out.println("         ELIGIBILITY REPORT              ");
        System.out.println("==========================================");
        System.out.println("Your Age: " + age + " years");
        System.out.println("------------------------------------------");
        
        // Check School Eligibility (5-18 years)
        if (age >= 5 && age <= 18) {
            System.out.println("✓ School Education: ELIGIBLE");
        } else {
            System.out.println("✗ School Education: NOT ELIGIBLE");
        }
        
        // Check Voting Rights (18+ years)
        if (age >= 18) {
            System.out.println("✓ Voting Rights: ELIGIBLE");
        } else {
            int yearsToWait = 18 - age;
            System.out.println("✗ Voting Rights: NOT ELIGIBLE");
            System.out.println("  (Eligible in " + yearsToWait + " years)");
        }
        
        // Check Driving License (18+ years)
        if (age >= 18) {
            System.out.println("✓ Driving License: ELIGIBLE");
        } else {
            int yearsToWait = 18 - age;
            System.out.println("✗ Driving License: NOT ELIGIBLE");
            System.out.println("  (Eligible in " + yearsToWait + " years)");
        }
        
        // Check Senior Citizen Benefits (60+ years)
        if (age >= 60) {
            System.out.println("✓ Senior Citizen Benefits: ELIGIBLE");
        } else {
            int yearsToWait = 60 - age;
            System.out.println("✗ Senior Citizen Benefits: NOT ELIGIBLE");
            System.out.println("  (Eligible in " + yearsToWait + " years)");
        }
        
        System.out.println("==========================================");
    }
    
    /**
     * Displays application footer.
     */
    private static void displayFooter() {
        System.out.println();
        System.out.println("Thank you for using Eligibility Checker!");
        System.out.println("Package: com.codegnan");
        System.out.println("==========================================");
    }
}
