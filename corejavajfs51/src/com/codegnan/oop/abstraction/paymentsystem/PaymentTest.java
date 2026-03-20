package com.codegnan.oop.abstraction.paymentsystem;

public class PaymentTest {
	
	public static void main(String[] args) {
		
		System.out.println("Credit card Payment");
		
		/*
		 * String paymentId, double amount, String cardNumber, String cardHolderName,
		 * String cvv, String expiryDate
		 */
		
		CreditCardPayment creditCard = new CreditCardPayment("CC001",5000,"1234567898765432",
				"Raj Kumar","123","12/26");
		creditCard.initiatePayment();
		creditCard.displayPaymentInfo();
		
	}

}
