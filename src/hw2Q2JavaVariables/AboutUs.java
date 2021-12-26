package hw2Q2JavaVariables;

public class AboutUs {
	

	// (All the Variables are declared here)
	public String MyName;
	public byte myAge;
	public short myAnnualSalary;
	public int myRealestateInvestments;
	public long myCryptoInvestments;
	public char mySex;
	public float myMonthlyBusinessProfit;
	public double myAnnualBusinessProfit;
	public boolean usCitizen;

	
	// (The Constructor is declared here)
	public AboutUs() {

		System.out.println("\"This is all about me: \"\n");

	}
	 

	// (The Method is Implemented Here)

	public void aboutUs() {

		System.out.println("My name is: " + MyName + "\nMy age is: " + myAge + "\nMy annual Salary is: "
				+ myAnnualSalary + "\nMy realestate investments are: " + myRealestateInvestments
				+ "\nMy crypto investments are: " + myCryptoInvestments + "\nMy sex is: " + mySex
				+ "\nMy monthly business profit is: " + myMonthlyBusinessProfit + "\nMy annual business profit is: "
				+ myAnnualBusinessProfit + "\nAm I a US Citizen? : " + usCitizen);
		

	}

}
