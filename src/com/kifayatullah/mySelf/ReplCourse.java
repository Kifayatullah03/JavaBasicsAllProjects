package com.kifayatullah.mySelf;
import java.util.Scanner;
public class ReplCourse {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	/*Write a program that reads a range of integers 
	 * (start and end point),
	 *  provided by a user and then from that 
	 *  range prints the sum of the even and odd integers.
	 */

	
	
	/*
	
	System.out.print("Please enter start point:");
		int startPoint = scan.nextInt();
		System.out.print("Please enter end point:");
		int endPoint = scan.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;
		while(startPoint<=endPoint) {
			if(startPoint%2==0) {
				sumEven+=startPoint;
			}else {
				sumOdd+=startPoint;
			
			}
		startPoint++;
		}
		
		System.out.println("Sum of the even number = "+sumEven);
		System.out.println("Sum of the even number = "+sumOdd);
		
	*/
		
		
		
		
	/*Write a program to ask a user to enter item 
	 *they want to buy and the price of that item.
	 *Every time user enters money, 
	 *accumulate the amount and tell the user
	 *how much is left to pay off.
	 *If user give more money program should return a change.
	 *Whenever a user done with
	 *payments program should say “Thank you for shopping! 	
	 */


	int price = 32;
		int x = 1;
		while(true) {
			System.out.print("Please enter the item :");
			int item = scan.nextInt();
				if(item!=0) {
					System.out.println(item-price);
				
					System.out.println("thank you for shopping!");
				break;
				 	}
				}
			
		
	
		
		
		/*Using nested loop,
		 *  create a 24 hour clock that will display 2 
		 *  digits for an hour and 2 digits for a minute.
		 
			Example:

    	 	10:00

    	 	10:01

    	 	10:02

    	 	…..etc

    	 	10:59	

    	 	11:00

		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*
		for(int x = 1; x<=10; x++) {
			int y = 3;
			for(; y<=30; y++ ) {
				
			}
			System.out.println("3"+"*"+x+"="+x*3);
		}
		*/
		/*
		
		}
		
		*/
		
	/*	
	int x = 1;
		for(; x<=10; x++) {
		
		int y = 1;
		for(; y<=10; y++) {
		
		int z= 3;
		for(; z<=30; z+=3) {
			System.out.println("3"+"*"+y+"="+z);
	 
		 }				
		}	
		}
	
		*/
	/*		
	for (int x = 1; x<=10; x+=3 ) {
		System.out.println(x);
	}
		
	

    for(int z = 1; z<=10; z++){
      System.out.println(z);
      for(int y = 3; y<=30; x+=3){
        System.out.println(y);
          
		
*/
	}
}
