package com.codegnan.oop.inheritance.casting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TypeCastingDemo {
	
	public static void main(String[] args) {
		
		System.out.println("****Upcasting****");
		
		Animal a = new Dog();
		
		List list = new LinkedList();
		List llist = new LinkedList();
		
		
		
		//a.bark();//bark() is not available using Animal ref
		a.eat();
		
		//Downcasting.
		
		Dog d = (Dog)a;
		
		d.bark();
		d.eat();
		
		
		
		Animal a2 = new Animal();
		Dog d2 = (Dog)a2;
		
		
		
	}

}
