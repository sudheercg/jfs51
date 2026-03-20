package com.codegnan.collectionsframework.maps;

import java.util.TreeMap;

public class Demo {
	
	public static void main(String[] args) {
		
		TreeMap<Student,String> studentMap= new TreeMap<>(new IdComparator());
		
		studentMap.put(new Student(103,"Ravi"), "Java");
		studentMap.put(new Student(101,"Sita"), "Puython");
		studentMap.put(new Student(1138,"Raj"), "C++");
		studentMap.put(new Student(10,"Sunitha"), "HTML");
		
		System.out.println(studentMap);

		
		
	}

}
