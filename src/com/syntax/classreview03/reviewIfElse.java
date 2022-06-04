package com.syntax.classreview03;

public class reviewIfElse {

	public static void main(String[] args) {
		
		
	/*	
		String userName = "asghar";
		String password = "pass123";
		
		if(userName.equals("asghar") && password.equals("pass123")){
			System.out.println("welcome back to Syntax");
		}else {
			System.out.println("username and password is not coorect");
		}
		*/
		
		
				
		String day = "Monday";
		if("Monday".equals(day)) {
			System.out.println("Weekday");
		}else if("Tuesday".equals(day)) {
			System.out.println("Weekday");
		}else if ("Wednesday".equals(day)) {
			System.out.println("Weekday");
		}else if ("Thursday".equals(day)) {
			System.out.println("Weekday");
		}else if ("Friday".equals(day)) {
			System.out.println("Weekday");
		}else if ("Saturday".equals(day)) {
			System.out.println("Weekend");
		}else if ("Sunday".equals(day)) {
			System.out.println("Weekend");
		}
		
		if(day.equals("Monday") || "Tuesday".equals(day)||"Wednesday".equals(day)
				||"Thursday".equals(day)||"Friday".equals(day)) {
			System.out.println("Weekday");
		}else if("Saturday".equals(day)||"Sunday".endsWith(day)) {
				System.err.println("Weekend");
			}else {
			System.out.println("not a valid day");
		}
		
		
		
		
		
		
		
		
	}
}
