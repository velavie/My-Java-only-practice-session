package OOP_Inheritance;

public class Car extends Vehicle{
	
	//final class -- can not be a parent -- can not be inherited
	//final methods -- can not be overridden but can be inherited
	//final var: constant var -- value can not be changed
	
	int maxSpeed = 100;
	
	static int price = 1000;
	
	final int minSpeed = 10;
	
	@Override
	public void start() {
		System.out.println("car -- start");
	}

	public void stop() {
		System.out.println("car -- stop");
	}

	public void refuel() {
		System.out.println("car -- refuel");
	}	
	
	@Override
	public void billing() {
		System.out.println("Car -- billing");//override from Vehicle
	}
	
	//Individual Car's billing method
	public void billing(int c) {
		System.out.println("Car -- billing");
	}
	
	public static void carDisplay() {
		System.out.println("Car -- display");
	}
	
//	private void show() {
//		System.out.println("Car--Show");
//	}
	
	public final void RunFourWheels() {
		System.out.println("Car--Run on For Wheels");
	}
	
	public static void loadCar() {
		System.out.println("Car--loadCar");
	}
	

}
