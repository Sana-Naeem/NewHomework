package hw8Q2UseOfSuperInChildClass;

public class Father {

	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;
	
	public Father() { //Default Constructor is Declared here
		System.out.println("This is default constructor from Father Class.");
	}
	
	public Father(String name, int age, char sex, boolean usCitizen) { //Parameterized Constructor
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		
		System.out.println("Father name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen?: " + usCitizen);

		}
	
	public void father() { //Void type Method
		System.out.println("This is the void type method from Father Class.");
	}
	
	public void fatherinfo(String name, int age, char sex, boolean usCitizen) { //Parameterized Method
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		
		System.out.println("Father name: " + name + ", Age: " + age + ", Sex: " + sex + ", US Citizen?: " + usCitizen);

		}
}
