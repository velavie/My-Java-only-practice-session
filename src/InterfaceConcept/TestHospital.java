package InterfaceConcept;

public class TestHospital {
	// For Testing everything
	
	
	public static void main(String[] args) {
		//can create object of the class name here and use the object ref to call all the interface methods
		EmoryHospital eh = new EmoryHospital();
		eh.cancerServices();
		eh.cardioServices();
		eh.dentalServices();
		eh.gynaeServices();
		eh.nutritionServices();
		eh.oncologyServices();
		eh.orthoServices();
		eh.pediaServices();
		eh.physioServices();
		eh.emergencyServices();
		USMedical.billing(); //calling the child copy of billing method: Static - hence referring the class name
		EmoryHospital.billing(); //calling the parent billing method
		eh.covidServices();//From WHO
		
		//USMedical.min_fee = 40; //This cannot work: min_fee/Interface Variables are Static and final in nature - stays 25.
		System.out.println(USMedical.min_fee);
		
		System.out.println("----------------");
		//Cannot create object of an interface
		//USMedical um = new USMedical(); //Not allowed
		
		//Top Casting: access only methods from referenced class
		//Child class object can be referred by parent interface ref variable
		USMedical us = new EmoryHospital();
		//WebDriver driver = new ChromeDriver(); - an example in Selenium
		us.oncologyServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyServices(); //the common method shows in all interfaces
		//us.gynaeServices();//not possible because only USMedical ppties that is refd OR anything not overriden from USMedical
		
		//UKMedical Example
		UKMedical uk = new EmoryHospital();
		uk.cardioServices();
		uk.dentalServices();
		uk.emergencyServices(); //the common method shows in all interfaces
		//uk.oncologyServices();//not possible because only UKMedical ppties that is refd OR anything not overriden from UKMedical
		
		//IndiaMedical Example
		IndiaMedical in = new EmoryHospital();
		in.gynaeServices();
		in.orthoServices();
		in.emergencyServices(); //the common method shows in all interfaces
		//in.oncologyServices();//not possible because only IndiaMedical ppties are refd OR anything not overriden from UKMedical
				
		
		//DOWN Casting: 
		//Parent class object can be referred by Child interface ref variable
		//EmoryHospital eh1 = new USMedical(); //NOT POSSIBLE in OOP/JAVA
		
		
	}

}
