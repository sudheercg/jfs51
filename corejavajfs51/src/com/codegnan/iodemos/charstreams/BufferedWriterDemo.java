package com.codegnan.iodemos.charstreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	
	
	public static void main(String[] args) {
		
		try(BufferedWriter bw = 
				new BufferedWriter(new FileWriter("output.txt"))){
			
			//write a string to the file
			bw.write("Hello Codegnan!!");
			
			//write a new line
			bw.newLine();
			
			//write another String
			bw.write("Buffered writer is faster for large text files");
            
			// always call flush() to write the data to file
			bw.flush(); 
			System.out.println("Data written successfully to output.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
