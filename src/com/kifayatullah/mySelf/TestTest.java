package com.kifayatullah.mySelf;

public class TestTest {
		public static void main(String[] args) {

	//find sum all even and odd number form 1-70
			
		int sumOdd = 0;
		int sumEven  = 0;
		
		for (int x = 1; x<=70; x++) {
			if(x%2!=0) {
				sumOdd += x;	
			}else {
			
				sumEven += x;
			}
				
		}
			
		System.out.println(sumEven);
		System.out.println(sumOdd);
			
    }
}
