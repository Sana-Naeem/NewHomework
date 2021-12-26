package hw8Q2UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		
		Daughter daughter = new Daughter();
		
		Daughter daughter2 = new Daughter("January", 25);
		
		daughter.daughter();
		
		daughter.daughterinfo("March", 22);
		
		System.out.println("\n-----------------------------------------\n");
		
		Father father = new Father();
		
		Father father2 = new Father("Mathew", 67, 'M', true);

		father.father();
		
		father.fatherinfo("Watson", 55, 'M', false);
		
		
	}
}
