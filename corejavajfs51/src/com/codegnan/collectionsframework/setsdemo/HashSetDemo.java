package com.codegnan.collectionsframework.setsdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	
	public static void main(String[] args) {
		HashSet<String> fruitSet = new HashSet<>();
		
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Cherry");
		fruitSet.add("Kiwi");
		fruitSet.add(null);
		fruitSet.add("Apple");
		
		//System.out.println(fruitSet);
		
		Iterator<String> it = fruitSet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println();
		System.out.println("Using enhanced for loop");
		for(String fruit:fruitSet ) {
		System.out.println(fruit);
		}
	}
	

}
