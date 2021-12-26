package hw6Q2Inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n");

		Birds birds = new Birds(); //Here birds extends only the Animal class so Single Inheritance is shown here. 
		birds.birdsInfo();
		birds.animalInfo();

		System.out.println("\n");

		BullDog bullDog = new BullDog(); //Here BullDog extends Dog, Dog extends Mammal and Mammal extends Animal so Hierarchical Inheritance is shown here.
		bullDog.bullDogInfo();
		bullDog.dogInfo();	
		bullDog.mammalInfo();
		bullDog.animalInfo();
		
		System.out.println("\n");

		Cobra cobra = new Cobra(); //Here Cobra extends Snake, Snake extends Reptile and Reptile extends Animal so Hierarchical Inheritance is shown here.
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
			
		System.out.println("\n");

		Dog dog = new Dog(); //Here Dog extends to Mammal and Mammal extends to Animal so Multi level Inheritance is shown here.
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
	
		System.out.println("\n");
		
		Mammal mammal = new Mammal(); //Here Mammal only extends to the Animal class so Single Inheritance is shown here.
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n");

		Reptile reptile = new Reptile(); //Here Reptile only extends to the Animal class so Single Inheritance is shown here.
		reptile.reptileInfo();
		reptile.animalInfo();
	
		System.out.println("\n");
	
		Robin robin = new Robin(); ////Here Robin extends to Birds and Birds extends Animal so Multi level Inheritance is shown here.
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
	
		System.out.println("\n");

		Snake snake = new Snake(); //Here Snake extends to Reptile and Reptile extends to Animal so Multi level Inheritance is shown here.
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		

	
		
		
		
	}

}
