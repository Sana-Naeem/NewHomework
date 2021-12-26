package hw7Q3Abstraction;

public interface University extends College {

	public abstract void commonRoom();

	public abstract void laboratory();

	public abstract void languageClub();

	public default void gymnasium() {
		System.out.println("Gymnasium method is from University Interface.");
	}

	public static void library() {
		System.out.println("Library method is also from University Interface.");
	}

	/**
	 * i) How many keywords are used for the inheritance in Interface, answer by
	 * Java comments? Answer: Only ONE keyword is used for the inheritance in
	 * Interface which is "extends" keyword.
	 * 
	 * Can an interface inherit other Interface, or a regular class or abstract
	 * class? Answer: Yes, an Interface can inherit another Interface. However, an
	 * interface CANNOT inherit a regular class or abstract class.
	 * 
	 * How many inheritance is possible? Use the Interface "University" to answer my
	 * questions (by multiple line comments). Answer: An interface can inherit more
	 * than one interface. For example: public interface University extends College,
	 * Hospital{
	 * 
	 * ii) You have 3 abstract class names MedicalSchool, EngineeringSchool, and
	 * NursingSchool. How many keywords are used for the inheritance in Java for
	 * Abstract Class? Answer: In Java while using inheritance for an Abstract class
	 * we can use Two keywords specifically: "extends (or) implements".
	 * 
	 * Can an Abstract Class inherit other Abstract Class or a regular class or
	 * interface? Answer: Yes, an Abstract class Can inherit other Abstract Class or
	 * a Regular class or Interface.
	 * 
	 * How many inheritances is possible by an Abstract Class? Use the all of above
	 * Abstract Classes and use the keywords to answer my questions. Answer: An
	 * Abstract class Can inherit either Only ONE abstract class or Only ONE regular
	 * class by using the extends keyword. In addition to that, an abstract class
	 * can also inherit One or More interface(s) by using the keyword 'implements'.
	 * 
	 * iii) You have 3 regular class names ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. How many keywords are used for the inheritance in Java
	 * for a regular Class? Answer: In Java while using inheritance for a Regular
	 * class we can use Two keywords specifically: "extends (or) implements".
	 * 
	 * Can an regular Class inherit other Abstract Class or a regular class or
	 * interface? Answer: Yes, a Regular class Can inherit other Abstract Class or a
	 * Regular class or Interface.
	 * 
	 * How many inheritances is possible by a regular Class? Use the all of above
	 * regular Classes and use the keywords to answer my questions. Answer: A
	 * Regular class Can inherit either Only ONE regular class or Only ONE abstract
	 * class by using the extends keyword. In addition to that, an abstract class
	 * can also inherit One or More interface(s) by using the keyword 'implements'.
	 * 
	 */

}
