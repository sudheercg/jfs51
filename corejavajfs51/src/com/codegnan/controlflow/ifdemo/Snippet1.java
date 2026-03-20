package com.codegnan.controlflow.ifdemo;

import java.util.Scanner;

public class Snippet1 {
	public static void main(String[] args) {
		System.out.print("Enter age: ");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
		    int age = scanner.nextInt();
		    System.out.println("Valid integer entered: " + age);
		} else {
		    System.out.println("Error: Please enter a valid integer!");
		    scanner.next();  // Clear invalid input
		}
		
	}
}

