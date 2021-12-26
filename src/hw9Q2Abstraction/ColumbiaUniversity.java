package hw9Q2Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{ 
	
	//This is an Abstract method-
	//public abstract void chemistry(); 
	//In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	
	public void biology() {
		System.out.println("This is the Biology Class.");
	} //In a regular class we can only implement non-abstract methods.
	
	
	public ColumbiaUniversity() {
		System.out.println("This is the default constructor for Columbia University Class.\n");
	}

	public static void Columbia() {
		System.out.println("This is the static method for Columbia University Class.");
	}
	
	
	@Override
	public void classSize() {
		System.out.println("classSize method is from College interface.");		
	}


	@Override
	public void playGround() {
		System.out.println("playGround method is from College interface.");		
		
	}


	@Override
	public void teacher() {
		System.out.println("teacher method is from College interface.");		
		
	}


	@Override
	public void emergencyRoom() {
		System.out.println("emergencyRoom method is from Hospital interface.");		
		
	}


	@Override
	public void surgeryRoom() {
		System.out.println("surgeryRoom method is from Hospital interface.");		
		
	}


	@Override
	public void cafeteria() {
		System.out.println("cafeteria method is from Hospital interface.");		
		
	}


	@Override
	public void lawInfo() {
		System.out.println("lawInfo method is from LawSchool interface.");		
		
	}


	@Override
	public void aeronauticalInfo() {
		System.out.println("aeronauticalInfo method is from AeronauticalSchool interface.");		
		
	}


	@Override
	public void vocationalinfo() {
		System.out.println("vocationalInfo method is from VocationalSchool interface.");		
		
	}


	@Override
	public void commonRoom() {
		System.out.println("commonRoom method is from University interface.");		
		
	}


	@Override
	public void laboratory() {
		System.out.println("laboratory method is from University interface.");		
		
	}


	@Override
	public void languageClub() {
		System.out.println("languageClub method is from University interface.");		
		
	}


	@Override
	public void anatomyLab() {
		System.out.println("anatomyLab method is from MedicalSchool Abstract Class.");		
	}


	@Override
	public void hygiene() {
		System.out.println("hygiene method is from Nursing School Abstract Class.");		
		
	}


	@Override
	public void mechanicalLab() {
		System.out.println("mechanicalLab method is from Engineering School Abstract Class.");		
		
	}

	
		
}
	
	
	


