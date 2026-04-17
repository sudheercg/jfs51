package com.codegnan.iodemos.charstreams;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {

		File file = new File("jfs51.txt");
		// exists()
		System.out.println(file.exists());

		// creates a new file mentioned in the File constructor.
		file.createNewFile();
		System.out.println(file.exists());

		File dir = new File("mydirectory");

		// to create a director use mkdir();
		dir.mkdir();
		
		System.out.println(file.isFile());  //true
		System.out.println(dir.isDirectory());//true 

	}

}
