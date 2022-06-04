package com.kifayatullah.mySelf;
import java.util.Scanner;
public class Hwork {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the score you get in quiz");
		int quiz = scan.nextInt();
		System.out.println("Enter the score you get in midterm");
		int midTerm = scan.nextInt();
		
		System.out.println("Enter the score you get in final");
		int fin = scan.nextInt();
		
		int avrge = (fin+midTerm+quiz)/3;
		System.out.println("Your average score is "+avrge);
		char grade;
		
		if(avrge == 90) {
			grade = 'A';
		}else if (avrge >= 70 && avrge <= 90) {
			grade = 'B';
		}else if (avrge>=50 && avrge < 70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		

		System.out.println("You are a "+grade+" student");
		
	
	
	
		
		
		
	
	
	
}
}