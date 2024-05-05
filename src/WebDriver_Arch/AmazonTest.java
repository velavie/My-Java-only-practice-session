package WebDriver_Arch;

public class AmazonTest {
	
	//static WebDriver driver; //initializing - GLOBAL level. OR USE Local level below

	public static void main(String[] args) {
		
		//Need to create the object of ChromDriver
		
		//ChromeDriver driver = new ChromeDriver(); //launches/calls the ChromeDriver interface
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
		
		String browser = "chrome";
		
		//cross browser logic -- with top casting -- switch case/if else
		//initialize the driver only once
		//parallel run
		WebDriver driver = null;//'driver' initialize - LOCAL Level OR Use Global level
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();//top casting - Can execute TCs in Parallel mode
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("plz pass the right browser....");
			break;
		}
		
		
		driver.get("http://www.amazon.com"); //1st method in ChromeDriver method
		
		driver.getTitle();
		String title = driver.getTitle();
		System.out.println("Title is :" + title);
		
		if(title.equals("amazon")) {
			System.out.println("Title PASSED");
		}
		else {
			System.out.println("title FAILED");
		}
		
		driver.getURL();
		String url = driver.getURL();
		System.out.println("URL is : " + url);
		
		driver.findElement("logo");
		
		driver.sendKeys("usename", "victor@gmail.com"); //creating username method
		driver.sendKeys("password", "victor012");//creating password method
		
		driver.click("loginButton");
		
		driver.close();
		
		

	}

}
