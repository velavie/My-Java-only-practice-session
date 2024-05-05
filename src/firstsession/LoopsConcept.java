package firstsession;

public class LoopsConcept {

	public static void main(String[] args) {
		// 
		//1 to 10:
		//1. while LOOP:
		
		//WHERE TO USE: while loop:
		//when number of iterations are not fixed
		//ex:
		//1. wait for the webelement on the page: 5, 10, 15, 3, 30
		//2. wait for page loading: 1, 5, 10, 15, 4 -- 
		//3. drop down: dynamic: 5, 10, 20, 15 ---> 
		//4. webtable pagination: 
		//5. carousel
		//6. calendar handling: 
		//7. page scrolling: Infinite
				
				int i = 1; //start -- initialization
				while(i<=10) {//true - condition
					System.out.println(i);//1234...910
					i++;//11
					//++i;
					//i=i+1;
					
					break;
				}
				
				//
				while(true) {
					System.out.println("welcome to Hotel Taj");
					break;
				}
				
				//
				int p = 1;
				while(p<=100) {
					System.out.println(p);//12345
					
						if(p%5 == 0) {//1%5=1... 5%5 =0
							System.out.println(p + " % 5 == 0");
							p++;
							//break;
						}
						p++;//6
				}
				
				//
				boolean flag = true;
				while(!flag) {//false
					System.out.println("Hello");
				}
				
				int total = 60;
				while(total>=50 && total<=100) {//T && F
					System.out.println("total =  " + total);
					total++;//61 62 63 .......100
				}
				
				System.out.println("--------------");
				
				
				
				//2. FOR LOOP - WHERE TO USE:
				
				//when number of iterations are fixed
				//ex:
				//static drop down: month - 1 to 12
				//Arrays -- fixed size
				//excel sheets: 10 
				//1 to 10:
				
				int k = 1;
				for(; k<=10;  ) {
					System.out.println(k);
					k++;
				}
				
				//
//				for(; ;) {
//					System.out.println("Bye");
//					break;
//				}
				
				//
				for(byte b=10; b<=50; b++) {
					System.out.println(b);
				}
				
				//
				for(float h=1.0f; h<=5.5; ) {
					System.out.println(h);
					h = h+0.1f;
				}
				
				System.out.println("------------------");
				
				//a to z:
				for(char ch='a'; ch<='z'; ch++) {
					System.out.println(ch + " = " + (byte)ch);
				}
			
				System.out.println("------------------");

				for(char cg=97; cg<=122; cg++) {
					System.out.println(cg + " = " + (byte)cg);
				}
				
				//use cases for loop:
				//when number of iterations are fixed
				//ex:
				//static drop down: month - 1 to 12
				//Arrays -- fixed size
				//excel sheets: 10 
				

				for(int p1=0; p1<=10; p1++) {
					System.out.println("Hello World " + p1);
				}
				
				System.out.println("------------------");
				
				//
				//10 to 1:
				for(int as=10; as>=1; as--) {
					System.out.println(as);//10987654321
				}
				
				System.out.println("------------------");

				
				//do-while:
				//1 to 10:
				int d = 1;
				do {
					System.out.println(d);//234567891011
					d++;//11

				}
				while(d<=10);
				
				//use cases:
				//element: is already present on the page -- click on it and break
				
				System.out.println("------------------");
				//1 to 10: 
				for(int num=2; num<=100; num+=2) {
					System.out.println(num);//0246810
					//num = num+2;
				}
				
				//num % 2 == 0
				
				//for each
				//streams
				
				System.out.println("------------------");
				for(byte b=1; b<=10; ++b) {
					System.out.println(b);
					
					
					//if(c1 & c2 & c3)//T & F & T == F
					//if(c1 | c2 | c2) //T | F | T ==> T
					//logging/print
					//if(c1 || c2 || c3) //F T
					
					
					//& AND -- TTTTTT
					//| TFTFTFTF --> T
					
					
			}

	}

}
