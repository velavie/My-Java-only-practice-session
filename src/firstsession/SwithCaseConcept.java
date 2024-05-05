package firstsession;

public class SwithCaseConcept {

	public static void main(String[] args) {
		
		
		String browser = "windows";
		String version = "112.90.11";
		
		switch(browser.toLowerCase().trim()) {
		
		case "chrome":
			System.out.println("launch chrome browser");
			break;
			
		case "firefox":
			System.out.println("launch firefox browser");
			break;
			
		case "edge":
			System.out.println("launch edge browser");
			break;
			
		case "safari":
			System.out.println("launch safari browser");
			break;
			
		case "ie":
			System.out.println("launch IE browser");
			break;
			
		default:
			System.out.println("Please, pass the right browser");
			break;
			
		}
		
		//
		int marks = 100;
		switch (marks + 10) {

		case (1):
			System.out.println("A++");
			break;
		case 2:
			System.out.println("A++");
			break;
		case 3:
			System.out.println("A++");
			break;
		case 110:
			System.out.println("A++");
			break;
		case 5:
			System.out.println("A++");
			break;

		default:
			System.out.println("A++ does not fit anywhere");
			break;
		}

		//
//		double d = 12.33;
//		switch (d) {
//		case 12.33:
//			
//			break;
//
//		default:
//			break;
//		}

//		boolean flag = true;
//		switch (flag) {
//		case true: {
//			
//		}
//		default:
//		}

//		long num = 12222;
//		switch (num) {
//		case 100:
//			
//			break;
//
//		default:
//			break;
//		}

		char c = 'A';
		int d = c;
		switch (d) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;

		default:
			System.out.println(d + "  is NOT a consonant");
			break;
		}

		// use cases:
		// cross browser testing
		// multi env setup: dev, qa, stage, prod
		// RBAC: user roles: admin, customer, partner, manager, vendor
		// Element Locator: id, name, xpath, css, linktext
		// OS: windows, Mac, Linux


	}

}
