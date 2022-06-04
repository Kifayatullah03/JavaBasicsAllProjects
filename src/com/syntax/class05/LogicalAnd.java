package com.syntax.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		boolean job = true;
		double salary = 100000;
		
		if(job && salary>=100000) {
			System.out.println("I am supper duper happy");
		}
		
		
		System.out.println("-----------------------------------------------------------");
		
		
		boolean learn = true;
		boolean homeWork = true;
		boolean practice = true;
		
		
		if( learn && homeWork && practice) {
			System.out.println("you will succeed in the course");
			
		}else {
			System.out.println("you will struggle");
			
		}
		
		
		System.out.println(" -------------------------------------------------------------------------------" );
		
		int a = 32;
		int b = 54;
		int c = 53;
		
	
		if(a>b && a>c) {
			System.out.println("The largest number is "+a);
		}else if (c>a && c>b) {
			System.out.println("The largest number is "+c);
		}else if(b>a && b>c) {
			System.out.println("The largest number is "+b);
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
		
		/* Monday and Friday --> no class
		 * Tuesday and Wednesday --> Manual testing
		 * Thursday --> review
		 * Saturday and Sunday -->Java
		 */
		
			String day = "Sunday";
			if(day.equals("Monday") || day.equals("Friday")) {
				System.out.println("I have no class");
			}
			else if (day.equals("Tuesday")|| day.equals("Wednesday")) {
				System.out.println("I have maunal testing class");
			}else if (day.equals("Tursday")) {
				System.out.println("I have review class");
			}else if (day.equals("Saturday") || day.equals("Sunday")) {
				System.out.println("I hava Java class");
			}
			System.out.println("-------------------------------------------------------------------------------------------------------");
			
			/*
			 * Prompt the user to enter person heights in inches.
			 *  Person should be classified as one of the following:
			 * short (under 60 inch)medium(between 60 -72 inch)tall (over 72 inch)
			 
		
			System.out.println("Please Enter person heights in inches");
			
			double personHeights = scan.nextDouble();
		if(personHeights < 60) {
			System.out.println("short");
		}else if (personHeights == 60 && personHeights ==72) {
			System.out.println("medium");
		}else if (personHeights > 72) {
			System.out.println("tall");
			
			
			
		}
		*/
		
		
		System.out.println("------------------------------------------------------------------------------------------------------");
		/*
		
		
	
		
		/*
		 * Write a program that will print whether it is a weekend or weekday.
		 *  If any day from 1-5 → output “It is a weekday”,
		 *  anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		 *//*
		System.out.println("enter the day1");
		int day1 = scan.nextInt();
	 
		if(day1 == 1 || day1 == 5 || day1 == 4 || day1 == 3) {
			System.out.println("It is a weekday");			
		}else if (day1 == 6 || day1 == 7) {
			System.out.println("It is weekend");
		}else {
			System.out.println("invalid day");
		}
		
		
		
		*/
		
		
		
		/*
		 * Ask user to enter a number and then define if number is small, medium or 
		 * largeSmall number is value between 1 and 10
		 * Medium number is value between 11 and 100
		 * Large number is value between 101 and 1000

		 */
		
			System.out.println("Please enter a number ");
			
			int num1 = scan.nextInt();
			
			if(num1 == 1 ||num1 <= 10  ) {
				System.out.println("largeSmall number");
			}else if (num1 == 11 || num1<=100) {
				System.out.println("medium number");
			}else if (num1 >= 101 || num1 <= 1000) {
				System.out.println("Large number");
				
			}
			
		
			String name = "kifo";
			if(!name.equals("kifo")) {
				System.out.println("I am kifayatullah");
			}
			else {
				System.out.println("ahamd");
			}
		
		

	
	
 }
}
