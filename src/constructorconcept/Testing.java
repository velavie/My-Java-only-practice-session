package constructorconcept;

public class Testing {
	
	int age;
	int salary;
	int amount;
	
	public Testing(int age, int salary, int amount) {
		this.age = age;
		this.salary = salary;
		this.amount = amount;
		
	}
	
	

	public static void main(String[] args) {
		
		Testing t1 = new Testing(25, 1000, 1200);	 
			System.out.println("The value of " +t1);
	}

}
