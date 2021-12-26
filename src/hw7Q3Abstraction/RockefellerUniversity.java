package hw7Q3Abstraction;

public class RockefellerUniversity implements Hospital{
	
	//This is an Abstract method-
	//public abstract void math();
	//In a Regular Class we cannot declare/define abstract methods we can ONLY implement them.
	
	public void statistics() { 
		System.out.println("This is the Statistics Class.");	
	} //In a regular class we can only implement non-abstract methods.
	
	
	public RockefellerUniversity() {
		System.out.println("This is the default constructor for Rockefeller University Class.\n");
	
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
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	


}
