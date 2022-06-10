package com.syntax.class13;

public class Recap {

	public static void main(String[] args) {

		
		
/*
 * 
 * Create a method createEmail(). Based on values of users name, lastName and email type,
 *  your method should return complete email Address. Example:
 *    createEmail(John, Snow, gmail) → johnsnow@gmail.com or
 * Write a method to return whether given number is prime or not?
 * Create  class Student that will have a method getGrade. 
 * Your method should accept the score of a student and return a grade:
 * score > 90 - A
 * score >80 - B
 * score >70 - C
 * score > 50 - D
 * anything else - F
 */
		
		
		
		/*
		 *Create a method that will take 2 parameters as a numbers and prints which number is larger.
		 *Create a method that will take a number and prints whether the number is even or odd.
		 *Create a method that will print whether given String is palindrome or not.
		 *Create a method that will say Hello in different language based on the country 
		 *that will passed when method is executed
		 */
		Recap task = new Recap();
		
		task.numbers(3, 2);
		task.number(7);

		System.out.println();
		
	Recap task1 = new Recap();	
		
		System.out.println(task.palistr("rever"));
		
		System.out.println();
		
		System.out.println(task1.x("ohhhhh"));

		Recap country = new Recap();
		
	country.language("Asalam Alikom");
	
	}
	

	//task1
	void numbers(int x, int y) {
		if(x>y) {
			System.out.println("The large number is "+x);
		}else {
			System.out.println("The large number is "+y);
		}
		
	}
	
	
	
	
	
	void number(int l) {
		if(l%2!=0) {
			System.out.println("It is odd number");	
		}else {
		System.out.println("It is even number");
		}
		
		
	}
	
	
	
	void language(String str) {
		if(str.equalsIgnoreCase("USA")) {
			System.out.println("Hello");
		}else if(str.equalsIgnoreCase("Khurasan")) {
			System.out.println("Asalam Alikom");
		}else if(str.equalsIgnoreCase("Russia")) {
			System.out.println("privet");
		}else {
			System.out.println("Out of country!!!");
		}
	}
	
	
		//Recap task1 = new Recap();	
	
	  //System.out.println(task.palistr("rever"));
	
	
	
	//*Create a method that will print whether given String is palindrome or not.

	boolean palistr(String str) {//str == hellh --->hlleh	 	
		
		StringBuilder s = new StringBuilder(str);
		
		
		s.reverse();		
		
		String rev = s.toString();
	if(str.equalsIgnoreCase(rev)) {
		return true;
	}else {
		return false;
	}
	
	}
	
	
	
	
	boolean x(String s) { //helh == hleh
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		//String rev  = sb.toString();
		
		if(s.equalsIgnoreCase(sb.toString())) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
