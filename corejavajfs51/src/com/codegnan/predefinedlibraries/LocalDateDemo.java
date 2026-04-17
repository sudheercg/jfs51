package com.codegnan.predefinedlibraries;

import java.time.LocalDate;

public class LocalDateDemo {
	
	public static void main(String[] args) {
		
		
		//To get current date or system date
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
	
		// get individual fields
	   System.out.println(today.getDayOfMonth());
	   System.out.println(today.getYear());
	   System.out.println(today.getDayOfWeek());
	   
	   //add or substract days - creates new LocalDate objects
	   LocalDate nextWeek = today.plusDays(7);
	   System.out.println(nextWeek);
	   
	   LocalDate lastMonth= today.minusMonths(1);
	   System.out.println(lastMonth);
	   
	   
	   // create specific date by passing yeare, month and day
	   LocalDate customDate=LocalDate.of(2026,4,15);
	   System.out.println(customDate);
	   
	   

	
	}
	

}
