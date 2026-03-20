package com.codegnan.methodsdemo;

public class JaggedArrayDemo {
	
	public static void main(String[] args) {
		//Step1: Create a jagged array (only rows defined)
		
		int[][] jaggedArr= new int[3][];
		
		//step2: define the columns for each rows seperately
		jaggedArr[0]= new int[2];
		jaggedArr[1]= new int[3];
		jaggedArr[2]= new int[1];
		
		//step3: Assign the values
		//row1
		jaggedArr[0][0]=20;
		jaggedArr[0][1]=30;
		
		//row2
		jaggedArr[1][0]=40;
		jaggedArr[1][1]=60;
		jaggedArr[1][2]=80;
		
		//row3
		jaggedArr[2][0]=20;
		
		  for(int i=0; i<jaggedArr.length;i++) {
			  for(int j=0; j<jaggedArr[i].length; j++) {
				  System.out.print(jaggedArr[i][j]+" ");
			  }
			  System.out.println();
		  }
		
	}

}
