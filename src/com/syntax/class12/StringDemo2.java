package com.syntax.class12;

public class StringDemo2 {

	public static void main(String[] args) {

	String firstName = "Adem";
	String lastName = "jones";
	String fullName = firstName + lastName;
	String fullName2 = firstName.concat(lastName);//dont use this type	
		
	System.out.println(fullName2);	
	System.out.println(fullName);	
		
	String name  = "";
	String namer = " ";
	System.out.println(name.isEmpty());	
	//System.out.println(namer.isBlank());	
		
	
	String str = " ne ver ";
	System.out.println(str.trim());
	}

}
