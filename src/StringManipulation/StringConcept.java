package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		String str = "hello This is my java code and i am so happy i am expert i am also sad";
		
		System.out.println(str.length());
		//li =0
		//hi = 37
		//len = hi+1
		//hi=len-1
		
		System.out.println(str.charAt(0));//'T'+"" --> "T".toUpperCase()
		System.out.println(str.charAt(37));
		//System.out.println(str.charAt(38));//StringIndexOutOfBoundsException - SIOB
		//System.out.println(str.charAt(-1));//SIOB
		
		System.out.println(str.indexOf("T"));
		System.out.println(str.indexOf("i"));//1st occurrence of i -- 8
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));//2nd occurrence of i -- 11

		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));
		
		
		String mesg = "this is my java code";
		
		System.out.println(mesg.indexOf("java"));//1
		System.out.println(mesg.indexOf("python"));//-1
		System.out.println(mesg.indexOf("Java"));//-1

		
		String m = "Welcome null";
		if(m.indexOf("admin") == 8) {
			System.out.println("correct mesg");
		}
		else {
			System.out.println("incorrect mesg");
		}

		if(m.indexOf("admin") == -1) {
			System.out.println("incorrect mesg - FAIL");
		}
		
		
		//
		String test = "    hello    world   ";
		System.out.println(test.trim());
		
		//
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		String top = "    hello    world   ";//helloworld
		//System.out.println(top.replace(" ", ""));//helloworld
		System.out.println(top.replaceAll(" ", ""));//helloworld

		
		String mg = "Java Python Ruby";
		//System.out.println(mg.replace(" ", "||"));
		
		System.out.println(mg.replace("Java", "JS"));
		
		//split:
		String pop = "javascript;java;python;ruby";
		String p[] = pop.split(";");
		System.out.println(p[3]);
		System.out.println(p.length);
		
		
		String rest = "xXHelloSeleniumxxXPythonXxXAutomationXxXLabs";		
		String rs[] = rest.split("xX");
		System.out.println(rs[0].length());
		System.out.println(rs[1]);
		
		
		//String empData = "pallavi||sharma||30||pune||India||989898989";
		
		String empData = "pallavi;sharma;30;pune;India;908767687587";
		String empData1 = empData.replace(";", ".");
		System.out.println(empData1);//pallavi||sharma||30||pune||India||908767687587
		String[] ed = empData1.split("\\.");
		System.out.println(ed[0]);


	}

}
