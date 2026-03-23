package com.codegnan.threads;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        while (true) {

            // Menu
            System.out.println("\n=== Rock-Paper-Scissors ===");
            System.out.println("1. Play Game");
            System.out.println("2. View Score");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int menuChoice = sc.nextInt();

            switch (menuChoice) {

                case 1:
                    // Player input
                    System.out.print("Enter your choice (R/P/S): ");
                    char playerChoice = sc.next().toUpperCase().charAt(0);

                    // Validate input
                    if (playerChoice != 'R' && playerChoice != 'P' && playerChoice != 'S') {
                        System.out.println("❌ Invalid input! Please enter R, P, or S.");
                        break;
                    }

                    // Computer choice
                    int rand = random.nextInt(3);
                    char computerChoice;

                    if (rand == 0)
                        computerChoice = 'R';
                    else if (rand == 1)
                        computerChoice = 'P';
                    else
                        computerChoice = 'S';

                    // Display choices
                    System.out.println("Player Choice   : " + playerChoice);
                    System.out.println("Computer Choice : " + computerChoice);

                    // Game logic
                    if (playerChoice == computerChoice) {
                        System.out.println("🤝 It's a Tie!");
                        ties++;
                    } 
                    else if (
                        (playerChoice == 'R' && computerChoice == 'S') ||
                        (playerChoice == 'S' && computerChoice == 'P') ||
                        (playerChoice == 'P' && computerChoice == 'R')
                    ) {
                        System.out.println("🎉 You Win!");
                        playerWins++;
                    } 
                    else {
                        System.out.println("💻 Computer Wins!");
                        computerWins++;
                    }

                    break;

                case 2:
                    // Display score
                    System.out.println("\n📊 Score Board");
                    System.out.println("Player Wins   : " + playerWins);
                    System.out.println("Computer Wins : " + computerWins);
                    System.out.println("Ties          : " + ties);
                    break;

                case 3:
                    // Exit
                    System.out.println("👋 Thank you for playing!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid menu option. Try again.");
            }
        }
    }
}
