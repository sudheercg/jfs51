package com.codegnan.threads.joindemo;

//Create a class that implements Runnable
public class MyRunnableTask implements Runnable{

	@Override
	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("MyRunnableTask thread: "+i);
		}

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
