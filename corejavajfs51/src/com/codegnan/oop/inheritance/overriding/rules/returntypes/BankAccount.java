package com.codegnan.oop.inheritance.overriding.rules.returntypes;

public class BankAccount {

	
	
	/*
	 * BankAccount createAccount(){
	 * System.out.println("Creating a generic account"); BankAccount account = new
	 * BankAccount(); return account; }
	 */
	
	BankAccount createBankAccount(){
		System.out.println("Creating a generic account");
		return new BankAccount();
	}
	
	
	
	
	
}
