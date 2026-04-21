package com.codegnan.threads.joindemo;

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		
		//create a Runnable object
		MyRunnableTask task = new MyRunnableTask();
		//pass runnable obj reference to Thread constructor
		Thread t = new Thread(task);
		
		//t.setPriority(Thread.MAX_PRIORITY);
		//start the thread
		t.start();
		
		
		try {
			
			// main thread waits for child thread to finish
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i  =0;i<=5; i++) {
			System.out.println("Main Thread: "+i);
		}
		
		
	
		
		
		
	}

}
