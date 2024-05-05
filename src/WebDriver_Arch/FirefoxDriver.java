package WebDriver_Arch;

public class FirefoxDriver implements WebDriver{
	
	//FirefoxDriver Constructor
	public FirefoxDriver() {
		System.out.println("firefox is launched");
	}
	
	@Override
	public void get(String url) {
		System.out.println("launch url" + url);	
	}

	@Override
	public String getTitle() {
		return "amazon";
	}

	@Override
	public String getURL() {
		return "http://www.amazon.com";
	}

	@Override
	public void click(String eleName) {
		System.out.println("click on element:" + eleName);	
	}

	@Override
	public void sendKeys(String eleName, String value) {
		System.out.println("entering values in :" +eleName + "value : " + value);
	}

	@Override
	public void close() {
		System.out.println("browser is closed");	
	}

	@Override
	public void findElement(String eleName) {
		System.out.println("find elemenet: " + eleName);
	}

	@Override
	public void findElements() {
		System.out.println("find elements on page");
	}

}
