package com.codegnan.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
	
	public static void main(String[] args){
		//Unhandled exception type FileNotFoundException
		Test t = new Test();
		try {
		t.readFile();
		}
		catch(FileNotFoundException f) {
			f.printStackTrace();
		}
	}
	
	public void readFile() throws FileNotFoundException {
		FileReader fr = new FileReader("abc.txt");
	}

}
