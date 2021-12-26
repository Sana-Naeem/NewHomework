package hw9Q2Abstraction;

public class TestInstitute {
	public static void main(String[] args) {
	
	ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
	columbiaUniversity.classSize();
	columbiaUniversity.playGround();
	columbiaUniversity.teacher();
	columbiaUniversity.emergencyRoom();
	columbiaUniversity.surgeryRoom();
	columbiaUniversity.cafeteria();
	columbiaUniversity.lawInfo();
	columbiaUniversity.aeronauticalInfo();
	columbiaUniversity.vocationalinfo();
	columbiaUniversity.commonRoom();
	columbiaUniversity.laboratory();
	columbiaUniversity.languageClub();
	columbiaUniversity.anatomyLab();
	columbiaUniversity.hygiene();
	columbiaUniversity.mechanicalLab();
	ColumbiaUniversity.Columbia(); //Here I have called the static method from Columbia University Class.
	columbiaUniversity.physics();
	columbiaUniversity.gymnasium();
	columbiaUniversity.dorm();
	columbiaUniversity.morgue();
	columbiaUniversity.caring();
	columbiaUniversity.biochemistryLab();

	
	System.out.println("--------------------------------------------------------------");
	
	University university = new ColumbiaUniversity();
	university.commonRoom();
	university.laboratory();
	university.languageClub();
	university.gymnasium(); 
	University.library(); //Here I have called the static method from University Interface.
	university.classSize();
	university.playGround();
	university.teacher();
	university.dorm(); 
	university.morgue(); 
	university.emergencyRoom(); 
	university.surgeryRoom();
	university.cafeteria();	
	
	System.out.println("--------------------------------------------------------------");

	MedicalSchool medicalSchool = new ColumbiaUniversity();
	medicalSchool.anatomyLab();
	medicalSchool.biochemistryLab();
	ColumbiaUniversity.Medical(); //Here I have called the static method from Medical School Abstract Class.
	medicalSchool.hygiene();
	medicalSchool.caring(); 
	medicalSchool.lawInfo();
	medicalSchool.aeronauticalInfo();
	medicalSchool.mechanicalLab();
	medicalSchool.physics(); 
	
	
	
	
	
	
			
			
	
	
	
	
	
	}

}
