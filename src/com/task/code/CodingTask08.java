package com.task.code;

public class CodingTask08 {

	public static void main(String[] args) {

		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// 0 11 2 3 5 8 13 21
		
		int priNum = 0;
		int current = 1;
		int nextNum = 0;
	    int pointNum = 10;
	    System.out.println(0+" ");
		System.out.println(1+" ");
		
		for(int x = 0; x < pointNum -2; x++) {
			nextNum = priNum+current;
			System.out.println(nextNum+" ");
			priNum = current;
			current = nextNum;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	/*	int previousNumber=0;
		int currentNumber=1;
		int nextNumber=0;
		int numbersToPrint=10;
		System.out.print(0+" ");
		System.out.print(1+" ");
		
		for(int i=0; i<numbersToPrint-2;i++) {
			nextNumber=previousNumber+currentNumber;
			System.out.print(nextNumber+" ");
			previousNumber=currentNumber;
			currentNumber=nextNumber;
			
			
		}	
	*/	
		
		
		
		
		
	}

}
