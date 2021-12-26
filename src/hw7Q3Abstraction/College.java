package hw7Q3Abstraction;

public interface College{
	//Interface can only define/declare abstract methods.
	
	public abstract void classSize();
	public abstract void playGround();
	public abstract void teacher();
	
	
	//public College() {
	//System.out.println("This is the default constructor for College University Class.\n");
	//}
	//We cannot create a constructor inside the Interface because the Interface cannot instantiate thus, inhibiting it from creating any objects.
	
	
	public default void dorm() {
		System.out.println("Dorm method is from College Interface.");
	}
	
	public static void studyRoom() {
		System.out.println("StudyRoom method is also from College Interface.");
	}
	

	
	
}
