package com.codegnan.oop.abstraction.paymentsystem;

public class CreditCardPayment extends Payment {

	private String cardNumber;
	private String cardHolderName;
	private String cvv;
	private String expiryDate;

	public CreditCardPayment(String paymentId, double amount, String cardNumber, String cardHolderName, String cvv,
			String expiryDate) {
		super(paymentId, amount);
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	@Override
	boolean validatePayment() {

		if (cardNumber.length() != 16) {
			System.out.println("Invalid card number");
			return false;
		} else {
			if (cvv.length() != 3) {
				System.out.println("Invalid CVV");
				return false;
			} else {
				if (cardHolderName.isEmpty()) {
					System.out.println("Invalid Card Holder Name! ");
					return false;
				} else {
					System.out.println("Credit card validation successful");
					return true;
				}
			}

		}
	}

	@Override
	public boolean processPayment() {
		System.out.println("Processing credit card payment...");
		//System.out.println("Card: **** **** **** " + cardNumber.substring(12));
		System.out.println("Amount: $" + getAmount());

		// Simulate payment processing
		if (getAmount() > 10000) {
			System.out.println("Amount exceeds credit limit!");
			return false;
		} else {
			System.out.println("Credit card payment processed!");
			return true;
		}
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

}
