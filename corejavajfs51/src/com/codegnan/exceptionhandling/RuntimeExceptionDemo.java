package com.codegnan.exceptionhandling;

public class RuntimeExceptionDemo {
	
	public static void main(String[] args) {
		//Runtime exception
		try {
		System.out.println(30/0);
		}catch(ArithmeticException a) {
			a.printStackTrace();
		}
		
		System.out.println("Remaining code....");
		
	}

}
