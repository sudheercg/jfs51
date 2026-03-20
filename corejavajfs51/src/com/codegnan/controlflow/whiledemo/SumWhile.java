package com.codegnan.controlflow.whiledemo;
import java.util.Scanner;

/**
 * Sum of N numbers using while loop
 */
public class SumWhile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int i = 1;
        
        while (i <= n) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum of 1 to " + n + " = " + sum);
        
        scanner.close();
    }
}
