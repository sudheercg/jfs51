package com.codegnan.oop;

public class BankAccount {
	
	//instance variables
	private String accountHolderName;	
	private int accountNumber;
	private double balance; 
	
	
	
	//no arg constructor
	BankAccount(){
		this("Unknown",1,1.1);
		System.out.println("Constructor called");
	}
	
	
	//constructor with arguments
	BankAccount(String accountHolderName, int accountNumber, double balance){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
				
		
	}
	
	BankAccount(String accountHolderName, int accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		
	}
	
	BankAccount(String accountHolderName){
		this.accountHolderName = accountHolderName;
		
	}
	
	
	//getter -Accessors
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	
	//setter - mutators
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName=accountHolderName;
	}
	
	
	
	public void displayBankDetail() {
		System.out.println();
		System.out.println("Dispay Bank Details for "+accountHolderName);
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
		System.out.println(balance);
		System.out.println("==============================================");
	}
	

}
