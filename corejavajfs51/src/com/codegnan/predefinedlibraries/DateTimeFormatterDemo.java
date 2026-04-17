package com.codegnan.predefinedlibraries;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
	
	public static void main(String[] args) {
		
		//current date time
		LocalDateTime now = LocalDateTime.now(); 
		
		//Define the formatter pattern
		DateTimeFormatter formatter =
				 DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//Format DateTime
		String formatted = now.format(formatter);
		System.out.println("Formatted: "+ formatted);
		
		
		//Parsse : String-> DateTime
		String input = "15-04-2026 11:30:00";
		
		LocalDateTime parsed = LocalDateTime.parse(input, formatter);
		System.out.println("Parsed DateTime: "+parsed);
		
	}

}
