package com.codegnan.collectionsframework.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
	
		/*ArrayList<Integer> marksList = new ArrayList<>();
		
		marksList.add(100);
		marksList.add(200);
		marksList.add(30);
		marksList.add(-5);
		
		Collections.sort(marksList);
		
		System.out.println(marksList);*/
		
		Employee emp1 = new Employee(100,"Bhaskar");
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(new Employee(102,"Kumar"));
		employeeList.add(new Employee(103,"Ashok"));
		
		Collections.sort(employeeList,new NameComparator());
		
		System.out.println(employeeList);
		
		
		
		

	}

}
