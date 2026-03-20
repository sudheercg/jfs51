package com.codegnan.collectionsframework.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		ArrayList<String> countriesList = new ArrayList<>();
		countriesList.add("India");
		countriesList.add("Singapore");
		countriesList.add("Taipei");
		countriesList.add("Canada");
		countriesList.add("Australia");
		
		  ListIterator<String>  lIter= countriesList.listIterator();
		  while(lIter.hasNext()) {
			  String country = lIter.next();
			 
			  if(country.equals("Taipei")) {
				  lIter.set("Chinese Taipei");
			  }
			 
		  }
		  
		 System.out.println("Backward");
		  
		  while(lIter.hasPrevious()) {
			System.out.println(lIter.previous());
			 
		  }
		  
	}
	
	

}
