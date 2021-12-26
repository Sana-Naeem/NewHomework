package hw7Q2Encapsulation;

public class Employee {
	
	//Here I have declared some private variables:
	 private String name;
	 private int age;
	 private char sex;
	 private boolean usCitizen;
	 
	//Here the private variables are being accessed by the getter setter method:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsCitizen() {
		return usCitizen;
	}
	public void setUsCitizen(boolean usCitizen) {
		this.usCitizen = usCitizen;
	}
	 

}
