package hw3Q4Constructor;

public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student();
		
		Student student1 = new Student("Sana",123974, 'F', true, 3.976f); //Here parameterized constructor is initialized
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------\n");

		Student student2 = new Student("Ray", 242825, 'M', true, 2.538f); //Here parameterized constructor is initialized
		
		System.out.println("\n-------------------------------------------------------------------------------------------------------------------\n");
		
		student.student("Samantha", 742729, 'F', false, 3.459f ); //Here Parameterized method is initialized
		
}

	}
