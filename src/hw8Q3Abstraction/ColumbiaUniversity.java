package hw8Q3Abstraction;

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


	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void vocationalinfo() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}

	
		
}
	
	
	


