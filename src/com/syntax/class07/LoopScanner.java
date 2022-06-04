package com.syntax.class07;
import java.util.Scanner;
public class LoopScanner {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	/*we are going to ask you if you got a job 
	 * we continously asking 
	 * 
	 * job if you get a job untill you say yes
	
	 *once you say yes -->conges
	 */
		/*String job;
		do {
			
		System.out.println("did you get a job");
		job = scan.nextLine();
		}while(!job.equalsIgnoreCase("yes"));
		System.out.println("congratulation");
		
		*/
		
		/*String offer;
		System.out.println("Did you get a job ?");
		offer = scan.nextLine();
		while(!offer.equalsIgnoreCase("yes")) {
			System.out.println("Did you getr a job?");
		offer = scan.nextLine();
		} 
		
		System.out.println("congratulation");
		*/
	/*
		int n;
		while(true) {
			System.out.println("Enter a number between 1-10");
			n = scan.nextInt();
			
			if(n<1 || n>10) {
				System.out.println("Valid number ");
			
			
			continue;
			}
			break;
		}
		System.out.println(n + " is between 1 and 10");
		System.out.println();
		
		int l = 2;
		while(l<=Math.pow(2,20)) {
			System.out.println(l+" ");
			l=l*2;
		}
	
		*/
	String answr;
		do {
			System.out.println("what is the capital of zimbabwe?");
			 answr = scan.next();
		}while(!answr.equalsIgnoreCase("Harare"));
		System.out.println("yes ,you are right");
			
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }
	}