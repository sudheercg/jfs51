package com.codegnan.threads;

@FunctionalInterface
interface MyInterface {
	
	
	
	void display();
	
	
	
	//any number of default and static methods. 
	
	default void myMethod() {
		System.out.println("Default method");
	}
	
	static void staticMethod() {
		
		System.out.println("This is tatic method");
	}

}
