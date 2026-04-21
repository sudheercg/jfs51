package com.codegnan.threads.synchronizeddemo;

public class Counter {
	
	int count=0;
	
	public synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count; 
	}

}
