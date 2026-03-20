package com.codegnan.collectionsframework.listimpls;

import java.util.LinkedList;

public class ListOperationsDemo {
	
	public static void main(String[] args) {

	LinkedList<String> linkedList = new  LinkedList<>();
	
	linkedList.add("A");//o
	linkedList.add("B");//1
	linkedList.add("D");//2
	linkedList.add("E");//3
	
	System.out.println("Before adding C "+linkedList);
	
	linkedList.add(2,"C");
	
	System.out.println("After adding C "+linkedList);
	
	linkedList.remove(2);
	System.out.println("After removing element at index 2 "+linkedList);

   linkedList.addFirst("Start");
   System.out.println(linkedList);
   
   linkedList.addLast("End");
   System.out.println(linkedList);
   
   //removes the first element  from  LinkedList
   linkedList.removeFirst();
   
   //removes the last element from LinkedList
   linkedList.removeLast();
   
// Queue style operations
   linkedList.offer("F"); // adds element to end
   System.out.println("After offer(): " + linkedList);

   // Peek first element without removing
   System.out.println("Peek element: " + linkedList.peek());

   // Poll removes first element
   System.out.println("Poll element: " + linkedList.poll());

   System.out.println("After poll(): " + linkedList);
   
   
   

}
}
