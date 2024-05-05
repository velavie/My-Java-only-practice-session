package firstsession;

public class FinalKeyword {
	static final int num = 20;//class var | 'static' keyword can still be used here - static final int i = 20
	static final int i = 30; //static class var i
	       final int di = 50; //non-static class var
	static final char ch = 'h';//non-static class var

	public static void main(String[] args) {
		
		final int i = 10;    //local var		
		System.out.println(i); //i=10 : will print local value of i - if i is in class and local/main
		System.out.println(FinalKeyword.i);//i=30: will print class value of i - if i is static in the class
		System.out.println(num);//num=20: with class value static - call class var directly
		
		final char ch = 't';
		System.out.println(ch);//ch in method
		System.out.println(FinalKeyword.ch);//ch in class
		
		FinalKeyword obj = new FinalKeyword();//with class non-static - have to create object and refer it
		System.out.println(obj.di);
		
		//constant variables - examples
		final int DAYS_IN_WEEK = 7;//Naming convention - note: UPPER CASE and underscore
				
		int salary = 100 * DAYS_IN_WEEK;
		System.out.println(salary);
		


	}

}
