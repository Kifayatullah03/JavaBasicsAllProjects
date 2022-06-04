package com.syntax.class05;

import java.util.Scanner;

public class UserInout {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = scan.next();
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		System.out.println("Enter price");
		double price = scan.nextDouble();
		
		System.out.println("Enter any character");
		char character = scan.nextLine().charAt(0);
	
	
	}

}
