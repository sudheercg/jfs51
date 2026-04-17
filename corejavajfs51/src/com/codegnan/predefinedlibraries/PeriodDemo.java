package com.codegnan.predefinedlibraries;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	
	public static void main(String[] args) {
		
		LocalDate start= LocalDate.of(2000,1,1);
		LocalDate end = LocalDate.now();
		
		//calculate the difference 
		Period period = Period.between(start, end);
		
		
		//
		System.out.println("Years: "+period.getYears());
		System.out.println("Months: "+ period.getMonths());
		System.out.println("Days: "+ period.getDays());
	}

}
