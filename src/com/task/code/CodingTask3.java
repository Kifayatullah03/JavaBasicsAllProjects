package com.task.code;

public class CodingTask3 {

	public static void main(String[] args) {
		
		//create a 2D array of integer value , print the sum of all the all numbers.
	

		
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
		
		
		
		
		
	/*	
		
	 int[][] nums = new int[2][3];
	  nums[0][0] = 1;
	  nums[0][1] = 2;
	  nums[0][2] = 3;
	  nums[1][0] = 4;
	  nums[1][1] = 5;
	  nums[1][2] = 6;
			 int sum = 0;
	 for(int i = 0; i < nums.length; i++) {
		 
		 sum = sum+nums[i];
	 }
	   System.out.println(sum);
	}
	 
		
		
*/
	}

}
