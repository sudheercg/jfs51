package expensetracker.model;

public class Expense {

    private String description;
    private double amount;
    private String category;

    // Constructor
    public Expense(String description, double amount, String category) {
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be empty");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        this.description = description;
        this.amount = amount;
        this.category = category;
    }

    // Getters
    public String getDescription() { return description; }
    public double getAmount() { return amount; }
    public String getCategory() { return category; }

    // Convert to CSV
    public String toCSV() {
        return description + "," + amount + "," + category;
    }

    // Convert CSV to Object
    public static Expense parseExpense(String line) {
        String[] parts = line.split(",");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid CSV format: " + line);
        }

        String desc = parts[0];
        double amt = Double.parseDouble(parts[1]);
        String cat = parts[2];

        return new Expense(desc, amt, cat);
    }

    @Override
    public String toString() {
        return description + " - " + amount + " (" + category + ")";
    }
}