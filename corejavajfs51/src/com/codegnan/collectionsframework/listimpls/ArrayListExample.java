package com.codegnan.collectionsframework.listimpls;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList studentList = new ArrayList();
		
		Student student1 = new Student(100,"Raj");
		Student student2 = new Student(101,"Khan");
		Student student3 = new Student(102,"Sam");
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		
		Collections.sort(studentList);
		
		System.out.println(studentList);
		
		
		
	}

}
