package com.codegnan.iodemos.charstreams;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWirterDemo2 {

	public static void main(String[] args) {

		/*
		 * File f = new File("iostream.txt"); f.createNewFile(); FileWriter write = new
		 * FileWriter(f);
		 */

		File file = new File("pledge.txt");

		// FileWriter writer = new FileWriter("pledge.txt");

		// FileWriter writer = new FileWriter(file);

		// FileWriter writer =new FileWriter("pledge.txt", true);

		
		//try with resources
		try(FileWriter writer = new FileWriter(file, false)) {
			
			writer.write("India is my country");
			writer.write("\nI love my country");

			char[] charArray = { 'a', 'e', 'i', 'o', 'u' };
			writer.write("\n");
			writer.write(charArray);
			writer.flush();

			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

	}

}
