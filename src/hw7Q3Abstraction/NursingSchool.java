package hw7Q3Abstraction;

public abstract class NursingSchool extends EngineeringSchool{
	
	//This is an Abstract method-
	 public abstract void hygiene();
	 
	 //This is a Non-Abstract method-
	 public void caring() {
		 System.out.println("Our Nursing School is Caring.");
		 
	 }

	 public NursingSchool() {
			System.out.println("This is the default constructor for Nursing School Class.\n");
		}

	 
}
