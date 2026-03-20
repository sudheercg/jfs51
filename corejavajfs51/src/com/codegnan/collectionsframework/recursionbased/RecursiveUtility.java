package com.codegnan.collectionsframework.recursionbased;

/**
 * Utility class with recursive operations.
 * Demonstrates recursion in practical scenarios.
 */
public class RecursiveUtility {
    
    /**
     * Calculate factorial recursively.
     * @param n number to calculate factorial
     * @return n!
     */
    public static long factorial(int n) {
        // Validation
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        } else {
            // Base case
            if (n == 0 || n == 1) {
                return 1;
            } else {
                // Recursive case
                return n * factorial(n - 1);
            }
        }
    }
    
    /**
     * Calculate sum of digits recursively.
     * @param n number
     * @return sum of digits
     */
    public static int sumOfDigits(int n) {
        // Handle negative numbers
        if (n < 0) {
            n = -n;
        } else {
            // continue
        }
        
        // Base case
        if (n < 10) {
            return n;
        } else {
            // Recursive case: last digit + sum of remaining
            return (n % 10) + sumOfDigits(n / 10);
        }
    }
    
    /**
     * Reverse a number recursively.
     * @param n number to reverse
     * @return reversed number
     */
    public static int reverseNumber(int n) {
        return reverseHelper(n, 0);
    }
    
    private static int reverseHelper(int n, int reversed) {
        // Base case
        if (n == 0) {
            return reversed;
        } else {
            // Recursive case
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            return reverseHelper(n / 10, reversed);
        }
    }
    
    /**
     * Check if number is palindrome recursively.
     * @param n number to check
     * @return true if palindrome
     */
    public static boolean isPalindrome(int n) {
        if (n < 0) {
            return false;
        } else {
            return n == reverseNumber(n);
        }
    }
    
    /**
     * Calculate power recursively.
     * @param base base number
     * @param exponent power
     * @return base^exponent
     */
    public static long power(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponent not supported");
        } else {
            // Base case
            if (exponent == 0) {
                return 1;
            } else {
                // Recursive case
                return base * power(base, exponent - 1);
            }
        }
    }
    
    /**
     * Calculate GCD recursively (Euclidean algorithm).
     * @param a first number
     * @param b second number
     * @return GCD of a and b
     */
    public static int gcd(int a, int b) {
        // Make both positive
        if (a < 0) {
            a = -a;
        } else {
            // continue
        }
        if (b < 0) {
            b = -b;
        } else {
            // continue
        }
        
        // Base case
        if (b == 0) {
            return a;
        } else {
            // Recursive case
            return gcd(b, a % b);
        }
    }
    
    /**
     * Calculate Fibonacci number recursively.
     * @param n position in sequence
     * @return nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Position cannot be negative");
        } else {
            // Base cases
            if (n == 0) {
                return 0;
            } else {
                if (n == 1) {
                    return 1;
                } else {
                    // Recursive case
                    return fibonacci(n - 1) + fibonacci(n - 2);
                }
            }
        }
    }
    
    /**
     * Count digits recursively.
     * @param n number
     * @return count of digits
     */
    public static int countDigits(int n) {
        // Handle negative
        if (n < 0) {
            n = -n;
        } else {
            // continue
        }
        
        // Base case
        if (n < 10) {
            return 1;
        } else {
            // Recursive case
            return 1 + countDigits(n / 10);
        }
    }
    
    /**
     * Print numbers from 1 to n recursively.
     * @param n upper limit
     */
    public static void printNumbers(int n) {
        if (n <= 0) {
            return;
        } else {
            printNumbers(n - 1);  // Recursive call first
            System.out.print(n + " ");
        }
    }
    
    /**
     * Calculate sum from 1 to n recursively.
     * @param n upper limit
     * @return sum of 1 to n
     */
    public static int sumRange(int n) {
        if (n <= 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {
                return n + sumRange(n - 1);
            }
        }
    }
}
