package com.kifayatullah.mySelf;
import java.util.Scanner;
public class HomeWorkTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 *  If loan is less or equal to 200,000 then 
		 *  you would lend the money otherwise you would reject the client.
	
		
		System.out.println("how much loan you needed?");
		
		int loan = scan.nextInt();
		if(loan<=200000) {
			System.out.println("You would lend the money");
		}else {
			System.out.println("sorry we cannot lend ");
		}
		
	*/	
		
		
		
		
		/*Create a Java program that will ask user to input city and temperature.
		 * Your program should convert Fahrenheit into
		 * celsius and print “The temperature is the city __ is __”
		
		System.out.print("city : ");	
		String city = scan.next();
		
		System.out.print("Temperature : ");
		int temp = scan.nextInt();
		
		System.out.println("The temperature is the city "+city+" is "+temp);
		
		*/
		
		
		
		
		
		/*Write a program to ask user to enter numbers of worked years and annual salary.
 *  If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.		 
		 
		
		System.out.print("Please enter number of worked years ");
		int workedYear = scan.nextInt();
		System.out.print("annual salary");
		int annualSalary = scan.nextInt();
		
		if(workedYear >= 5 ) {
			System.out.println("User is eligible for bouns");
		}else {
			System.out.println("User is not eligible");
		}if(annualSalary > 50000) {
			System.out.println("bouns = 5000");
		}else {
			System.out.println("bouns = 3000");
		}
		
		*/
		
		
		/*
		Write a program that will ask user to input inputs the current time (use 24 hour format).
		Based on the given time define:

		if hour is between 1-11 --> Morning
		if hour between 12-15 --> Afternoon
		if hour between 16-20 --> Evening
		if hour between 21-24 --> Night
		
		
		
		System.out.println("Please enter current time");		
		int hour = scan.nextInt();
		
		if(hour!=0 && hour==1 && hour<=11) {
			System.out.println("Morning");
		}else if (hour!=0 && hour>=12 && hour<=15) {
			System.out.println("Afternoon");
		}else if (hour >=16 && hour<=20){
		System.out.println("Evening");
		}else if (hour>=21 && hour<=24) {
			System.out.println("night");
		}else {
			System.out.println("invalid time");
		}
		*/
			
		
		
		
		
		
		
		
		
		
		/*
		Write a program for user to enter his/hers birth month. Based on the month define the season.
		Example: if user is born in March, April, May → season =“Spring”
		if user is born in June, July, August →
		season =“Summer” etc …
		At the end of the program we should see output as “You were born is season ______“.	
		 
		
		System.out.println("Please enter his/hers birth month");
		String month = scan.next();
		
		if(month.equals("march")|| month.equals("april") || month.equals("may")) {
			System.out.println("Spring");
		}else if (month.equals("august")|| month.equals("july") || month.equals("june")) {
			System.out.println("Summer");
		}else if (month.equals("september")|| month.equals("october") || month.equals("november")|| month.equals("december")
				|| month.equals("february")) {
			System.out.println("Winter and fall");
			
		
			System.out.println("you were born is season "+ month);
*/		
			
			
			
			
			
			
			
			
			
		/*
		Write a program that will read three inputs of scores (quiz, mid term, and final scores) and
		 determine the grade based on the following rules:
		 if the average score >=90 → grade=A
		 if the average score >= 70 and <90 → grade=B
		 if the average score>=50 and <70 → grade=C
		 if the average score<50 → grade=F
		*/
		
		System.out.print("score quiz : ");
		 int quiz =scan.nextInt();
		 System.out.print("score midterm : ");
		int midTerm = scan.nextInt();
		System.out.print("score final : ");
		int finalExam = scan.nextInt();
		
		int result = quiz+midTerm+finalExam;
		if(result>=90) {
			System.out.println("Grade = A");
		}else if (result >=70 && result<90) {
			System.out.println("Grade = B");
		}else if(result>=50 && result<70) {
			System.out.println("Grade = C");
		}else if(result<50) {
			System.out.println("Grade = F");
		}
		
		
		
		
		
		
		
	}

}
