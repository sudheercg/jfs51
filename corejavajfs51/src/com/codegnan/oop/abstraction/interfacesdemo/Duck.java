package com.codegnan.oop.abstraction.interfacesdemo;

public class Duck implements Flyable,Swimmable{
	
	public void fly() {
		System.out.println("Duck flies lower with natural wings");
	}
	
	public void swim() {
		System.out.println("Duck swims");
	}

}
