package firstsession;

public class User {
	
	//category - blueprint - class -- prototype, template
		//instance -- object
		//Human -- class --properties: name, eyes, address, nose, height
		//Laptop -- class: name, size, color, price
		
		//class variables : data member or properties
		String name;
		int age;
		String city;
		String telephone;
		double salary;
		boolean isActive;

	public static void main(String[] args) {
		
		//create the object of the class: using new keyword
		User u1 = new User(); //u1 = object reference, new User () = object, class type = User
		
		//User: class
		//u1 --> object reference name
		//new User(); --> Object
		
		u1.name = "Gunel";
		u1.age = 30;
		u1.city = "Bangalore";
		u1.telephone = "9876543212";
		u1.salary = 12.33;
		u1.isActive = true;
		
		System.out.println(u1.name);
		System.out.println(u1.isActive);
		
		
		User u2 = new User();
		System.out.println(u2.name);
		System.out.println(u2.age);
		System.out.println(u2.city);
		System.out.println(u2.salary);
		System.out.println(u2.isActive);
		
		User u3 = new User();
		u3.name = "Devika";
		u3.salary = 64.55;
		u3.isActive = true;
		
		System.out.println(u3.name);
		System.out.println(u3.age);
		System.out.println(u3.city);
		System.out.println(u3.salary);
		System.out.println(u3.isActive);
		System.out.println(u3.telephone);
		
		
		System.out.println(u3);
		
		//no reference object
		new User().name = "Tom";
		new User().age = 40;
		
		
//		If we have 2 array list X and Y  and in X  we have 3 items and Y has 2 items 
//		we add both x and y..and from y we just want to remove only one 
//		..is there any way after adding we can do that
//		
//		l1 = ch ff ie
//		l2 = mac linux
//		l1.addAll(l2);
//		l1 = ch ff ie mac linux
//		l1.remove(mac);
//		l1 = ch ff ie linux
		

	}

}
