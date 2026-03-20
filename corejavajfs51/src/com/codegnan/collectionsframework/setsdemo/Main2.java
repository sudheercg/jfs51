package com.codegnan.collectionsframework.setsdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Main2 {
	
	public static void main(String[] args) {
	// anonymous implementation of Comparator
 
		TreeSet<Student2> students = new TreeSet<>(new Comparator<Student2>() {
			
			public int compare(Student2 s1, Student2 s2) {
				return s1.id-s2.id; 
			}
			
		});
		
		students.add(new Student2(3,"Ravi"));
		students.add(new Student2(1,"Amit"));
		students.add(new Student2(2,"Sita"));
		
		System.out.println(students);
		
	}

}
