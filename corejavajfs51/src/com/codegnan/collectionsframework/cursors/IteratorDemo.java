package com.codegnan.collectionsframework.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> countriesList = new ArrayList<>();
		countriesList.add("India");
		countriesList.add("Singapore");
		countriesList.add("Taiwan");
		countriesList.add("Canada");
		countriesList.add("Australia");
		
		System.out.println("Before removal: "+countriesList);
		System.out.println("After removal:: ");
		Iterator<String> itr = countriesList.iterator();
		while(itr.hasNext()) {
			String  country = itr.next();
			
			if(country.equals("Taiwan")) {
				itr.remove(); 
			}
			//System.out.println(country);
		}
		
		System.out.println("After Removal: "+countriesList);
		
		//LinkedList implementation of Queue
		//queue style  operations
		
		//add element to end
		
		
		
		
		
		
		
		
		
		
	}

}
