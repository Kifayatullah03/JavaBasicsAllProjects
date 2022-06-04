package com.task.code;
import java.util.Scanner;
public class CodingTask2 {


	public static void main(String[] args) {
		//using Scanner create  an array of countrys , when an array is created ,
		//retrieve all value from it and while retrieveing those values pritn capital for each country. 
		//(use 2 different loops

		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter the size of the array that you want to create");
		int arraySize=scan.nextInt();
		String [] countryArray=new String[arraySize];
		
		for(int i=0;i<countryArray.length;i++) {
			countryArray[i]=scan.next();
		}
		for(String element : countryArray) {
			if(element.equalsIgnoreCase("usa")) {
				System.out.println("Washington DC");
			}else if (element.equalsIgnoreCase("turkey")) {
				System.out.println("Ankara");
			}else if(element.equalsIgnoreCase("thiland")) {
				System.out.println("bankok");
			}else {
				System.out.println("country not supported by my great java program version 1.0");
			}
		}
		
		
		
		
	}

}
