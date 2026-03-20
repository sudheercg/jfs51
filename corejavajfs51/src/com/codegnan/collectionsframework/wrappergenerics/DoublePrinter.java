package com.codegnan.collectionsframework.wrappergenerics;

public class DoublePrinter {
	
	Double value; 
	
	DoublePrinter(Double value){
		this.value=value;
		
	}
	
	public void print() {
		System.out.println(value);
	}

}
