package com.syntax.class12;

public class StringDemo6 {

	public static void main(String[] args) {


		String str = "123455336899332";
		
		int counter = 0;
		for(int x = 0 ; x < str.length(); x++) {
			if(str.charAt(x)=='3') {
				counter++;
			}
		}
		System.out.println("We have "+counter+"  , 3 number");
		
		
	}

}
