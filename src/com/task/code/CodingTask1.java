package com.task.code;
import java.util.Scanner;
public class CodingTask1 {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
		
		
	     int x;
		 int y;
		 int i;
		
		 int [] numbers = new int[3];
		 System.out.print("Enter number 1 : ");
		 numbers[0] = y=  scan.nextInt();
		 System.out.print("Enter number 2 : ");
		 numbers[1] =  x =  scan.nextInt();
		 System.out.print("Enter number 3 : ");
		 numbers[2] =  i = scan.nextInt();
		 
		 int sum = 0;
		 for(int w = 0; w < numbers.length; w++) {
			 sum = sum + numbers[w];
	}
		 System.out.println("# Total : "+sum);		
		
		
		
	
	
	
	}

}
