package com.codegnan;

public class Demo {
	
	public static void main(String[] args) {
		
		int firstNum =10;  
		
		int secondNum=0;
		
		int divisionResult=0;
		
		try {
		 divisionResult = firstNum / secondNum; 
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println(divisionResult);
		
		System.out.println("Program exited");
		
	}

}
