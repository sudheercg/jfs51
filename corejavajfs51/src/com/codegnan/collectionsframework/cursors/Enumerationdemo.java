package com.codegnan.collectionsframework.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationdemo {
	
	public static void main(String args[]) {
		
		
		Vector<String> v= new Vector<>();
			v.add("Apple");
			v.add("Banana");
			v.add("Mango");
			
			Enumeration<String> e= v.elements();
			while(e.hasMoreElements()) {
				String fruit = e.nextElement();
				System.out.println(fruit);
			}
			
			
			
		}
	}


