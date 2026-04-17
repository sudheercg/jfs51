package com.codegnan.predefinedlibraries;

import java.time.LocalTime;

public class LocalTimeDemo {
	
	public static void main(String[] args) {
		
		//returns the current time 
		LocalTime now = LocalTime.now();
		
		//creates a custom  LocalTime object for the given values
		LocalTime customeTime = LocalTime.of(14,30,45);
		
		
		LocalTime beforeTenMinutes=  now.minusMinutes(10);
	
	     LocalTime afterTowHours = now.plusHours(2);
	     
	     now.getHour();
	     now.getMinute(); 
	
	
	}

}
