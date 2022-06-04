package com.syntax.classreview02;

public class IfElseDemo4 {
	public static void main(String[] args) {

		double money = 1000;
		boolean amIFree = true;

		if (true) {
			System.out.println("inside the most outer if condition");
			if (true) {
				System.out.println("go play somthing");

				if (true) {
					System.out.println("you win");
				}
			}
		}

	}
}
