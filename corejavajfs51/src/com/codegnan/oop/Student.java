package com.codegnan.oop;

public class Student {
	
	//instance variables
	String name;
	int rollNumber;
	int age; 
	String course; 
	
	public void displayStudentInfo() {
		System.out.println("Displaying "+name+"'s Details:");
		System.out.println("Name: "+name);
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Age: "+age);
		System.out.println("Course: "+course);
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.name="";
	}

}
