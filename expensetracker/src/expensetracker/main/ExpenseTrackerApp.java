package expensetracker.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import expensetracker.model.Expense;
import expensetracker.service.ExpenseService;

public class ExpenseTrackerApp {

    private static Scanner scanner = new Scanner(System.in);
    private static ExpenseService service = new ExpenseService();

    public static void main(String[] args) {

        service.loadExpenses(); // load data at start

        while (true) {
            showMenu();

            try {
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                handleUserChoice(choice);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static void showMenu() {
        System.out.println("\nExpense Tracker Menu:");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. View Expenses by Category");
        System.out.println("4. Calculate Total Expenses");
        System.out.println("5. Exit");
    }

    private static void handleUserChoice(int choice) {

        switch (choice) {

            case 1:
                try {
                    System.out.print("Enter description: ");
                    String desc = scanner.nextLine();

                    System.out.print("Enter amount: ");
                    double amt = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Enter category: ");
                    String cat = scanner.nextLine();

                    Expense expense = new Expense(desc, amt, cat);
                    service.addExpense(expense);

                    System.out.println("Expense added.");

                } catch (InputMismatchException e) {
                    System.out.println("Invalid amount entered.");
                    scanner.nextLine();
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                List<Expense> all = service.getAllExpenses();

                if (all.isEmpty()) {
                    System.out.println("No expenses found.");
                } else {
                    System.out.println("\nAll Expenses:");
                    for (Expense e : all) {
                        System.out.println(e);
                    }
                }
                break;

            case 3:
                System.out.print("Enter category to filter by: ");
                String category = scanner.nextLine();

                List<Expense> filtered = service.getExpensesByCategory(category);

                if (filtered.isEmpty()) {
                    System.out.println("No expenses found.");
                } else {
                    System.out.println("\nExpenses in category '" + category + "':");
                    for (Expense e : filtered) {
                        System.out.println(e);
                    }
                }
                break;

            case 4:
                double total = service.calculateTotalExpenses();
                System.out.println("Total Expenses: " + total);
                break;

            case 5:
                System.out.println("Goodbye!");
                System.exit(0);

            default:
                System.out.println("Invalid choice.");
        }
    }
}