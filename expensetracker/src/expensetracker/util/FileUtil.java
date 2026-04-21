package expensetracker.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import expensetracker.model.Expense;

public class FileUtil {

    private static final String FILE_NAME = "expenses.csv";

    // Read from file
    public static List<Expense> readFromFile() {
        List<Expense> expenses = new ArrayList<>();

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return expenses; // return empty list
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    expenses.add(Expense.parseExpense(line));
                } catch (IllegalArgumentException e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }

        return expenses;
    }

    // Write to file
    public static void writeToFile(List<Expense> expenses) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (Expense e : expenses) {
                bw.write(e.toCSV());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}