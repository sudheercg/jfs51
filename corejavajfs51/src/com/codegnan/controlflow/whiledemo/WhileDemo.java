package com.codegnan.controlflow.whiledemo;
/**
 * while loop demonstration
 */
public class WhileDemo {
    
    public static void main(String[] args) {
        int i = 1;
        
        while (i <= 5) {
            System.out.println(i);
            i++;  // CRITICAL: Must update to avoid infinite loop
        }
    }
}
