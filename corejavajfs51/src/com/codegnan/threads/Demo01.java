package com.codegnan.threads;

public class Demo01 {
	
	public static void main(String[] args) {
		
	//	System.out.println(Thread.currentThread().getName());
		
		//create a MyThread object
		MyThread t = new MyThread();
		t.start();
		
		
		//
		for(int i =1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Main thread: "+i);
		}
	}

}
