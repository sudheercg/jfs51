package com.codegnan.predefinedlibraries;

import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		//Epoch date: January 1, 1970, 00:00:00
		//Create Date object. 
		
		//When Date is created with Date default constructor
		//it automatically takes current system time. 
		
		Date d1 = new Date();
		System.out.println(d1);
		
		
		// adding 11 days to the Epoch date
		Date d2 = new Date(1000000000);
		System.out.println(d2);//Mon Jan 12 19:16:40 IST 1970
		
		//using getTime() method gives milliseconds from Epoch time
	    //getTime() method converts the date into milliseconds
		//Used for comparisions, calculations
		System.out.println(d1.getTime()); 
		
		//setTime(); 
		// modify the existing date object
		
		//setTime(0) will set date to epoch time. 
		d1.setTime(0);
		System.out.println(d1);
		
		
		// Future date object creation
		
	   Date currentDate = new Date(); 
	   Date futureDate= new Date(System.currentTimeMillis()+10000);
	   System.out.println(futureDate);
	   
	   //Date comparision
	   
	   //before(Date date)
	   System.out.println(currentDate.before(futureDate));
	   
	   //after()
	   
	   System.out.println(currentDate.after(futureDate));
	   
	   
	   //compare Dates using compareTo() method
	   //it returns negative value if date1 < date2
	   //returns zero if both dates are equal
	   // returns positive if date1 > date2 
	   
	   
	   System.out.println(currentDate.compareTo(futureDate));

	   
	   // equals(Object o)
	   
	   // checks if two dates are exactly equal
	   
	   Date today = new Date(); 
	   System.out.println(currentDate.equals(futureDate)); //false
	   
	   System.out.println(currentDate.equals(today));//true
	   
		
		
		
		
		
		
		
		
		
	}

}
