package com.codegnan.collectionsframework.recursionbased;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive tests for RecursiveUtility.
 */
public class RecursiveUtilityTest {
    
    // ===== FACTORIAL TESTS =====
    
    @Test
    public void testFactorial_Zero() {
        assertEquals(1, RecursiveUtility.factorial(0));
    }
    
    @Test
    public void testFactorial_One() {
        assertEquals(1, RecursiveUtility.factorial(1));
    }
    
    @Test
    public void testFactorial_Five() {
        assertEquals(120, RecursiveUtility.factorial(5));
    }
    
    @Test
    public void testFactorial_Ten() {
        assertEquals(3628800, RecursiveUtility.factorial(10));
    }
    
    @Test
    public void testFactorial_Negative_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RecursiveUtility.factorial(-5);
        });
    }
    
    // ===== SUM OF DIGITS TESTS =====
    
    @Test
    public void testSumOfDigits_SingleDigit() {
        assertEquals(5, RecursiveUtility.sumOfDigits(5));
    }
    
    @Test
    public void testSumOfDigits_MultipleDigits() {
        assertEquals(10, RecursiveUtility.sumOfDigits(1234));
    }
    
    @Test
    public void testSumOfDigits_Zero() {
        assertEquals(0, RecursiveUtility.sumOfDigits(0));
    }
    
    @Test
    public void testSumOfDigits_NegativeNumber() {
        assertEquals(10, RecursiveUtility.sumOfDigits(-1234));
    }
    
    @Test
    public void testSumOfDigits_LargeNumber() {
        assertEquals(45, RecursiveUtility.sumOfDigits(123456789));
    }
    
    // ===== REVERSE NUMBER TESTS =====
    
    @Test
    public void testReverseNumber_SingleDigit() {
        assertEquals(5, RecursiveUtility.reverseNumber(5));
    }
    
    @Test
    public void testReverseNumber_MultipleDigits() {
        assertEquals(4321, RecursiveUtility.reverseNumber(1234));
    }
    
    @Test
    public void testReverseNumber_WithZeros() {
        assertEquals(21, RecursiveUtility.reverseNumber(120));
    }
    
    @Test
    public void testReverseNumber_Zero() {
        assertEquals(0, RecursiveUtility.reverseNumber(0));
    }
    
    // ===== PALINDROME TESTS =====
    
    @Test
    public void testIsPalindrome_True_SingleDigit() {
        assertTrue(RecursiveUtility.isPalindrome(5));
    }
    
    @Test
    public void testIsPalindrome_True_MultipleDigits() {
        assertTrue(RecursiveUtility.isPalindrome(12321));
    }
    
    @Test
    public void testIsPalindrome_False() {
        assertFalse(RecursiveUtility.isPalindrome(1234));
    }
    
    @Test
    public void testIsPalindrome_NegativeNumber() {
        assertFalse(RecursiveUtility.isPalindrome(-121));
    }
    
    // ===== POWER TESTS =====
    
    @Test
    public void testPower_ZeroExponent() {
        assertEquals(1, RecursiveUtility.power(5, 0));
    }
    
    @Test
    public void testPower_OneExponent() {
        assertEquals(5, RecursiveUtility.power(5, 1));
    }
    
    @Test
    public void testPower_NormalCase() {
        assertEquals(8, RecursiveUtility.power(2, 3));
    }
    
    @Test
    public void testPower_LargeExponent() {
        assertEquals(1024, RecursiveUtility.power(2, 10));
    }
    
    @Test
    public void testPower_NegativeExponent_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RecursiveUtility.power(2, -3);
        });
    }
    
    // ===== GCD TESTS =====
    
    @Test
    public void testGCD_SameNumbers() {
        assertEquals(5, RecursiveUtility.gcd(5, 5));
    }
    
    @Test
    public void testGCD_Coprime() {
        assertEquals(1, RecursiveUtility.gcd(7, 11));
    }
    
    @Test
    public void testGCD_NormalCase() {
        assertEquals(6, RecursiveUtility.gcd(12, 18));
    }
    
    @Test
    public void testGCD_OneIsMultiple() {
        assertEquals(12, RecursiveUtility.gcd(12, 24));
    }
    
    @Test
    public void testGCD_NegativeNumbers() {
        assertEquals(6, RecursiveUtility.gcd(-12, 18));
    }
    
    // ===== FIBONACCI TESTS =====
    
    @Test
    public void testFibonacci_Zero() {
        assertEquals(0, RecursiveUtility.fibonacci(0));
    }
    
    @Test
    public void testFibonacci_One() {
        assertEquals(1, RecursiveUtility.fibonacci(1));
    }
    
    @Test
    public void testFibonacci_Five() {
        assertEquals(5, RecursiveUtility.fibonacci(5));
    }
    
    @Test
    public void testFibonacci_Ten() {
        assertEquals(55, RecursiveUtility.fibonacci(10));
    }
    
    @Test
    public void testFibonacci_Negative_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            RecursiveUtility.fibonacci(-1);
        });
    }
    
    // ===== COUNT DIGITS TESTS =====
    
    @Test
    public void testCountDigits_SingleDigit() {
        assertEquals(1, RecursiveUtility.countDigits(5));
    }
    
    @Test
    public void testCountDigits_MultipleDigits() {
        assertEquals(4, RecursiveUtility.countDigits(1234));
    }
    
    @Test
    public void testCountDigits_Zero() {
        assertEquals(1, RecursiveUtility.countDigits(0));
    }
    
    @Test
    public void testCountDigits_NegativeNumber() {
        assertEquals(4, RecursiveUtility.countDigits(-1234));
    }
    
    // ===== SUM RANGE TESTS =====
    
    @Test
    public void testSumRange_One() {
        assertEquals(1, RecursiveUtility.sumRange(1));
    }
    
    @Test
    public void testSumRange_Five() {
        assertEquals(15, RecursiveUtility.sumRange(5));
    }
    
    @Test
    public void testSumRange_Ten() {
        assertEquals(55, RecursiveUtility.sumRange(10));
    }
    
    @Test
    public void testSumRange_Zero() {
        assertEquals(0, RecursiveUtility.sumRange(0));
    }
    
    @Test
    public void testSumRange_Negative() {
        assertEquals(0, RecursiveUtility.sumRange(-5));
    }
}
