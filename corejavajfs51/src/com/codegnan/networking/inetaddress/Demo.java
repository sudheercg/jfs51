package com.codegnan.networking.inetaddress;

public class Demo {
	
	
	public static void method1() throws ArithmeticException {
		int result =10/0;
	}
	
	public static void main(String[] args) {
		
		try {
		method1();
		}catch(ArithmeticException e) {
			System.out.println("Dividing by zero, please check.");
		}
		System.out.println("Program ends");
	}

}
