package com.codegnan.exceptionhandling;

public class InSufficientBalanceException extends Exception{
	
	
	/*
	 * private double balance; private double withDrawAmount;
	 */
	
	public InSufficientBalanceException(double balance, double withDrawaAmount) {
		
		super("Insufficient balance, available balance: "+balance+
				" But you have requested: "+withDrawaAmount);
		
		/*
		 * this.balance = balance; this.withDrawAmount= withDrawaAmount;
		 */
		
	}
	
	
	
	

}
