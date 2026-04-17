package com.codegnan.iodemos.charstreams;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) throws IOException {
		
		File dir = new File("mynotes");
		
		if(!dir.exists()) {
			
		   if(dir.mkdir()) {
			   System.out.println("Directory created "+ dir.getAbsolutePath());
		   }else {
			   System.out.println("Failed to create the directory");
		   }
		}else {
			System.out.println("Directory already exists!"+dir.getAbsolutePath());
		}
		
		//creates file objedts
		File file1 = new File(dir,"File1.txt");
		File file2 = new File(dir,"file2.txt");
		File file3 = new File(dir,"file3.txt");
		File file4 = new File(dir,"file4.txt");
		
		System.out.println("file1.txt created: "+file1.createNewFile());
		System.out.println("file2.txt created: "+file2.createNewFile());
		System.out.println("file3.txt created: "+file3.createNewFile());
		System.out.println("file4txt created: "+file4.createNewFile());

		//list the files present in a directory
		String[] fileNames= dir.list();
		if(fileNames ==null || fileNames.length ==0) {
			System.out.println("Directory is empty");
		}else {
			System.out.println("Contents of directory: ");
			for(String fileName:fileNames) {
				System.out.println(fileName);
			}
			
		}
		
	}

}
