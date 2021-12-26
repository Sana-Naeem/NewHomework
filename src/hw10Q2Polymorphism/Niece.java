package hw10Q2Polymorphism;

public class Niece extends Sister {

	/**
	 * Method Overriding is also known as Late Binding, Dynamic Polymorphism or Run
	 * Time Polymorphism. In method overriding we can implement different methods by
	 * using the same "method name". In addition to that, the parameters/signature
	 * can also be the same but must have a different syntax or logic. Method
	 * overloading also only occurs during run time.
	 */

	@Override
	public int sister(int age1, int age2, int age3) { // Parameterized Return Type Method
		int total1 = age1 + age2 / 4 + age3;
		System.out.println("Total age of first sister is: " + total1);
		return total1;
	}

	@Override
	public int sister(int age1, int age2, String age4) { // Parameterized Return Type Method
		int total2 = age1 + age2 + Integer.parseInt(age4) + 3;
		System.out.println("Total age of second sister is: " + total2);
		return total2;
	}

	@Override
	public void sister() { // Void Type Method
		System.out.println("This is the void type method for Sister Class");
	}

	/**
	 * Here I have commented out the "Static Method" because anything that is static
	 * in nature belongs to the class from which it is originated. So, in this case
	 * the static method is coming from the class "Sister" which is why it cannot be
	 * overridden in the class "Niece".
	 * 
	 * @Override public static int sister(int age1, int age2) { //Static Method 
	 *           int total3 = age1 + age2; 
	 *           System.out.println("Total age of third sister is: " + total3); 
	 *           return total3; 
	 *           }
	 * 
	 * Here I have commented out the "Final Method" because any Variable
	 * or Method which is Final cannot be changed and one feature of
	 * overriding is in fact the ability to alter certain values if
	 * needed.
	 * 
	 * @Override public final int sister(int age1, int age2, int age3, int age5, int
	 *           age6) { //Final Method 
	 *           int total4 = age1 +age2 + age3 + age5 + age6; 
	 *           System.out.println("Total age of fourth sister is: " + total4); 
	 *           return total4; 
	 *           }
	 **/

	@Override
	public void sister(int age1, String age4) { // Void Type Parameterized Method
		int total5 = age1 * 2 + Integer.parseInt(age4);
		System.out.println("Total age of fifth sister is: " + total5);
	}

}
