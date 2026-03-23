package com.codegnan.collectionsframework.stackqueues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	
	public static void main(String[] args) {
		
		//Queue is based on FIFO principle
		Queue<Integer> queue = new LinkedList<>();
		
		//add elements into queue - enqueue
		queue.add(100);
		queue.add(200);
		queue.add(300);
        
		System.out.println("Queue: "+queue);
		
		//peek()
		System.out.println("Front element of the queue: "+ queue.peek());
		
		//remove an element from queue - dequeue
		System.out.println("Removed Element: "+queue.remove());
        
		System.out.println("Elements after removal: "+queue);
		
		
		//To check if the queue is empty
		System.out.println("Is Queue Empty: "+queue.isEmpty());
		
	
	
	
	}

}
