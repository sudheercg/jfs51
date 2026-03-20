package com.codegnan.package1;

public class Parent {
	
	//variable with default accessmodifer
   int defaultVar=10;
   protected int protectedVar = 20;
	
   
   public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.defaultVar);
		System.out.println(p.protectedVar);
	}

}
