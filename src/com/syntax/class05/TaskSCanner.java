package com.syntax.class05;

import java.util.Scanner;

public class TaskSCanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
/*		You are DMV representative and you need to
 *  askcustomer their age.
 *   If they are 18 and older you will issue a driver license 
 *   to them, otherwise you will offer them to
 *    get a learners permit.

		
		System.out.println("Please enter your age");		
		int age = scan.nextInt();	
		
		if(age>=18) {
			System.out.println("you will get driver license");	
		}else {
			System.out.println("you have to get a learner permit");
		}
*/
		
		/*Create a Java program that will ask if user has a credit card or not
		 * . If you user does not have a credit card then offer them.
		 *  If they do have one ask what is balance on the card? 
		 *  If balance of the card is larger than 1000,
		 *   tell them to pay off immediately, 
				otherwise you can tell them that they can spend more.*/
		
		System.out.println("do you have credit card or not");
		boolean card = scan.nextBoolean();
		
		
		if (card == true) {

			System.out.println("waht is balance on the card?");
			double balance = scan.nextDouble();
			if(balance>1000) {
				System.out.println("pay off immediately");
			}else {
				System.out.println("they can spend more.");
			}
			
		}else {
			System.out.println("you must have credit card");
		}
		
	}

}
