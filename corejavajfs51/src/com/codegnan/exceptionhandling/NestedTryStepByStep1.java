package com.codegnan.exceptionhandling;
public class NestedTryStepByStep1 {

    public static void main(String[] args) {

        try {
            // STEP 1: Outer try starts
            System.out.println("Step 1: Outer try started");

            int[] arr = {10, 20, 30};

            // STEP 2: Safe operation (NO exception)
            System.out.println("Step 2: Access valid index: " + arr[1]);

            // STEP 3: Control reaches inner try → so it WILL execute
            try {
                System.out.println("Step 3: Inner try started");

                int a = 10;
                int b = 0;

                // STEP 4: Exception occurs INSIDE inner try
                int result = a / b; // ArithmeticException

                System.out.println(result); // won't execute

            } catch (ArithmeticException e) {
                // STEP 5: Inner catch handles exception
                System.out.println("Step 5: Inner catch handled: " + e);
            }

            // STEP 6: Outer try continues after inner block
            System.out.println("Step 6: Back to outer try");

        } catch (Exception e) {
            System.out.println("Outer catch");
        }

        // STEP 7: Program continues normally
        System.out.println("Step 7: Program ends");
    }
}