package expensetracker.service;

import java.util.ArrayList;
import java.util.List;

import expensetracker.model.Expense;
import expensetracker.util.FileUtil;

public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();

    // Load data at startup
    public void loadExpenses() {
        expenses = FileUtil.readFromFile();
    }

    // Save data
    public void saveExpenses() {
        FileUtil.writeToFile(expenses);
    }

    // Add Expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        saveExpenses();
    }

    // Get all
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    // Filter by category
    public List<Expense> getExpensesByCategory(String category) {
        List<Expense> filtered = new ArrayList<>();

        for (Expense e : expenses) {
            if (e.getCategory().equalsIgnoreCase(category)) {
                filtered.add(e);
            }
        }

        return filtered;
    }

    // Total
    public double calculateTotalExpenses() {
        double total = 0;

        for (Expense e : expenses) {
            total += e.getAmount();
        }

        return total;
    }
}