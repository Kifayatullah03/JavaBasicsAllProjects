
public class Dog {
	
	String name;
	String breed;
	int age;
	double width;
	
	void tailwaving() {
		System.out.println("When happay tail waving");
	}
	
	void playing() {
		System.out.println("Too much playing");
	}
	
    void barking() {
    	System.out.println("When happy and Interesting");
    }
	
		public static void main(String[] args) {
			

		Dog husky = new Dog();
		husky.breed = "Siberian";
		husky.name = "sky";
		husky.age = 6;
		husky.width = 23.52;
		
		System.out.println(husky.name);
		System.out.println(husky.breed);	
		husky.playing();
		husky.barking();
		
		System.out.println();
		
		
		
		Dog bullDog	= new Dog();
		bullDog.breed = "british";
		bullDog.name = "elis";
		bullDog.age = 8;
		bullDog.width = 30.2;

		
	
	System.out.println(bullDog.name);
	System.out.println(bullDog.breed);	
	bullDog.playing();
	bullDog.barking();
	
	System.out.println();
	
	
	
	Dog Labrador	= new Dog();
	Labrador.breed = "british";
	Labrador.name = "gendo";
	Labrador.age = 2;
	Labrador.width = 25.2;

		
	
	System.out.println(Labrador.name);
	System.out.println(Labrador.breed);	
	Labrador.playing();
	Labrador.barking();
	
	System.out.println();
	
	
	
	
	
	
	
	
	
	}

}
