package com.syntax.class12;

public class StringDemo05 {

	public static void main(String[] args) {
		
	
		String str = "Sameer is a good guy and kind also";
		
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(2));
		//for finding all character
	//	for(int i = 0; i < str.length(); i++) {
			//System.out.println(str.charAt(i));
		//}
		
		//find how many 'a' string have 
		int counter = 0;
		for(int x = 0; x < str.length(); x++) {
			if('a'== str.charAt(x) || 'A'==str.charAt(x) ) {
				counter++;
			}
		}
		System.out.println("A appeared "+ counter+" in the String");
		
	}

}
