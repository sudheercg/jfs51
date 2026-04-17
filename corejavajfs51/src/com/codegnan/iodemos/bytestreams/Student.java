package com.codegnan.iodemos.bytestreams;

import java.io.Serializable;

public class Student implements Serializable{
	
	int id;
	String name; 
	transient String password;
	
	public Student(int id, String name, String password ) {
		this.id=id;
		this.name=name;
		this.password=password;
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", password=" + password + "]";
	}

	

}
