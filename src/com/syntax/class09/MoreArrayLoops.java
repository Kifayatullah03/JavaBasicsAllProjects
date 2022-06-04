package com.syntax.class09;

public class MoreArrayLoops {

	public static void main(String[] args) {
		
		
		
		int[] numbers = {12 , 23 , 3 , 5 , 4 };
		for (int num : numbers) {
			System.out.print(num+" ");
			}	
		System.out.println();
		System.out.println("------------------------------");
		
	/*Create an array of cars and store 6 elements into it.
	*Using 2 different loops print all values from the array.
	*/
		
		
	//way1
	
		String[] cars = new String[6];
		
        cars[0] = "BWM";
		cars[1] = "Toyota";
		cars[2] = "Lexus";
		cars[3] = "cadillac";
		cars[4] = "Hyunda";
		cars[5] = "Lambo";
		for(int x = 0; x < cars.length; x++ ) {
			System.out.println(cars[x]);	
		}
		
		
							
		System.out.println();
		System.out.println("----------------------------");
	//way2
		String[] car = {"BWM" , "Lambo" , "Hyunda" , "Toyota" , "cadilac" , "Lexus" };
		for(String car1 : car) {
			System.out.println(car1);
		}
		
		
		
		System.out.println();
		System.out.println("----------------------------------------");
		
		
		/*Create an array of animals and store 5 elements into it.
		 *Using 2 different loops print all elements from the array.
		 */

		String[] animals = {"cat" , "dog" , "lion" , "monkey" , "hourse" , "fox" };
		for(int y = 0; y < animals.length; y++) {
			System.out.print(animals[y]+" ");
			
		}
	//way2
		for(String animal : animals) {
			System.out.println(animal);
		}
		
	System.out.println();
	System.out.println("-----------------------------------------");
	
	/*Create an array to store double values and then print 
	 *all elements using 2 different loops
	 */
		
	//way2
	double [] numbers1 = {1.22 , 2.21 , 3.23 , 4,45};

	int z = 0;
	for(; z<numbers1.length; z++) {
		System.out.print(numbers1[z]+" ");
	}

	System.out.println();System.out.println("_______________________");

	System.out.println();System.out.println("____________________________");
	
	/*Create an array on integers and calculate
	 *the sum of all elements in an array 
	 */
	
	
	int[] intNumbers = {20 , 42 , 24 , 54 , 75 };
		int sum = 0;
		
		for(int x = 0; x < intNumbers.length; x++) {
			sum = sum+intNumbers[x];
		}
		System.out.println(sum);
		
		
		sum = 0;
		for(int n : intNumbers) {
			sum+=n;			
		}
		System.out.println(sum);
		
	
	
	
	
	
	
	
	}

}
