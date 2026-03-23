package com.codegnan.threads;

public class Demo {
	
	
	public static void meth3() {
		System.out.println("Meth3 started");
		System.out.println("Meth3 exited");
	}
	
	public static void meth2() {
		System.out.println("Meth2 started");
		meth3();
		System.out.println("Meth2 exited");
	}
	
	public static void meth1() {
		System.out.println("Meth1 started");
		meth2();
		System.out.println("Meth1 exited");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method");
		meth1();
		System.out.println("Main method exited");
	}

}
