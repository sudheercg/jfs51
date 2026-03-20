package com.codegnan.scannerdemo;

/**
 * Variables and Operators Demonstration
 * 
 * This program demonstrates all concepts covered:
 * - Variable declaration and initialization
 * - All 8 primitive data types
 * - Constants using final
 * - All operator types
 * - Type casting
 * 
 * @author Codegnan IT Solutions
 * @version 1.0
 */
public class VariablesOperatorsDemo {
    
    public static void main(String[] args) {
        
        // ===== PRIMITIVE DATA TYPES =====
        System.out.println("===== PRIMITIVE DATA TYPES =====");
        
        // Integer types
        byte byteVar = 127;
        short shortVar = 32000;
        int intVar = 2000000;
        long longVar = 9000000000L;
        
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println();
        
        // Floating-point types
        float floatVar = 3.14f;
        double doubleVar = 3.14159265359;
        
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println();
        
        // Character and boolean
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println();
        
        // ===== CONSTANTS =====
        System.out.println("===== CONSTANTS =====");
        final double PI = 3.14159;
        final int DAYS_IN_WEEK = 7;
        
        System.out.println("PI: " + PI);
        System.out.println("Days in week: " + DAYS_IN_WEEK);
        System.out.println();
        
        // ===== ARITHMETIC OPERATORS =====
        System.out.println("===== ARITHMETIC OPERATORS =====");
        int a = 10, b = 3;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));
        System.out.println();
        
        // ===== RELATIONAL OPERATORS =====
        System.out.println("===== RELATIONAL OPERATORS =====");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();
        
        // ===== LOGICAL OPERATORS =====
        System.out.println("===== LOGICAL OPERATORS =====");
        boolean x = true, y = false;
        
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();
        
        // ===== TYPE CASTING =====
        System.out.println("===== TYPE CASTING =====");
        
        // Implicit casting
        int intValue = 100;
        double doubleValue = intValue;
        System.out.println("Implicit: int " + intValue + " → double " + doubleValue);
        
        // Explicit casting
        double price = 99.99;
        int rupees = (int) price;
        System.out.println("Explicit: double " + price + " → int " + rupees);
        System.out.println();
        
        // ===== COMPOUND ASSIGNMENT =====
        System.out.println("===== COMPOUND ASSIGNMENT =====");
        int num = 10;
        System.out.println("Original: " + num);
        
        num += 5;
        System.out.println("After += 5: " + num);
        
        num -= 3;
        System.out.println("After -= 3: " + num);
        
        num *= 2;
        System.out.println("After *= 2: " + num);
        
        num /= 4;
        System.out.println("After /= 4: " + num);
    }
}
