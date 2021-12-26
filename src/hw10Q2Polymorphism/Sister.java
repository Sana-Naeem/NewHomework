package hw10Q2Polymorphism;

public class Sister {

	/**
	 * Method Overloading is also known as Early Binding, Static Polymorphism or
	 * Compile Time Polymorphism. In method overloading we can implement different
	 * methods by using the same "method name". However, the parameters/signature have
	 * to be written in different combinations. Method overloading also only occurs during
	 * compile time.
	 */

	public int sister(int age1, int age2, int age3) { // Parameterized Return Type Method
		int total1 = age1 + age2 + age3;
		System.out.println("Total age of first sister is: " + total1);
		return total1;
	}

	public int sister(int age1, int age2, String age4) { // Parameterized Return Type Method
		int total2 = age1 + age2 + Integer.parseInt(age4);
		System.out.println("Total age of second sister is: " + total2);
		return total2;
	}

	public void sister() { // Void Type Method
		System.out.println("This is the void type method for Sister Class");
	}

	public static int sister(int age1, int age2) { // Static Method
		int total3 = age1 + age2;
		System.out.println("Total age of third sister is: " + total3);
		return total3;
	}

	public final int sister(int age1, int age2, int age3, int age5, int age6) { // Final Method
		int total4 = age1 + age2 + age3 + age5 + age6;
		System.out.println("Total age of fourth sister is: " + total4);
		return total4;
	}

	public void sister(int age1, String age4) { // Void Type Parameterized Method
		int total5 = age1 + Integer.parseInt(age4);
		System.out.println("Total age of fifth sister is: " + total5);
	}

}
