package ExceptionHandling;


public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		
		System.out.println("Yay!");
		System.out.println("Cee-Cee");
		
		//Best Practice - In multiple exception: Find Specific Exception name by 1st running the code, then use in try/catch block
		     //One 1 try block is allowed - with multiple codes that can generate Exceptions
			 //Multiple Catch blocks can be use to catch each exception in the try block
		//use Grandparent class name 'Throwable' OR child class name 'Exception' if name is unknown
		//One catch block can only handle one Exception: Use Double/multiple catch blocks to handle multiple exceptions
		//try block can only handle the 1st exception and stops: there should be a separate Catch block for each exception
		
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			FileInputStream file = new FileInputStream("/user.test.docx");
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		}
		
		
		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name = "Victor";
			
			int e = 22/0; //AE
			System.out.println("hi");
			System.out.println("hi1");
			System.out.println("hi2");
			
		} catch(ArithmeticException x){ //'Throwable' OR 'Exception' or 'Error' class name
			System.out.println("AE Excetions will happen here");
			x.printStackTrace();
		} catch(NullPointerException x){ //'Throwable' OR 'Exception' or 'Error' class name
			System.out.println("NPE Exception will happen here");
			x.printStackTrace();
		}
		
//		  catch (Exception e) {
//			System.out.println("exception is coming....");
//			e.printStackTrace();
//		}
		
		System.out.println("Enough");

	}

}
