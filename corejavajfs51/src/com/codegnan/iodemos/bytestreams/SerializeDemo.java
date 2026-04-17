package com.codegnan.iodemos.bytestreams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Class demonstrating Serialization of a Student object
public class SerializeDemo {
	
	public static void main(String[] args) {
		
		//Create a object
		Student student = new Student(101,"Raj","Password123"); 
		try(FileOutputStream fos = new FileOutputStream("student.ser");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos)) {
			
			//serialize student object.
			oos.writeObject(student);
			System.out.println("Student Object seriealized successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
