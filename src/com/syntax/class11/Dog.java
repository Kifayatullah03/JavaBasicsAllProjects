package com.syntax.class11;

public class Dog {
	
	// attributes how the object will look like
	String name;
	int age;
	double weight;
	String colour;
	double height;
	String breed;
	
	//how that object behave
	void bark() {
		System.out.println("Dog barks");
	}
	void walks() {
		System.out.println("Dog walks");
	}
	void eat() {
		System.out.println("Dogs like to eat bone");
	}

	public static void main(String[]args) {
		
		Dog jimmy= new Dog();
		//new Dog() how we create an object
		
		jimmy.name="Jimmy"; //creating an object and storing in a variable
		jimmy.age=6;
		jimmy.weight=16;
		jimmy.colour="white";
		jimmy.height=2.5;
		jimmy.breed="German";
		jimmy.bark();
		
		
		
		
		
	   }
	}
	
	
	

