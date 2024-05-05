package WebDriver_Arch;

public interface WebDriver extends SearchContext{
	
	//TEMPLATE: anyone can call this - create all the methods you want any web browser to call
	public void get(String url);
	
	public String getTitle();
	
	public String getURL();
	
	public void click(String eleName);
	
	public void sendKeys(String eleName, String value);
	
	public void close();
	
	@Override
	public void findElement(String eleName);
	
	@Override
	public void findElements();

}
