package com.codegnan.oop.inheritance.overriding.rules.returntypes;

public class SavingsAccount extends BankAccount{

	@Override
	SavingsAccount createBankAccount(){
		System.out.println("Creating a SavingsBankAccount");
		return new SavingsAccount();
	}
	
	
}
