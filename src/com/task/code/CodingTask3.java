package com.task.code;

public class CodingTask3 {

	public static void main(String[] args) {
		
		//create a 2D array of integer value , print the sum of all the all numbers.
	

		/*		
		int [][] intArray = {{10,20,30},
				{40,50,60},
				{70,80,90}};

				System.out.println(intArray[0][0]);
				System.out.println(intArray[0][1]);
				System.out.println(intArray[0][2]);
				System.out.println(intArray[1][0]);
				System.out.println(intArray[1][1]);
				System.out.println(intArray[1][2]);
				System.out.println(intArray[2][0]);
				System.out.println(intArray[2][1]);
				System.out.println(intArray[2][2]);

				int sum = 0;
			for(int i = 0; i < 3; i++) {	
				for(int x = 0; x < 3; x++) {
					sum = sum+intArray[i][x];
				}
			}
		System.out.println(sum);
		
		
*/		
		
		
	int [][] nums = {{1,2,3},{4,5,6,},{7,8,9}};
		 int sum = 0;
	 for(int i = 0; i < nums.length; i++) {
		 for(int k = 0; k < nums.length; k++) {
		 sum = sum+nums[i][k];
	 }
	}
	 
	   System.out.println(sum);
		
		

	}

}
