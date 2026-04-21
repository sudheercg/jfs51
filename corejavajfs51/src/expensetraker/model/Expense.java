package expensetraker.model;

public class Expense {

    private String description;
    private double amount;
    private String category;

    // Constructor
    public Expense(String description, double amount, String category) {
        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // Getters
    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    // toString()
    @Override
    public String toString() {
        return description + " - " + amount + " (" + category + ")";
    }
}