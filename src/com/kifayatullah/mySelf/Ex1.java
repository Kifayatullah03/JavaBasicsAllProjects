package com.kifayatullah.mySelf;

public class Ex1 {
	

	void createEmail(String userName , String lastName , String typeEm) {
		System.out.println(userName+lastName+"@"+typeEm+".com");
	}						//sameer //zabiullah//@//yahoo//.com
	
	
	

	public static void main(String[] args) {
	

		
	Ex1 ex  = new Ex1();	
	
		ex.createEmail("sameer","zabiullah", "yahoo");
		
	System.out.println(ex.isPrime(4));	
	ex.getGrade(86);
		
	}
	
	boolean isPrime(int num ) {
		boolean isItPrime = true;
		if(num <=1) {
			isItPrime = false;
			return isItPrime;
		}else {
			for(int x = 2; x <= num/2; x++) {
				if((num%x)==0) {
					isItPrime=false;
					break;
				}
			}
			return isItPrime;
		}
		
	}

	
	void getGrade(int score) {
		if(score >= 90) {
			System.out.println('A');
		}else if(score >= 80) {
			System.out.println('B');
		}else if(score >= 70) {
			System.out.println('C');
		}else if(score >= 50) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}
		
	}
/*
 * 
 * Create a method createEmail(). Based on values of users name, lastName and email type,
 *  your method should return complete email Address. Example:
 *    createEmail(John, Snow, gmail) → johnsnow@gmail.com 
 * Write a method to return whether given number is prime or not?
 * 
 * Create  class Student that will have a method getGrade. 
 * Your method should accept the score of a student and return a grade:
 * score > 90 - A
 * score >80 - B
 * score >70 - C
 * score > 50 - D
 * anything else - F
 * 
 */
	
	
}
