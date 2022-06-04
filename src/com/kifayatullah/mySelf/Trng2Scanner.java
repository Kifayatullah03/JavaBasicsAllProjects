package com.kifayatullah.mySelf;
import java.util.Scanner;
public class Trng2Scanner {

	public static void main(String[] args) {
		/*
		 * Calculator project
		  *Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a+b);
		*
		*/
		
		
		
		/*
		 * Create a java program in which using Scanner 
		 * you are going to capture user’s first name, 
		 * last name and state where he/she lives.
		
		 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = input.next();
		System.out.println("My first name is : "+firstName );
		
		System.out.print("Enter your last name: ");
		String lastName = input.next();
		System.out.println("My last name is : "+lastName);
		
		System.out.print("where do you live : ");		
		String state = input.next();
		System.out.println("I am living : "+state);		
		*/
		
		/*
		 *  Create a java program in which using
		 *   Scanner you are going to capture 2 numbers.
		 *   And once you capture 2 numbers,
		 *   please check which one is the largest.

		 */
		
		Scanner input = new Scanner(System.in);
		System.out.print("put first number : ");
		int num1 = input.nextInt();
		System.out.print("your first number is : "+num1);
	
		System.out.print("put second number is : ");
		int num2 = input.nextInt();
		System.out.println("your second number is : "+num2);
		
		
		if(num1>num2) {
			System.out.println(num1+" is the largest number!");
			
		}else {
			System.out.println(num2+" is the largest number!");
		}
		
		
		
		

		
		
	}
	
}
