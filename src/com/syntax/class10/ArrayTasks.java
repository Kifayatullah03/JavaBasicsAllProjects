package com.syntax.class10;

public class ArrayTasks {

	public static void main(String[] args) {

		/*
		
		//String out = "null"; 
		int [] numbers = { 1 , 2 , 6 , 4 };
		
		for(int x : numbers) {
		
			if(numbers[0] > numbers[1] && numbers[0] > numbers[2] && numbers[0] > numbers[3]) {
				System.out.println("The largest number is "+numbers[0]);
				break;
			}else if(numbers[1] > numbers[0] && numbers[1] > numbers[2] && numbers[1] > numbers[3]) {
				
				
				System.out.println("The largest number is "+numbers[1]);
			break;
			}else if(numbers[2] > numbers[0] && numbers[2] > numbers[1] && numbers[2] > numbers[3]) {
				System.out.println("The largest number is "+numbers[2]);
		break;
			}else if (numbers[3] > numbers[0] && numbers[3] > numbers[1] && numbers[3] > numbers[2]) {
			
				System.out.println("The largest number is "+numbers[3]);
		break;
			}else {
				System.out.println("valid");
			
			}
		}																							
			*/
		
			/*Create an array to store char values and then print those in reverse order
			 */
		
		char[] alpha = {'a' , 'b' , 'c', 'd'};
		
		for(int  x = alpha.length - 1; x >= 0; x--) {
			System.out.print(alpha[x]+" ");
		}
		
																								
	System.out.println();
		
		//From an array of integer elements find the largest number.
		  
		int num [] = {3, 4, 6, 54, 23};
		int x = num[0];
		
		for(int z = 1; z < num.length; z++) {
			if(num[z] > x) {
				System.out.println("largest number "+ x);
				x = num[z];
			
			}

		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}
