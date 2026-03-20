package com.codegnan.recursion;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int factorial(int n) {
		if (n == 0) { // Base case
			return 1;
		}
		return n * factorial(n - 1); // Recursive call
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int num = sc.nextInt();
	
	    int result = factorial(num);
	    System.out.println("Factorial of " + num + " is: " + result);
	}
}


/*first call n=3
 * factorial(3) 
 * n is not 0,
 * 
 * n*factorial(n-1)
 *  3*factorial(2)= 3*2
 *     factorial(2)= 2* factorial(1)= 2*1=2
 *       factorial(1)= 1* factorial(0)=1
 *       
 *       
 *       
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
