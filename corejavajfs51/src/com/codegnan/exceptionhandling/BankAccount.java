package com.codegnan.exceptionhandling;

public class BankAccount {

	private String accountNumber;
	private double balance;

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;

	}
	
	
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<=0) {
			 throw new InvalidAmountException("Deposit amount must be positive");
		}
		else {
			balance = balance+amount; 
		}
		
		
	}
	
	public void withdraw(double amount) throws InvalidAmountException,InSufficientBalanceException {
		
		if(amount<=0) {
			 throw new InvalidAmountException("Withdraw amount must be positive");
		}else {
			if(amount>balance) {
				throw new InSufficientBalanceException(balance, amount) ;
			}else {
				//balance = balance-amount;
				  balance-=amount;
				  System.out.printf("Withdrawn: Rs. %.2f%n",amount);
			}
		}
		
		
		
		
	}
	
	
	
	//getters and setters

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
