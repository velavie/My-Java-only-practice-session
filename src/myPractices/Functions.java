package myPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {
	//1. check - function: No input no return
	public void check() { // 0 parameter
		System.out.println("Testing Check Method");	
	}
	
	//2. prod - function: some input no return
	public void prod(int amt) { //1 parameter
		System.out.println("Checking Amount of Products combined");
		int prodavg = amt * 12;
		System.out.println("Total Product Amount is : " +prodavg);		
	}
	
	//3. multi - function: some input some return
	public int multi (int a, int b) { // return 2 parameters
		System.out.println("To multiply Two numbers");
		int m = a*b;
		return m;
	}
		
	//4. No input some return type: String
	public String getInfo() {
		System.out.println("Getting some Info");
		String h = "Hello number 4";
		return h;
	}
	//5. Return type - boolean
	public boolean isAppExist() {
		return true;	
	}
	
	//6. ensure all created variables/in class are utilized
	public int myMonthlyBill(int m1, int m2, int m3) {
		int avgM = (m1 + m2 +m3)/3;
		return avgM;
	}
	
	//7. Return type: String static array
	public String[] carTypes() {
		System.out.println("To get 4 Car Types only");
		String mCars[] = {"Mercedes", "Ford", "Toyota", "Acura"};
		return mCars;			
	}
	
	//8. Return type: String ArrayList
	public ArrayList<String> getPlayList() {
		System.out.println("getting my playlist");
		ArrayList<String> pList = new ArrayList<String>();
		pList.add("Maroon5");
		pList.add("Bonny M");
		pList.add("James Last");
		pList.add("Burna Boy");
		pList.add("Davido");
		 return pList;
	}
	
	
	
		
	public static void main(String[] args) {
		//1. check
		Functions obj = new Functions();
		
		obj.check(); //object ver calling function/method check
		
		//2. prod
		obj.prod(6); //calling function by passing a value - 6: value/argument
		obj.prod(200);
		
		//3a. multi
		//System.out.println(obj.multi(25, 20)); // correct, but not best practice
		int x = obj.multi(25, 20); //Note: If function has a return, always store in a variable
		System.out.println(x);
		
		//3b. more calculations with same function
		int y = obj.multi(40, 22);
		System.out.println(y-100);
		
		//4. 
		String ch = obj.getInfo();
		System.out.println(ch);
		
		//5. return boolean
		boolean c = obj.isAppExist();
		System.out.println(c);
		
		//5b. OR
		if(obj.isAppExist()) {
			System.out.println("False is demanded, but it exists as: " +c);
		}
		
		//myMonthlyBill
		int av = obj.myMonthlyBill(10, 20, 30);
		System.out.println("My Average Monthly Phone Bill is: $" +av);
		
		//Return: String static array - myCarTypes
		String tCars[] = obj.carTypes();
		System.out.println("The Best Cars I Owed are: "+Arrays.toString(tCars));
		System.out.println("I listed "+tCars.length +" Cars");
		
		//Return: ArrayList<String>
		ArrayList<String> myMusic = obj.getPlayList();
		System.out.println(myMusic);
		System.out.println(myMusic.size());
		myMusic.add("Adele"); //Now you can add more on the list with myMusic.add
		System.out.println(myMusic);
		System.out.println(myMusic.size());
		

	}

}
