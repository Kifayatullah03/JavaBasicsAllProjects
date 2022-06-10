package com.syntax.class12;

public class StringDemo08 {

	public static void main(String[] args) {

		String str = "Java is Easy";
	// way1	
		String str2 = str.substring(0,12);
		System.out.println(str2);
		
	//way2
		System.out.println(str.substring(8,11));
	}

}
