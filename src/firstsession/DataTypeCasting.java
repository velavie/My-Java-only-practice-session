package firstsession;

public class DataTypeCasting {

	public static void main(String[] args) {
		//Casting is to convert from a data type to another
		//Widening - Converting a lower data type to a higher one: 
		       //Byte short char int long float double
		
		//Widening Example - from Byte to int
		byte t = 10;
		int k = t;
		 System.out.println(k);
		 
		//Narrowing example - not a good thing
		int s = 220;
		byte q = (byte)s;
		  System.out.println(q); //220 is too large for byte and result is bad
		
		//correcting by widening
		long y = s;
		  System.out.println(y); // compare with line 18
		  
		  long l1 = 1000;
			float f1 = l1;
			System.out.println(f1);
			
			float f2 = 12.85f;
			long l2 = (long) f2;
			System.out.println(l2);
			
			int i1 = (int)f2;
			System.out.println(i1);
			
			//-128 to 127
			float f3 = 800.85f;
			byte b3 = (byte)f3;//200
			System.out.println(b3);
			
			int ch = 'a';
			byte bh = (byte)ch;
			 System.out.println(bh);
			
			char c1 = 'b';
			int f11 = c1;//b->98
			System.out.println(f11);
			
			int v = 97;
			char v1 = (char)v;//97--a
			System.out.println(v1);//a

	}

}
