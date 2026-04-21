package com.codegnan.codereviews;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVExample {

    public static void main(String[] args) {

        String filePath = "expenses.csv";

        try (
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
        ) {
            String line;

            while ((line = br.readLine()) != null) {

                // Split CSV line
                String[] data = line.split(",");

                // Print each column
                for (String value : data) {
                    System.out.print(value + " | ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}