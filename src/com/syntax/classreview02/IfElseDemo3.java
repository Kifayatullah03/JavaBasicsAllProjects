package com.syntax.classreview02;
import java.util.Scanner;
public class IfElseDemo3 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Account balance");
		double accountBalance = scan.nextDouble();
		System.out.println("Please enter the amount that you want lend to your friend");
		double amountToLend = scan.nextDouble();
		
		if(accountBalance>=amountToLend) {
			System.out.println("yes i can help you");
		}
		else {
			System.out.println("sorry i don't have enough money to help you");
		}
			
		
	
		
		
		
	}
	 }
