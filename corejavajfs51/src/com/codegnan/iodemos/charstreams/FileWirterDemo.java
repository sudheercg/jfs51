package com.codegnan.iodemos.charstreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWirterDemo {

	public static void main(String[] args) {

		/*
		 * File f = new File("iostream.txt"); f.createNewFile(); FileWriter write = new
		 * FileWriter(f);
		 */

		File file = new File("pledge.txt");

		// FileWriter writer = new FileWriter("pledge.txt");

		// FileWriter writer = new FileWriter(file);

		// FileWriter writer =new FileWriter("pledge.txt", true);

		FileWriter writer = null;
		try {
			writer = new FileWriter(file, true);
			writer.write("India is my country");
			writer.write("\nI love my country");

			char[] charArray = { 'a', 'e', 'i', 'o', 'u' };
			writer.write(charArray);
			writer.flush();

			// writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

		System.out.println();

	}

}
