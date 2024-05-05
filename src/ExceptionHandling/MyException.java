package ExceptionHandling;

//This can be used as a custom Exception Template anywhere
public class MyException extends RuntimeException{
	
	public MyException(String mesg) {
		
		//super - used to call the parent class RuntimeException - supply same message - mesg
		super(mesg); 
	}
}


//Throwable
	//Exception
			//RunTimeException
					//AE, NPE, 