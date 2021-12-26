package hw7Q3Abstraction;

public abstract class EngineeringSchool extends MedicalSchool{
	
	//This is an Abstract method-
	public abstract void mechanicalLab();
	
	//This is a Non-Abstract method-
	public void computerLab() {
		System.out.println("This is the Computer Lab.");
		
	}
	
	public EngineeringSchool() {
		System.out.println("This is the default constructor for Engineering School Class.\n");
	
	}
	
	

}
