package com.codegnan.iodemos.charstreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {

			String line;

			System.out.println("Reading the file line by line by readLine()");

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
