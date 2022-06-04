package com.syntax.class07;

public class DoWhileLoop {

	public static void main(String[] args) {

		
	/*	//while loop always check condition first then enter block brackets
		int num1 = 1;
		
		while(num1<=3) {
			System.out.print(num1+" ");
				num1++;
		}
		
		System.out.println("--------------------");
		
		//do while loop first print the code the check the condition;
	/*	
		int num = 1;
	
		do {
			System.out.print(num+" ");
			num++;
		}while(num<=3);
		
*/
		//10-100  10,10
	/*		int x = 10;
	
		do {
			System.out.println(x+"\t");
			x+=10;
		}while(x<=100);
		
	*/	
		
		
		
		for(int x = 1; x<=10; x++) {
			for(int y = 1; y<=x; y++)
				System.out.print((x*y)+" ");
			
			System.out.println();
		}
		
		System.out.println();
		System.err.println();
		
		for( int k = 1; k<=10; k++) {
			for(int g = 1; g<=10; g++)
				System.out.print((k*g)+" ");
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(x>=y){
		 * sout("ahmad");
		 * 
		 * }else{
		 *    sout("Fail");
		 * }
		
		System.out.println("--------------------------------------");
		
		int x = 1;
		do {
			System.out.print(x+" ");
			x++;
		}while(x<=30);
		
		
*/		
/*		
		System.out.println("--------------------------------------");
		
		int z = 70;
		do {
			if(z%2!=0) {
		System.out.print(z+" ");
			}	z--;
		}while(z>30);
		
		System.out.println("----------------------------------------------");
		
		
		int k = 70;
		do {
			System.out.print(k+" ");
				k-=2;
		}while(k>=30);
	*/
	}

}
