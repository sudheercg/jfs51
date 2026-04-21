package com.codegnan.codereviews;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVExample {

    public static void main(String[] args) {

        String filePath = "expenses.csv";

        try (
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);
        ) {
            // Writing header
            bw.write("Description,Amount,Category");
            bw.newLine();

            // Writing data
            bw.write("Lunch,150,Food");
            bw.newLine();

            bw.write("Bus Ticket,50,Travel");
            bw.newLine();

            bw.write("Movie,300,Entertainment");
            bw.newLine();

            System.out.println("CSV file written successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}