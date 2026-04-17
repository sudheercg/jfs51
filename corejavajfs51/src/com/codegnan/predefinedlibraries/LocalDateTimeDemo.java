package com.codegnan.predefinedlibraries;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
	
	public static void main(String[] args) {
		
		//Current date and time
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime customDateTime = LocalDateTime.of(2026,4,14,10,15);
		System.out.println(customDateTime);
		
		//adding and subtract 
		LocalDateTime future= now.plusDays(5).plusHours(3);
		System.out.println(future);
		
		//extract values
		System.out.println(now.getYear());
		System.out.println(now.getHour());
		
	}

}
