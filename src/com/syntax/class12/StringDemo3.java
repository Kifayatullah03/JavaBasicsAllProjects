package com.syntax.class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Batch 13 is GreaT";
		System.out.println(str.startsWith("Batch"));
		System.out.println(str.endsWith("t"));
		System.out.println(str.endsWith("great"));
		System.out.println(str.toLowerCase().endsWith("t"));
		
		
		String name = "HAMID";
		System.out.println(name.toLowerCase());
		System.out.println(name);
		
	String query = "13";
		System.out.println(str.contains("13"));
		System.out.println(str.contains("is"));
		System.out.println(str.toLowerCase().contains("batch"));
		
		
		
	}

}
