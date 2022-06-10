package com.task.code;

public class CodingTask04 {

	public static void main(String[] args) {
		

		/*Create a 2D array of integer type where you will store
		 * odd and even numbers. Develop a program which will
		 * identify/print the even numbers only.
        */

		int [][] nums = {{10,30,20},
						{40,50,60},
						{70,80,90}};
			for(int x = 0; x < nums.length; x++) {
				for(int i = 0; i <nums[x].length; i++) {
					if(nums[x][i]%2==0) {
						System.out.println(nums[x][i]);
					}
				}
			}
	
	
/*         	System.out.println();		
			int [][] arr = { {10,15,10},
		        		 {20,50,20},
		        		 {30,30,30}};
			for(int j=0; j<arr.length;j++) {
			for(int i=0;i<arr[j].length; i++) {
				if(arr[j][i]%2==0) {
					System.out.println(arr[j][i]);
				}
			}
			
		}
	
*/
		
	}
}
