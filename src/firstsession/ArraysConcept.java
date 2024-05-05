package firstsession;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {
		// Array: non-primitive data type
		// Can store similar type of data types
		
		//limitations of Array:
		//1. size is fixed - eg, cannot change from size 4 to anything else - if size is 4
		
		//1. using new keyword: 4 values array:
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40; //0,1,2,3 - called INDEX
		
		System.out.println(i.length);//length of array = 4
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		//System.out.println(i[4]); //ArrayIndexOutOfBoundsException - AIOB
		//System.out.println(i[-1]); //ArrayIndexOutOfBoundsException - AIOB
		
		System.out.println(i);//Address of the Array - random string
		
		System.out.println(Arrays.toString(i)); // Correct way to print an array - result = [10, 20, 30, 40]
		
		//Print the values from an Array - using For Look:
		for(int k=0; k<=3; k++) {
			System.out.println(i[k]);
			 if(i[k] == 20) {
				 System.out.println("Hi");
				  break;
			 }
			 System.out.println("Bye"); //will this be printed?
		}
		
		//
		short sh[] = new short[3];//0 to 2
		System.out.println("length = " + sh.length);
		System.out.println("Li = " + 0);
		System.out.println("Hi = " + (sh.length-1));

		System.out.println(Arrays.toString(sh));
		sh[0] = 10;
		System.out.println(Arrays.toString(sh));
		sh[2] = 30;
		System.out.println(Arrays.toString(sh));
		sh[1] = 40;
		System.out.println(Arrays.toString(sh));
		
		for(int p=0; p<sh.length; p++) {
			System.out.println(sh[p]);//10 40 30
		}
		
		
		//char array:
		char ch[] = new char[4];//0-2
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 100;
		
		System.out.println(ch[3]);
		System.out.println(Arrays.toString(ch));
		
		//float array:
		float fh[] = new float[2];
		fh[0] = 12.33f;
		fh[1] = 100;
		System.out.println(Arrays.toString(fh));
		
		//emp data: name(String), age(int), salary(double), gender(char), isPermanent(boolean):
		//Object Array: it can store any kind of data types
		
		Object empData[] = new Object[5];
		empData[0] = "Shilpa";
		empData[1] = 30;
		empData[2] = 25.55;
		empData[3] = 'f';
		empData[4] = true;
		
		System.out.println(Arrays.toString(empData));
		
		System.out.println(empData.length);
		
		
		Object empData1[] = new Object[5];
		empData1[0] = "Ravi";
		empData1[1] = 35;
		empData1[2] = 25.55f;
		empData1[3] = 'm';
		empData1[4] = false;
		System.out.println(Arrays.toString(empData1));

		
		//String array:
		String product[] = new String[3];
		product[0] = "Macbook pro";
		product[1] = "Macbook Air";
		product[2] = "iPad";

		for(int x=0; x<=product.length-1; x++ ) {
			System.out.println(product[x]);
				if(product[x].equals("Macbook Air")) {
					System.out.println("Out of stock");
					break;
				}
		}
		
		//
		for(int y=product.length-1; y>=0; y--) {
			System.out.println(product[y]);
		}
		
		
		//booking uber: 100 cab[100] -->  
		//ecomm -- users reg --> new customers ---> 
		//static array:
		//bookmyshow.com --> Animal -- 200 seats --> 
		//flight booking --> 300 seats -- 
		//month array --> 0 to 11 -- 12
		//emp drop down --> dynamic 
		
		
		String cars[] = new String[3];
		System.out.println(Arrays.toString(cars));

		for(int z=0; z<=cars.length-1; z++) {
			cars[z] = "Naveen";
		}
		System.out.println(Arrays.toString(cars));
		
		//My Practice
//		int p[] = new int[5];
//		
//		p[0] = 0;
//		p[1] = 1;
//		p[2] = 2;
//		p[3] = 3;
//		p[4] = 4;
//		
//		System.out.println(Arrays.toString(p));
//		System.out.println("Length = " + p.length);
//		
//	    //Printing the values from For loop array
//		for (int t=4; t>=0; t--) {
//			System.out.println(p[t]);
//		}
		
		
	}

}
		

