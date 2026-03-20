package com.codegnan.codereviews;

import java.util.LinkedList;

/**
 * Demonstration of LinkedList operations.
 */
public class LinkedListDemo {
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        
        System.out.println("===== LINKEDLIST DEMO =====\n");
        
        // Add elements
        System.out.println("Adding elements...");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println("After addLast(10, 20, 30): " + list);
        
        list.addFirst(5);
        System.out.println("After addFirst(5): " + list);
        
        list.add(2, 15);
        System.out.println("After add(2, 15): " + list);
        
        // Access elements
        System.out.println("\nAccessing elements...");
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Contains 30: " + list.contains(30));
        System.out.println("Contains 100: " + list.contains(100));
        
        // Remove elements
        System.out.println("\nRemoving elements...");
        int removed = list.removeFirst();
        System.out.println("Removed first: " + removed);
        System.out.println("After removeFirst(): " + list);
        
        removed = list.removeLast();
        System.out.println("Removed last: " + removed);
        System.out.println("After removeLast(): " + list);
        
        removed = list.remove(1);
        System.out.println("Removed at index 1: " + removed);
        System.out.println("After remove(1): " + list);
        
        // Reverse
        System.out.println("\nReversing list...");
        list.reversed();
        System.out.println("After reverse(): " + list);
        
        // Size and empty
        System.out.println("\nList info:");
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        
        // Clear
        list.clear();
        System.out.println("\nAfter clear(): " + list);
        System.out.println("Is empty: " + list.isEmpty());
    }
}
