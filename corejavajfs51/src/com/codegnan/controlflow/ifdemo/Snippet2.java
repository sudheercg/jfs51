package com.codegnan.controlflow.ifdemo;

import java.util.Scanner;

public class Snippet2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age (1-120): ");
		int age = scanner.nextInt();

		if (age >= 1 && age <= 120) {
		    System.out.println("Valid age!");
		} else {
		    System.out.println("Age must be between 1 and 120!");
		}

		
	}
}

