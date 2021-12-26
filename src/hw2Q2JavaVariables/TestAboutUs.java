package hw2Q2JavaVariables;

public class TestAboutUs {


	public static void main(String[] args) {

		AboutUs aboutUs1 = new AboutUs(); // (Here the Constructor is Initialized)

		// (Below the variables are Initialized)
		aboutUs1.MyName = "Sana Naeem";
		aboutUs1.myAge = 25;
		aboutUs1.myAnnualSalary = 30000;
		aboutUs1.myRealestateInvestments = 400000;
		aboutUs1.myCryptoInvestments = 1000000000000l;
		aboutUs1.mySex = 'F';
		aboutUs1.myMonthlyBusinessProfit = 3.25328f;
		aboutUs1.myAnnualBusinessProfit = 9.374692616677;
		aboutUs1.usCitizen = true;
		aboutUs1.aboutUs(); // (Here the method is Initialized)

		System.out.println("\n---------------------------------------------------------\n");

		AboutUs aboutUs2 = new AboutUs(); // (Here the Constructor is Initialized)
		// (Below the variables are Initialized)
		aboutUs2.MyName = "Alex";
		aboutUs2.myAge = 30;
		aboutUs2.myAnnualSalary = 20000;
		aboutUs2.myRealestateInvestments = 45000000;
		aboutUs2.myCryptoInvestments = 6050000000000l;
		aboutUs2.mySex = 'M';
		aboutUs2.myMonthlyBusinessProfit = 5.4772649f;
		aboutUs2.myAnnualBusinessProfit = 2.428746729020;
		aboutUs2.usCitizen = false;
		aboutUs2.aboutUs(); // (Here the method is Initialized)

	}

}
