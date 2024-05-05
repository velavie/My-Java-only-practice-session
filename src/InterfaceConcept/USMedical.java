package InterfaceConcept;

public interface USMedical extends WHO {
	
	int min_fee = 25;
	
	//Method declaration without method body = ABSTRACT Methods
	//only method declaration
	//only method prototype
	//cannot create object of an interface
	//interfaces cannot have Business logic
	//100% abstraction(without method body)  - neglect the 1.8 JDK exceptions
	
	public void physioServices(); //method body '{ }' not allowed
	
	public void oncologyServices();
	
	public void pediaServices();
	
	//creating a common method in all interfaces
	public void emergencyServices();
	
	//---------------------------------------------
	
	//After JDK 1.8: 2 Major Changes
	
	//1. Static method can be created with METHOD BODY
	public static void billing() {
		System.out.println("Exception 1: can create method bosy with STATIC METHOD");
	}
	
	//2. Default method can be created with METHOD BODY
	default void medicalInsurance() {
		System.out.println("Exception 2: can create method bosy with DEFAULT keyword");	
	}
	
	
	
}
