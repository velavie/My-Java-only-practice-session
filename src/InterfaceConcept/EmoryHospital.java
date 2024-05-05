package InterfaceConcept;

//Child: 1 parent class. multiple(n)Parent Interfaces 
public class EmoryHospital extends Hospital implements USMedical, UKMedical, IndiaMedical{   //hover over 'EmoryHospital' select 'Add unimplemented methods
			//EmoryHospital extends Hospital and implements 3 Interfaces: USMedical, UKMedical and IndiaMedical
	
	//USMedical
	@Override
	public void physioServices() {
		System.out.println("EH----physioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("EH----oncologyServices");
		
	}

	@Override
	public void pediaServices() {
		System.out.println("EH----pediaServices");
		
	}
	
	//UKMedical
	@Override
	public void gynaeServices() {
		System.out.println("EH----gynaeServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("EH----orthoServices");
		
	}
	
	//IndiaMedical
	@Override
	public void cardioServices() {
		System.out.println("EH----cardioServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("EH----dentalServices");
		
	} 
	
	//EH - Individual Methods
	public void cancerServices() {
		System.out.println("EH----cancerServices");
	}
	
	public void nutritionServices() {
		System.out.println("EH----nutritionServices");
	}

	//Common method - will only be overidden ONCE in LAST INTERFACE - IndiaMedical- even though it exists in a  the interfaces
	@Override
	public void emergencyServices() {
		//you can then write your Business Logic here
		System.out.println("EH----emergencyServices");	
	}
	
	//duplicate billing method in Emory hospital - parent class
	public static void billing() {
		System.out.println("EM----billing");
	}
	
	@Override
	public void medicalInsurance() { //To override medicalInsurance replace 'DEFAULT keyword with PUBLIC kw
		System.out.println("Exception 2: can create method bosy with DEFAULT keyword");	
	}
	 //WHO
	@Override
	public void covidServices() {
		System.out.println("EM----covidServices");
		
	}

}
