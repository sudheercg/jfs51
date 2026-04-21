package expensetraker.service;

import expensetraker.model.Expense;

public class ExpenseService {

    private Expense[] expenses = new Expense[100];
    private int count = 0;

    // Add Expense
    public void addExpense(String description, double amount, String category) {
        if (count >= expenses.length) {
            System.out.println("❌ Cannot add more expenses. Limit reached!");
            return;
        }

        expenses[count] = new Expense(description, amount, category);
        count++;
        System.out.println("✅ Expense added successfully.");
    }

    // View All Expenses
    public void viewAllExpenses() {
        if (count == 0) {
            System.out.println("⚠️ No expenses found.");
            return;
        }

        System.out.println("\nAll Expenses:");
        for (int i = 0; i < count; i++) {
            System.out.println(expenses[i]);
        }
    }

    // View Expenses by Category
    public void viewExpensesByCategory(String category) {
        boolean found = false;

        System.out.println("\nExpenses in category '" + category + "':");
        for (int i = 0; i < count; i++) {
            if (expenses[i].getCategory().equalsIgnoreCase(category)) {
                System.out.println(expenses[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("⚠️ No expenses found in this category.");
        }
    }

    // Calculate Total
    public double calculateTotalExpenses() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += expenses[i].getAmount();
        }
        return total;
    }

    // Get Count
    public int getCount() {
        return count;
    }
}