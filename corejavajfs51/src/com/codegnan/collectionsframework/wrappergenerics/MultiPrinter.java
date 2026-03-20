package com.codegnan.collectionsframework.wrappergenerics;


// A Generic Printer class
public class MultiPrinter<T, U> {
	
	T value1; 
	U value2;
	
	MultiPrinter(T value1, U value2){
		this.value1=value1; 
		this.value2=value2;
	}
	
	public void print() {
		System.out.println(value1);
		System.out.println(value2);
	}

}
