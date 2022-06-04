package com.syntax.classreview04;
import java.util.Scanner;
public class WhileLoopsDemo03 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int x = 0;
	 while (x!=10) {
		 System.out.print("Enter a number:");
	  x = scan.nextInt();
	 
	  System.out.println(x=x+2);
	  
	 }
		
		scan.close();
	}

}
