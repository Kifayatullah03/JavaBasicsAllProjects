package com.syntax.class03;

public class IfStatements {

	public static void main(String[] args) {

		/*
		 * declare a variable
		 * 
		 * if rate is more than 5 --> iam not buying a house.
		 *
		 */

		double mortgageRate = 6.5f;

		if (mortgageRate > 5) {

			System.out.println("iam not buying house");

		}

		/*
		 * declare 2 variable and check if num1 is bigger than num2
		 * 
		 */

		int num1 = 99;
		int num2 = 100;

		if (num1 > num2) {
			System.out.println(num1 + "is bigger than" + num2);

		}
		/*
		 * declare temperature' if tem is higher than 75 --> i will go a walk
		 */

		int tem = 80;
		if (tem < 75) {
			System.out.println("i will go by walk");
		} else {
			System.out.println("i will go by car");

		}

		char gender = 'f';

		if (gender == 'f') {

			System.out.println("you like going to vacation");

		} else {

			System.out.println("you study java");

		}

		String browser = "firefox";
		if (browser.equals("chrome")) {

			System.out.println("I will not work any more");
		} else {
			System.out.println("I will done my task");
		}

	}

}
