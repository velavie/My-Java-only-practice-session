package OOP_Inheritance;

public class BMW extends Car {
	
	int maxSpeed = 200;
	
	//static method cannot be Overriden, but can be Inherited
	static int price = 5000; //BMW.price will display 5000, but will display Parent class value if there is no Individual value
	
	final int minSpeed = 50;
	
	//Method overriding: Ploy+morphism(Run time - dynamic binding)
	//When you have a method in parent class and child class also
	//with the same name
	//with the same number of parameters
	//same type of parameters
	//same sequence of parameters
	//same return type
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- auto parking");
	}

	@Override
	public void billing() {
		System.out.println("BMW - billing");
	}

	//static method can not be overridden
	//Method Hiding: Both methods exist in Parent Car as well. But caanot be overridden here bc iti is static
	public static void carDisplay() {
		System.out.println("BMW -- display");
	}
	
	//private methods cannot be overriden
	private void show() {
		System.out.println("BMW--Show");
	}
	
	//To access show method, we use encapulation - create a public method and call the public one from there
	public void showBMW() {
		show();
	}
	
	//Final methods cannot be overridden, but can be called and inherited from Parent
//	public final void RunFourWheels() {
//		System.out.println("Car--Run on For Wheels");
//	}

}
