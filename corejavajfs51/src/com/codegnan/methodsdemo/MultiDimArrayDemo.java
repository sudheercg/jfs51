package com.codegnan.methodsdemo;

/*Student marks: 
	 
        m0        m1   
s0 -    20(0,0)   30(0,1)   
s1 -    60(1,0)   70(1,1)    

*/

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		
		//Step1: Create a 2 Dimensional array 2 students 
		  // with 2 marks for each
		
		int[][] marks = new int[2][2];
		
		//step2 : store marks for each student
		marks[0][0]= 20;
		marks[0][1]=  30;
		marks[1][0]= 60;
		marks[1][1] = 70;
		
		//Create a for loop inside a forloop (nested for loop)
		// outer for loop represents the students
		//inner for loop represents marks for each student
		for(int i=0;  i<marks.length; i++) {
			for(int j=0;j< marks[i].length; j++) {
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
/*
i  i<marks.length(2)  i++   j   j< marks[i].length(2)  sop(marks[i][j]) j++
0        t                  0          t                 marks[0][0]=20
0          t                1          t                 marks[0][1] 30
1         t                 0          t                 marks[1][0] 60
1                            1          t                marks[1][1]  70
*/







