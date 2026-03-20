package com.codegnan.collectionsframework.stackqueues;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		//Push operation (add elements)
		stack.push(10);//first element- bottom
		stack.push(20);//second element on top of bottom
		stack.push(30);//top most element. 
		
		System.out.println("Stack after push: "+stack);
		
		System.out.println("Top element of stack: "+stack.peek());
		
		System.out.println("Removed element: "+stack.pop());
		System.out.println("Stack after removal: "+stack);
		
		System.out.println("Is stack empty? "+stack.isEmpty());
		
		
		
		
		
		
		
		
	}
	
	

}
