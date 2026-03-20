package com.codegnan.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		try {
			
			// int result =10/0;
			
		System.out.println("try block");

		} catch (Exception e) {
			System.out.println("In Catch block");
		}
		finally {
			System.out.println("in finally block");
			System.out.println("Critical line");
		}
		
		 
	}
}