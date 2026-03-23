package com.codegnan.collectionsframework.stackqueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
	
	
	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		//Queue behviour -FIFO
		//adding the element at rear
		deque.addLast(1);
		deque.addLast(2);
		deque.addLast(3);
		
		System.out.println("Dequeu elements: "+deque);
		
		//Remove from front: 
		System.out.println("Removed(FIFO)"+ deque.removeFirst());
		System.out.println("After removal: "+deque);
		
		
		
		System.out.println("Deque Stack style");
		System.out.println(deque);
		
		//Pop(remove) the  from front
		System.out.println("Popped element: "+deque.poll());
		
		//Both end  operations
		//adding element at front
		deque.addFirst(99);
		
		//adding element at rear
		deque.addLast(88);
		
		System.out.println("First element: "+deque.peekFirst());
		System.out.println("Last element:"+ deque.peekLast());
		
		
		
		
		
		
		
		
		
	}

}
