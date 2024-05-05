package constructorconcept;

public class Employee {
	
	// class vars
		String name;
		int age;
		double salary;
		boolean isActive;
		char gender;

		//const... name will be same as the class name
		//const.. can not return anything/no void also/no return type
		//const.. can be overloaded
		//const ... will be called when you create the object of the class
		//const.. is used for initializing the class varibales with the const.. local variables using this keyword
		//const... is used to restrict the object creation - depends on the use case
		//const... is used for initialization purpose only not for buss logic
		//but function is used for buss logic, which may or may not return
		//function can be called multiple time but constructor 
		//will be called only once when object created
		

//		public Employee() { // 0 param - default const...
//			System.out.println("emp - default const....");
//		}
	//
//		public Employee(int i) { // 1 param 
//			System.out.println(i);
//		}
	//	
//		public Employee(int i, String s) { // 2 params 
//			System.out.println(i + s);
//		}

		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public Employee(String name, int age, double salary) {
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public Employee(String name, int age, char gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
		}

		public Employee(String name, int age, double salary, boolean isActive, char gender) {
			this.name = name;
			this.age = age;
			this.salary = salary;
			this.isActive = isActive;
			this.gender = gender;
		}
	

	public static void main(String[] args) {
		Employee e1 = new Employee("Tom", 30);
		System.out.println(e1.name);
		System.out.println(e1.age);
		
		Employee e2 = new Employee("preet", 25, 'm');
		System.out.println(e2.name + " " + e2.age + " "+ e2.gender + " " + e2.salary + " " + e2.isActive);
		
		Employee e3 = new Employee("shiv", 30, 12.33, true, 'm');
		System.out.println(e3);
	}

}
