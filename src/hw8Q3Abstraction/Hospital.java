package hw8Q3Abstraction;

public interface Hospital extends College{
	
	public abstract void emergencyRoom();
	public abstract void surgeryRoom();
	public abstract void cafeteria();

	
	public default void morgue() {
		System.out.println("Morgue method is from Hospital Interface.");
	}
	
	public static void pharmacy() {
		System.out.println("Pharmacy method is also from Hospital Interface.");
	}

	
	
	
}
