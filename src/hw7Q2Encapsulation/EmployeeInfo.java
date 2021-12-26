package hw7Q2Encapsulation;

public class EmployeeInfo {

	// Here the variables are being executed under the main method:

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Sana");
		employee.setAge(25);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println("Name: " + employee.getName() + " \nAge: " + employee.getAge() + " \nSex: "
				+ employee.getSex() + " \nIs employee a US Citizen?: " + employee.isUsCitizen());

		System.out.println("\n--------------------------------------------------------\n");

		Employee employee2 = new Employee();
		employee2.setName("John");
		employee2.setAge(23);
		employee2.setSex('M');
		employee2.setUsCitizen(false);

		System.out.println("Name: " + employee2.getName() + " \nAge: " + employee2.getAge() + " \nSex: "
				+ employee2.getSex() + " \nIs employee a US Citizen?: " + employee2.isUsCitizen());

	}

}
