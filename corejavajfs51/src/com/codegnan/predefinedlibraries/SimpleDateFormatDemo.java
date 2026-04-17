package com.codegnan.predefinedlibraries;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	
	public static void main(String[] args) throws ParseException {
		
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		String formattedDate1 = sdf1.format(currentDate);
		System.out.println(formattedDate1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String formattedDate2=sdf2.format(currentDate);
		System.out.println(formattedDate2);
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("EEEE, MMMM dd,yyyy");
		String formattedDate3= sdf3.format(currentDate);
		System.out.println(formattedDate3);
		
		
		//parse()  - converts a String to Date
		
		String dateString ="15-04-2026";
		Date parsedDate= sdf1.parse(dateString);
		System.out.println(parsedDate);
		
		
		
		
	}
	

}
