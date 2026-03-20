package com.codegnan.collectionsframework.wrappergenerics;


// A Generic Printer class
public class Printer<T> {
	
	T value; 
	
	Printer(T value){
		this.value=value; 
	}
	
	public void print() {
		System.out.println(value);
	}

}
