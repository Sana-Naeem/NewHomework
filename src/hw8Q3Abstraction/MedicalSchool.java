package hw8Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{
	
	//This is an Abstract method-
	public abstract void anatomyLab();
	
	//This is a Non-Abstract method-
	public void biochemistryLab() {
		System.out.println("This is the Biochemistry Lab.");
		
	}
	
	public MedicalSchool() {
		System.out.println("This is the default constructor for Medical School Class.\n");
	
	}



}
