package com.codegnan.collectionsframework.wrappergenerics;

public class StringPrinter {
	
	String myString; 
	
	StringPrinter(String myString){
		this.myString= myString; 
	}
	
	public void print() {
		System.out.println(myString);
	}

}
