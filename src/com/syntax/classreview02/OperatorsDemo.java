package com.syntax.classreview02;
public class OperatorsDemo {
	public static void main(String[] args) {
		
		//Arithmetic Operators + - / * % Logical operators == != >= <= < > 
		
		int num = 10;
		int num2 = 10;
		
		System.out.println(num+num2);
		System.out.println(num>=num2);//num>num2=>f or num=num2=> f+t=t
		//whole 0-infinity negative infinity to positive infinity
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(num/num2);
		System.out.println(num%num2);
		
		System.out.println(10/3);
		System.out.println(10%3);
		System.out.println(10.0/3);
		System.out.println((int)10.0/3);
		System.out.println(10.0*3);
		
	}
}
