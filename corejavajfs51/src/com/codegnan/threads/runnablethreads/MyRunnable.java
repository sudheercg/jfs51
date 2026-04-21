package com.codegnan.threads.runnablethreads;

// Thread creation using Runnable interface (Lambda)
public class MyRunnable {

    public static void main(String[] args) {

        // Creation of a Runnable thread using Lambda expression
        Runnable r = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread running from Lambda: " + i);
            }
        };

        Thread t = new Thread(r);
        t.start();
    }
}