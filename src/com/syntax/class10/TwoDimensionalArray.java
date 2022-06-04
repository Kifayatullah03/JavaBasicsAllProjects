package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		
		String [][] usa = {
				{"newyork" , "queens" , "eastrockaway"},
				{"Mclean" , "woodbridge" , "leesburg"} 
				};
		System.out.println("for loops");
		for(int row = 0; row < usa.length; row++) {
			for(int col = 0; col < usa[row].length; col++ ) {
				
				System.out.print(usa[row][col]+" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("enhanced loops");
		for(String[] state : usa) {
			for(String city : state) {
				System.out.print(city);
			}
		System.out.println();
		}
		
		System.out.println();
		
		
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("for loop");
		for(int x = 0; x < nums.length; x++) {
			for(int i = 0; i < nums[x].length; i++) {
				
				System.out.print(nums[x][i]+" ");		
			}
		System.out.println();
		}
		
				
		System.out.println("enhanced loops");
		
		for(int[] num :nums) {
			for(int x : num) {
				System.out.print(x+" ");
			}
		System.out.println();
		}
		
		
		
	}

}
