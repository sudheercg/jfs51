package com.codegnan.controlflow.continuebreak;

/**
 * break statement demonstration
 */
public class BreakDemo {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Exit loop when i is 5
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Loop exited");
    }
}
