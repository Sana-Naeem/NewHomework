package hw7Q3Abstraction;

public class NYUniversity extends RockefellerUniversity{
	
	//This is an Abstract method-
	//public abstract void anthropology();
	//In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	
	public void physics() { 
		System.out.println("This is the Physic's Class.");	
	} //In a regular class we can only implement non-abstract methods.
	
	public NYUniversity() {
		System.out.println("This is the default constructor for NY University Class.\n");
	
	}
		
		
	
}
