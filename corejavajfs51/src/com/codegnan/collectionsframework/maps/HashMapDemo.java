package com.codegnan.collectionsframework.maps;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		Map<Integer,String> students = new TreeMap<>(Collections.reverseOrder());
		
		students.put(102, "Ravi"); //Entry
		students.put(101,"Shyam"); //Entry
		students.put(103, "Lata");
		students.put(107, "Khan");
		students.put(105,"Kumar");
		students.put(103,"Kumari"); 
		
		System.out.println(students);
		
		System.out.println(students.get(101));
		
		//System.out.println(students.keySet());
		//keySet() retrieves the keys in a map
		for(Integer key:students.keySet() ) {
			System.out.println(key);
		}
		
		//values() method retrieves the values from map. 
		System.out.println(students.values());
		for(String value: students.values()) {
			System.out.println(value);
		}
		
		//Print key-value pairs using entrySet() method
		
		System.out.println(students.entrySet());
		
		for(Entry<Integer,String> entry: students.entrySet())
		{
		 System.out.println(entry.getKey()+ " "+entry.getValue() );
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	

}
