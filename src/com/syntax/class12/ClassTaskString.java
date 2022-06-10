package com.syntax.class12;
import java.util.Scanner;
public class ClassTaskString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	/*
	 * Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
	Password should be minimum 8 characters, if less → message=”Password is too short”.
	Password cannot contain username if so, → message=”Password cannot contain username”.
	Password should match confirmed password, if not  → message=“Passwords do not match”.
	 */
		
	/*	
	String userName = "Admin";
	String password = "admin003";
	String confirmPassword = "admin003";
	if(userName.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
		System.out.println("Username and password connot be empty!");
	}else if(password.length() < 8) {
		System.out.println("password is too short");
	}else if(password.contains(userName)) {
		System.out.println("password Connot contain username");
	}else if(!password.equals(confirmPassword)) {
		System.out.println("passowrds do not match");
	}else {
		System.out.println("WELCOME CHEIF TO FACEBOOK");
	}
	
		
	/*@here Some more tasks as your homework.
	Create a String and if the String is not empty perform the following: 
	if the String has an odd number of characters and has 3 or more characters,
 	print the character in the middle of the String.

	Create a String and print it in reverse order (Sunday → yadnuS).
	
	Write a program that reads two people's first
	names and if they expecting boy or girl? 
	Based on the input suggests a name for a baby:
	Example Output:
	Mom's first name? Mary
	Dad's first name? Daniel
	Boy or Girl? boy
	Suggested baby name: DANRY

	Example Output:
	Mom's first name? Mary
	Dad's first name? Daniel
	Boy or Girl? girl
	Suggested baby name: MAIEL
*/
	
		/*Write code that will take in a String input and check to see if it is a palindrome or not.
		  A palindrome means that the characters are the same forwards and backwards, ignoring spaces.
		 * 
		 */
		
		  //System.out.print("In:");
		  
		    //String givenString = "apple";
		   	//write your code below
		   // if(givenString.equalsIgnoreCase("apple")){
		     // System.out.println("this is fruit");
		    //}
		  //  System.out.println(givenString.replaceAll(givenString, "orange"));
		    
		/* 
		 * MUST TRY AGAIN
		 *    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    //write your code below

    for(int x = s.length()-1; x>=0; x--){
      System.out.print(s.charAt(x));
    }

    
 
		 */
		

	
		
		  
		    System.out.print("In:");
		    String x = scan.nextLine();
		   	//write your code below
		    boolean palindromes;
		    if(x.indexOf(0)==x.lastIndexOf(x)) {
		       if(true) {
		    	  if(x.equalsIgnoreCase(x)) {
		    		  System.out.println(x);
		     }
	  }            
		
}		else {
	System.out.println(false);
		
}
		
/*
		  // second task
	//Create a String and print it in reverse order (Sunday → yadnuS).
	String week = "Sunday";
	String reweek = "yadnuS";
	System.out.println(week.replaceAll(week ,reweek));

	
	
/*	
	    Create a String and if the String is not empty perform the following: 
		if the String has an odd number of characters and has 3 or more characters,
	 	print the character in the middle of the String.



	*/
	//10/2 =0 even    11/2 != 0 odd
	//even numbre---> numbers%2==0
	//String means arrays of char 
/*		String numbers = "12345";
	if(!numbers.isEmpty()) {
	if(numbers.length()%2!=0 && numbers.length() >= 3) {
	System.out.println("Middle character : "+numbers.charAt(numbers.length()/2));
	}
		}
	
	
	*/
	
	
	
	
	
	
	
	
	
	/*Write a program that reads two people's first
	names and if they expecting boy or girl? 
	Based on the input suggests a name for a baby:
	Example Output:
	Mom's first name? Mary
	Dad's first name? Daniel
	Boy or Girl? boy
	Suggested baby name: DANRY

	Example Output:
	Mom's first name? Mary
	Dad's first name? Daniel
	Boy or Girl? girl
	Suggested baby name: MAIEL
	*/ //david
	//substring  == 0 , dadlength
	/*	
	System.out.print("Mom's first name? ");
	String momN = scan.next();
	System.out.print("Dad's first name? ");
	String dadN = scan.next();
	System.out.print("Do you expecting boy or girl? ");
	String gender = scan.next();
	int dadlength = dadN.length()/2; 
	int momlength = momN.length()/2;
	if(gender.equalsIgnoreCase("Boy")) {
		
		System.out.println("Suggested baby name: "+dadN.substring(0,dadlength)+momN.substring(0, momlength) );	
	}else if(gender.equalsIgnoreCase("Girl")) {
		System.out.println("Suggested baby name: "+momN.substring(0, momlength)+dadN.substring(0, dadlength));
	}else {
		System.out.println("TRY AGAIN");
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	}
}
