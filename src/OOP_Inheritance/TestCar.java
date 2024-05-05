package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();//overridden
		b.stop();//inherited - from Car
		b.refuel();//inherited  - from Car
		b.autoParking();//individual
		b.engine();//inherited  - from Car
		b.billing();//overridden
		
		System.out.println(b.maxSpeed);
		
		Car.carDisplay();
		BMW.carDisplay();
		
		
		System.out.println(Car.price);
		System.out.println(BMW.price);
		
		//final var and method:
		b.RunFourWheels(); //inherited - from Car - Can inherit final, but cannot override
		System.out.println(b.minSpeed);
		
		Car.loadCar();
		BMW.loadCar();//inherited - from Car
		
		b.showBMW();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();//inherited - from Vehicle
		
		System.out.println("--------");	

		Audi au = new Audi();
		au.start();//inherited - from Car
		au.stop();//inherited - from Car
		au.refuel();//inherited - from Car
		au.theftSafety();//individual
		au.engine();//overridden  - from Vehicle/Grand father
		au.billing();//inherited - from Car
		System.out.println(au.maxSpeed);//inherited - from Car
		
		
		System.out.println("--------");
//		Truck tr = new Truck();
//		tr.engine();//inherited
//		tr.heavyLoading();//individual
//		
		System.out.println("--------");
		
		Honda h = new Honda();
		h.stop();
		h.refuel();
		h.start();
		h.fuelEff();//individual
		h.parking();
		
		System.out.println("--------");

		Car c1 = new Car();
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.fuelEff(); Parent Car cannot inherit from a child Honda(owner of fuelEff
		
		System.out.println("--------");

		//child class object can be referred by parent class ref variable
		//Top/Up Casting
		Car cr = new Honda();//IS-A relationship - EVERY NEW HONDA IS A CAR
		cr.start();//overridden
		cr.stop();//inherited
		cr.refuel();//inherited
		
		
		
		//child class object can be referred by GRAND PARENT class ref variable
		Vehicle v1 = new Honda(); //EVERY NEW HONDA IS A VEHICLE
		v1.engine();
		v1.billing();
//		v1.stop(); Only methods from Vehicle class

		
//		AND
		Vehicle v2 = new BMW();  //EVERY NEW BMW IS A VEHICLE
		v2.start();

		
//		//parent class object can be referred by child class ref variable?
//		//Down Casting : ClassCastException CCE - NOT ALLOWED in JAVA
//		Honda h1 = new Car();//EVERY NEW CAR CANNOT BE A HONDA - CCE- Not Allowed
		
//		Forcefully converting/Casting every new Car to Honda will confuse the compiler - CCE
		//Honda h2 = (Honda) new Car();

//		
//		Honda h3 = (Honda)new Vehicle(); CCE
//		
		//Casting Between Siblings
//		Honda h4 = (Honda) new BMW();// NEW BMW CANNOT BE A HONDA - run time and compile time
//		
		Car c4 = new BMW(); //Correct - TOP CASTING
		c4.billing(1050);
		

	}

}
