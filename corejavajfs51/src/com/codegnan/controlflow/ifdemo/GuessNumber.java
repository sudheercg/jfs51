package com.codegnan.controlflow.ifdemo;

import java.util.Scanner;

/**
 * Number guessing game using do-while
 */
public class GuessNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int secretNumber = 42;
        int guess;
        int attempts = 0;
        
        System.out.println("=== Guess the Number Game ===");
        System.out.println("I'm thinking of a number between 1-100");
        
        do {
            System.out.print("\nEnter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    // guess == secretNumber
                }
            }
            
        } while (guess != secretNumber);
        
        System.out.println("\nCorrect! You guessed it in " + attempts + " attempts.");
        
        scanner.close();
    }
}
