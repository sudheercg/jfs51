package com.codegnan.oop.abstraction.paymentsystem;

abstract class Payment {
	
	// initiate payment  - concrete
	// validate the payment - abstract
	// process payment - abstract
	//displayPaymentInfo - Concrete method
	
	
	private String paymentId;
	private double amount;
	private String status;//PENDING,SUCCESS, FAILED\
	
	
	public Payment(String paymentId, double amount) {
		this.paymentId=paymentId;
		this.amount=amount; 
		
	}
	
	//child classes must provide the implementation
	abstract boolean validatePayment();
	
	//child class must implement processPayment()
	public abstract boolean processPayment();
	
	//used by all child classes 
	public void displayPaymentInfo() {	
		System.out.println("Payment ID: " + paymentId);
        System.out.println("Amount: $" + amount);
        System.out.println("Status: " + status);
	}
	
	
	//concrete method which can be used by all child classes. 
	public void initiatePayment() {
		
		if(amount<=0) {
			System.out.println("Invalid amount");
			status="FAILED";
		}else {
			if(validatePayment()) {
				if(processPayment()) {
					status="SUCCESS";
					System.out.println("Payment is successful");
				}
				else {
					status ="FAILED";
					System.out.println("Payment validatiaon failed");
				}
			}
			
		}
		
		
		
		
		
		
	}
	
	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
