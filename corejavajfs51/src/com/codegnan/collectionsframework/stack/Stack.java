package com.codegnan.collectionsframework.stack;

/**
 * Custom Stack implementation using array.
 * @param <T> type of elements
 */
public class Stack<T> {
    
    private Object[] elements;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;
    
    /**
     * Create stack with default capacity.
     */
    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
        top = -1;
    }
    
    /**
     * Create stack with specified capacity.
     */
    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        } else {
            elements = new Object[capacity];
            top = -1;
        }
    }
    
    /**
     * Push element onto stack.
     * @param item element to push
     */
    public void push(T item) {
        if (isFull()) {
            resize();
        } else {
            // space available
        }
        
        elements[++top] = item;
    }
    
    /**
     * Pop element from stack.
     * @return top element
     * @throws IllegalStateException if stack is empty
     */
    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            T item = (T) elements[top];
            elements[top] = null;  // Help garbage collection
            top--;
            return item;
        }
    }
    
    /**
     * Peek at top element without removing.
     * @return top element
     * @throws IllegalStateException if stack is empty
     */
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        } else {
            return (T) elements[top];
        }
    }
    
    /**
     * Check if stack is empty.
     * @return true if empty
     */
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Check if stack is full.
     * @return true if full
     */
    private boolean isFull() {
        if (top == elements.length - 1) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Get current size of stack.
     * @return number of elements
     */
    public int size() {
        return top + 1;
    }
    
    /**
     * Clear all elements from stack.
     */
    public void clear() {
        for (int i = 0; i <= top; i++) {
            elements[i] = null;
        }
        top = -1;
    }
    
    /**
     * Resize array when full.
     */
    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        
        for (int i = 0; i <= top; i++) {
            newElements[i] = elements[i];
        }
        
        elements = newElements;
    }
}
