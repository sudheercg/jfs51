package com.codegnan.collectionsframework.setsdemo;

import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> intSet = new TreeSet<>();
		intSet.add(333);
		intSet.add(-1);
		intSet.add(34);
		intSet.add(888);
		
		System.out.println(intSet);
		System.out.println();
		System.out.println(intSet.descendingSet());
		
	}
	
	

}
