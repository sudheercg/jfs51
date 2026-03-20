package com.codegnan.controlflow.ifdemo;

import java.util.Scanner;

public class Snippet3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter email: ");
		String email = scanner.nextLine();

		if (email.contains("@") && email.contains(".")) {
		    System.out.println("Email format looks valid");
		} else {
		    System.out.println("Invalid email format!");
		}


		
	}
}

