package com.codegnan.collectionsframework.setsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsDemo {
	
	public static void main(String[] args) {
		
	
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		
		//HashSet(Collection c) Union operation using addAll(0
		Set set3 = new HashSet(set1);
		System.out.println(set3);//[1, 2, 3]
		System.out.println(set2);//[2, 3, 4]
		set3.addAll(set2);//
		System.out.println(set3);//[1,2,3,4]
		
		//Intersection operation
		Set<Integer> set4= new HashSet<>(set1);
		
		set4.retainAll(set2);
		System.out.println(set4);
		
		
		
		
	}

}
