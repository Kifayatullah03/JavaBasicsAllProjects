package com.syntax.classreview04;
import java.util.Scanner;
public class Hw {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double accumlatedAmount = 0;
		double amountToPayOff;
		
		do {
			
		System.out.println("Enter the item name that you want to buy");
		String itemName = input.next();
		System.out.println("Enter the price of item");
		double itemPrice = input.nextDouble();
		accumlatedAmount = accumlatedAmount+itemPrice;
		System.out.println("Please Enter the money");
		double money = input.nextDouble();
		amountToPayOff = money-accumlatedAmount;
		System.out.println("Amount to pay off " +(-1*amountToPayOff));
		}while(amountToPayOff<0);
			System.out.println("Here is your change "+amountToPayOff+"Thank you for shopping");
	
		
		
	}
}
