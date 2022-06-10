package com.syntax.class11;

public class Phone {
	
	String name;
	String model;
	String brand;
	String colors;
	int year;
	double screenInch;
	
	
	void calling() {
		System.out.println("calling someone");
	}
	
	void volumeUp() {
		System.out.println("voice Up");
	}

	void volumeDown() {
		System.out.println("voice down");
	}
	
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		
		iphone.brand = "Iphone";
		iphone.year = 2021;
		iphone.colors = "black,blue"; 
		iphone.model = "13pro , 13promax";
		iphone.screenInch = 6.06;
		
		System.out.println(iphone.brand);
		
		iphone.calling();
		iphone.volumeDown();
		iphone.volumeUp();
	
		System.out.println();
		
		Phone pixel = new Phone();
		
	pixel.brand = "pixel";	
	pixel.year = 2021;
	pixel.colors = "white/black";
	pixel.model = "pixel6";
	pixel.screenInch = 5.1;
	
	pixel.calling();
	pixel.volumeUp();
	pixel.volumeDown();
	System.out.println(pixel.brand);
	
	
	System.out.println();
	Phone samsung = new Phone ();
	
	samsung.brand = "Samsung";
	samsung.year = 2021;
	samsung.model = "S22";
	samsung.screenInch = 8.2;
	samsung.colors = "pink/white";
	
	System.out.println(samsung.brand);
	samsung.calling();
	samsung.volumeDown();
	samsung.volumeUp();
	System.out.println(samsung.colors);
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
