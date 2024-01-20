package pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {


	
	
	public static WebDriver driver = null;
	
	
	
	public static void getBrowser()
	
	
	
	
	
	{
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriverwin64\\chromedriver.exe");
		driver =new  ChromeDriver();
		driver.get("http://dbankdemo.com/bank/login");
	}
	
	public  WebDriver getdriver() {
		
		return driver;
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
