package com.codegnan.threads;

public class Demo03 {
	
	public static void main(String[] args) {
		
		
		//Step1: Crate Runnable object
		MyRunnable obj = new MyRunnable(); 
		
		//step2: Pass Runnable to Thread
		Thread t1 = new Thread(obj);
		
		//step3: start the thread
		t1.start();
		
		
		
		
		
		
	}

}
