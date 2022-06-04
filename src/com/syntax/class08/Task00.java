package com.syntax.class08;

import java.util.Scanner;

public class Task00 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	/*	
		
		int num ;
			do {
				System.out.println("Enter the secret number");	
				num = scan.nextInt();
			
		}while(num != 25);
		System.out.println("yo got it");
		
*/		
		//Print numbers from 1 to 50 except those that are divisible by 3
		
		for (int x = 1; x<=50; x++) {
			if(x==3 || x==6 || x==9 || x==12 || x==15 ||
					x==21 || x==24 || x==27 || x==30 
					||x==42|| x==18 || x==33|| x==45||x==48){
			   continue;
			}
			System.out.print(x+" ");
		}
		
		
		/*
		 * 


Create a program that will keep asking user to 
apply for a credit card.
 As soon you get “yes” from a user program should stop asking.



		 */
		
		
		System.out.println();
		
		String getAnswer;
		do {
			System.out.println("please apply for a credit card");
			getAnswer = scan.nextLine();
			break;
		}while(!getAnswer.equalsIgnoreCase("yes"));
		
		
		
		
		
		
	}

}
