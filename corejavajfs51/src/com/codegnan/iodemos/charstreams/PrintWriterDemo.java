package com.codegnan.iodemos.charstreams;

import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void main(String[] args) {
		
		
		try(PrintWriter pw = new PrintWriter(new FileWriter("pw.txt"))){
			
			pw.print("Hello");
			pw.print("Codegnan");
			
			pw.println(100);
			pw.println(43.34);
			pw.println(true);
			
			pw.printf("Course:  %s, Duration: %d", "Java", 100);

			
			
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
