package expensetraker.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import expensetraker.service.ExpenseService;

public class ExpenseTrackerApp {

    private static Scanner scanner = new Scanner(System.in);
    private static ExpenseService service = new ExpenseService();

    public static void main(String[] args) {

        while (true) {
            showMenu();

            try {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                handleUserChoice(choice);

            } catch (InputMismatchException e) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    // Menu
    private static void showMenu() {
        System.out.println("\n====== Expense Tracker Menu ======");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. View Expenses by Category");
        System.out.println("4. Calculate Total Expenses");
        System.out.println("5. Exit");
        System.out.println("=================================");
    }

    // Handle Choices
    private static void handleUserChoice(int choice) {

        switch (choice) {

            case 1:
                String desc = readStringInput("Enter description: ");
                double amount = readDoubleInput("Enter amount: ");
                String category = readStringInput("Enter category: ");
                service.addExpense(desc, amount, category);
                break;

            case 2:
                service.viewAllExpenses();
                break;

            case 3:
                String cat = readStringInput("Enter category: ");
                service.viewExpensesByCategory(cat);
                break;

            case 4:
                double total = service.calculateTotalExpenses();
                System.out.println("💰 Total Expenses: " + total);
                break;

            case 5:
                System.out.println("👋 Exiting application...");
                System.exit(0);

            default:
                System.out.println("❌ Invalid choice! Try again.");
        }
    }

    // Input Helpers
    private static String readStringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static double readDoubleInput(String message) {
        while (true) {
            try {
                System.out.print(message);
                double value = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                return value;
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter a valid number.");
                scanner.nextLine(); // clear invalid input
            }
        }
    }
}