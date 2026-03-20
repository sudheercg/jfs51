package com.codegnan.oop;
//Demo class to use student objects
public class StudentDemo {
	
	public static void main(String[] args) {
		
		//instantiation of Student
		Student student1 = new Student(); 
		
		//initialization
		student1.name="Raj";
		student1.age=22;
		student1.course="Java";
		student1.rollNumber= 100;
		
		student1.displayStudentInfo();
		
		
		Student student2= new Student();
		student2.name="Reena";
		student1.age=20;
		student1.course="Python";
		student1.rollNumber= 101;
		
		student2.displayStudentInfo();
		
	}

}
