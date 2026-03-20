package com.codegnan.collectionsframework.listimpls;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//ArrayList is dynamic
		//ArrayList allows heterogeneous
		//ArrayList automatically increases the size
		//ArrayList maintains insertion order. 
		
		ArrayList<String> countriesList = new ArrayList<>();
		countriesList.add("India");
		countriesList.add("Singapore");
		countriesList.add("Taiwan");
		countriesList.add("Canada");
		countriesList.add("Australia");
		System.out.println("Countries before sorting: "+countriesList);
		Collections.sort(countriesList);
	    System.out.println("Countries after sorting: "+countriesList);
		
		
	}
	
	

}
