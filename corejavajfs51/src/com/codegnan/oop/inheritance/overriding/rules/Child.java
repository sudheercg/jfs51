package com.codegnan.oop.inheritance.overriding.rules;

public class Child extends Parent{

	// Access level of Parent and child methods can be
	//same
	
	@Override
	public void show() {
		System.out.println("Child show method");
	}
	

}
