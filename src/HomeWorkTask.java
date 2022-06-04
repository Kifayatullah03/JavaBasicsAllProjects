import java.util.Scanner;
public class HomeWorkTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*Ask user to enter their country and capture it.
		*Once valueTos are captured print which language user speaks.
		
		
		System.out.println("Please Enter your country");
		
		
		String country = scan.nextLine();
		String language;
		switch (country){
		
		case "USA":
			language = "English";
			break;
			
		case "Pakistan":
			language = "Urdu";
			break;
			
		case "Turkey":
			language = "Turkish";
			break;
			
		case "Russia":
			language = "Russian";
			break;
			
			default : 
			language = "invalid code";

		}	System.out.println("your language is "+language);
		
		/*
		if(country.equals("USA")) {
			language = "English";
		}else if(country.equals("Pakistan")) {
			language = "Urdu";
		}else if (country.equals("turkey")) {
			language = "turkish";
		}else if (country.equals("Russia")) {
			language = "russian";
		}else{
			language = "invalid code";
		}
		System.out.println("your language is "+language);
		
		
		
	*/
		

		
		
		/*Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		* A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		* At the end your program should print which grade was entered by a user with explanation.
		* 
		
		System.out.println("Please enter your grade");
		char grade = scan.next().charAt(0);
		String expl;		
		/*
		switch(grade) {
		
		case 'A':
			expl = "Excellent";
			break;
		
		case 'B':
			expl = "Good";
			break;
		
		case 'C':
			expl = "Average";
			break;
			
		case 'D':	
			expl = "Bad";
			break;
			
		default :
			expl = "Not Acceptable";
		}
		System.out.println(expl);
		
		
		
		
		
		if(grade == 'A') {
			expl = "Excellent";
		}else if (grade == 'B') {
			expl = "Good";
		}else if (grade == 'C') {
			expl = "Average";
		}else if(grade == 'D') {
			expl = "Bad";
		}else {
			expl = "Not Acceptable";
		}
		System.out.println(expl);
		
*/		
		
	/*using scanner class create calculator.
	 *  Allow user to enter 2 numbers and operator(+,-,*,/).
	 *   Based on operator provide the result to user.
	 Please complete this assignment in 2 ways: using if statement and switch case
	 
			System.out.println("Enter Number 1");
			int num1 = scan.nextInt();
			
			System.out.println("Enter Number 2");
			int num2 = scan.nextInt();
		
			System.out.println("Enter your Operator");
			
			char operator = scan.next().charAt(0);
			int result = 0;
		
			if(operator == '+' ) {
				result = num1+num2;
			}else if(operator == '-') {
				result = num1-num2;
			}else if(operator == '*') {
				result = num1*num2;
			}else if(operator == '/') {
				result = num1/num2;
			}else {
				System.out.println("NO comment");
			}
		
			System.out.println(result);
			
			*/
		
			
			/*	switch (operator) {
			
			case '+':
				result = num1+num2;
				break;
			
			case '-':
				result = num1-num2;
				break;
				
			case '*':
				result = num1*num2;
				break;
				
			case '/':
				result = num1/num2;
				break;

				
			}
			
			System.out.println(result);
		
	*/	
		
		/*Write a program to ask user to enter value for sale: yes or no
		*if there is no sale --> you are not going for shopping
		*if there is sale ask user which item they want to buy and it’s price
		*Based on the price you have to calculate
		*the price of the item after the discount, discount rule:
		*if price is less than $20 --> apply 10%
		*if price is between $20 & $100 --> 20%
		*if price between $100 & $500 --> 30%
		*otherwise apply 50% discount 
		*After discount ___ the price of the item reduce from __ to ___
		*/
		
		
		
		System.out.println("Please Enter value sale");
		String value = scan.next();
		
		if(value.equals("No")) {
			System.out.println("user is not going for shopping ");
		}else if(value.equals("yes")) {
			System.out.println("which item they want to buy");
		}
		
		double price = scan.nextDouble();
		double disCount = 0;
		double disCounted = 0;
		if(price <20) {
			disCount = 10;
		}else if(price>=20 && price<=100) {
			disCount = 20;
		}else if(price>100 && price<=500) {
			disCount = 30;
		}else {
			disCount = 50;
		}
		
		disCounted = ((100-disCount)*price)/100;
		disCounted = Math.round(disCounted*100.0)/100.0;
		
		System.out.println("After discount "+disCount+" % the price of the item reduce from "+price+" to "+disCounted);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}
}