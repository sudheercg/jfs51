package com.codegnan.exceptionhandling;

public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount("ACC001", 5000);
		
		try {
		account.deposit(1000);
		System.out.println("Balance Rs. "+ account.getBalance());
		}catch(InvalidAmountException a) {
			System.out.println("Error: "+a.getMessage());
		}
		
		try {
		account.withdraw(2000);
		System.out.println("Balance Rs. "+ account.getBalance());

		}catch(InSufficientBalanceException a) {
			System.out.println("Error: "+a.getMessage());
		}
		catch(InvalidAmountException i) {
			System.out.println("Error: "+i.getMessage());
		}
		
		
	}
	

}
