package listeners;
 

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
 
import io.cucumber.java.Scenario;
public class SharedSteps {

	WebDriver driver ;
	@Before()
	public void setUp() {
		
		
//		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriverwin64\\chromedriver.exe");
//		driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("");
	}
	
	
public WebDriver getDriver() {
		
		
		return driver;
		
		
		
	}

	
	
	
	
	@After
	
	public void teardown(Scenario scenario) {
	    
	  

		
	   if(scenario.isFailed()) 
		   
		   {
		   
		   
		   TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		   byte [] scrennshot = takescreenshot.getScreenshotAs(OutputType.BYTES);
		   
		   scenario.attach (scrennshot,"image/png","Failed Taking Screenshot");
		   }
		driver.quit();
	
	
	
	}
	
	
	
	
	
	
}
