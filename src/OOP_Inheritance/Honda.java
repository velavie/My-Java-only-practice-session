package OOP_Inheritance;

public class Honda extends Car {
	
	@Override
	public void start() {
		System.out.println("Honda -- start");
	}
	
	public void fuelEff() {
		System.out.println("Honda -- fuel Efficiency");
	}
	
	//To Access Parking method from BMW
		public void parking() {
			BMW bm = new BMW();
			bm.autoParking();
		}


}
