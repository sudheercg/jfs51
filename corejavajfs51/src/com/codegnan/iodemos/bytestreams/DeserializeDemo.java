package com.codegnan.iodemos.bytestreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
	
	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("student.ser");
		    BufferedInputStream bis = new BufferedInputStream(fis);
		    ObjectInputStream ois = new ObjectInputStream(bis);
		){
			//read the object from student.ser
			  Student student = (Student)ois.readObject();
			  System.out.println("Student object has been read from student.ser file: ");
			  
			  System.out.println(student);
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
