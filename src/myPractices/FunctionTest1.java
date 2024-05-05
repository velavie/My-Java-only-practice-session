package myPractices;

public class FunctionTest1 {
	
	public int getStudentMarks(String studentName) {
		System.out.println("Getting Student Marks");
		
		//using if else
		int marks = -1; //alternatively - using only one return
		
		if (studentName.trim().equalsIgnoreCase("Victor")) {
			//return 90;
			marks = 90;
		} else if (studentName.trim().equalsIgnoreCase("Momo")) {
			//return 55;
			marks = 55;
		} else if (studentName.trim().equalsIgnoreCase("Jayjay")) {
			//return 5;
			marks = 5;
		//} else if (studentName.trim().equalsIgnoreCase("Titi")) {
			//return 0;
		} else  {
			System.out.println(studentName +": Is not a correct student name");
			//return -1;
		}	
		return marks;
	}
	//using switch case
	public int getMarks (String studentName) {
		System.out.println("Getting Students Marks by Switch Case: " +studentName);
		
		switch (studentName.toLowerCase().trim()) {
		case "victor":
			return 90; //'return' works same way as 'break' here
		
		case "moomo":
			return 60;
		
		case "jayjay":
			return 10;
		
		default :
			System.out.println(studentName +": Is not a correct student name");
			return -1;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		FunctionTest1 snam = new FunctionTest1();
		int v1 = snam.getMarks("Moomo");
		System.out.println("Your mark is: " +v1);
		
//		if (v1==0) {
//			System.out.println(v1 + ":Is same as Fail");
//		} else
		if (v1==-1) {
			System.out.println("DO not print Marhsheet ");
		} else {
			System.out.println("Print Marksheet");
		}

	}

}
