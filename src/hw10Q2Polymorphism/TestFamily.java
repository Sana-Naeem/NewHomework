package hw10Q2Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		
		System.out.println("----------------Sister class is Initialized Here----------------------\n");
		Sister sis = new Sister();
		sis.sister(2,5,12);
		sis.sister(6,3, "9");
		sis.sister();
		Sister.sister(10,5);
		sis.sister(1,7,2,5,3);
		sis.sister(7,"4");
		
		System.out.println("\n----------------Niece class is Initialized Here----------------------\n");
		Niece niece = new Niece();
		niece.sister(5,8,3);
		niece.sister(12,6,"8");
		niece.sister();
		niece.sister(9,"10");
		
		
	
	}

}
