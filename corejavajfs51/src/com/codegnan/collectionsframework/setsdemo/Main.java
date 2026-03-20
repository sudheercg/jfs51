package com.codegnan.collectionsframework.setsdemo;

import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
	
		
		TreeSet<Student2> students = new TreeSet<>(new IdComparator());
		
		students.add(new Student2(3,"Ravi"));
		students.add(new Student2(1,"Amit"));
		students.add(new Student2(2,"Sita"));
		
		System.out.println(students);
		
	}

}
