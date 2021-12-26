package hw1Q2JavaBasics;

public class My_address {

public static String MyName = "Sana Naeem";
public static int houseNumber= 2569;
public static String streetName= " Lurting Avenue";
public static String City = "Bronx,";
public static char stateName = 'N';
public static char state = 'Y';
public static int zipCode= 10469;
public static boolean location = true;

public static void my_address () { 
	
	System.out.println(MyName+"\n"+houseNumber+streetName+"\n"+City+stateName+state+" "+zipCode);
	System.out.println("Is this address in the USA? Ans: " +location);
	
	
}
public static void main(String[] args) {		
	my_address();
	
}

}

//test
//test 2




