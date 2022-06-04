package com.syntax.classreview02;
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = scanner.nextInt();
		
		String newLine = scanner.nextLine();
		
		System.out.println("Please Enter your name");
		String name = scanner.nextLine();
		
		System.out.println(age+name);
		
		
		
		
		
	}

}
