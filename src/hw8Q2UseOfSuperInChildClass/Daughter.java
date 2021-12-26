package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {
	
	public String birthMonth;
	public int age;
	
	public Daughter() { //Default Constructor is declared here. 
		super("Alex", 46, 'M', false); //This is the parameterized constructor of Daughter Class.
		super.father(); //Here I have called the void type method from "Father Class".
		super.fatherinfo("April", 61, 'M', true); //Here I have called the parameterized method from "Father Class".
		super.FamilyName = "Alex"; //Here I have initialized a value to variable FamilyName which is from "Father Class".
		System.out.println("The family name here is: " + FamilyName);
		System.out.println("This is the default constructor from Daughter Class.");
		System.out.println("\n");
	}
	
	public Daughter(String birthMonth, int age) { //Parameterized Constructor
		super(); //Here I have called the Default Constructor from "Father Class". We cannot call parameterized constructor here as 			only one constructor is allowed.
		super.father(); 
		super.fatherinfo("John", 44, 'M', true); 
		super.FamilyName = "John"; 
		System.out.println("The family name here is: " + FamilyName);
		System.out.println("Daughter Birth Month: " +birthMonth + ", Age: " + age);
		System.out.println("\n");

	}
	
	public void daughter() { //Void type Method
		super.father();
		super.fatherinfo("Waldo", 54, 'M', false);
		super.FamilyName = "Waldo";
		System.out.println("The family name here is: " + FamilyName);
		System.out.println("This is the void type method from Daughter Class");
		System.out.println("\n");

	}
	
	public void daughterinfo(String birthMonth, int age) { //Parameterized Method
		super.father();
		super.fatherinfo("Miguel", 88, 'M', true);
		super.FamilyName = "Miguel";
		System.out.println("The family name here is: " + FamilyName);
		System.out.println("Daughter Birth Month: " +birthMonth + ", Age: " + age);
	}
	
	
	
	
}
