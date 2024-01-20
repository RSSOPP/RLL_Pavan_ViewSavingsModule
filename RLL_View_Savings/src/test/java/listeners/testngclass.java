package listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.SkipException;
import org.testng.annotations.Listeners;
//import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.cucumber.java.After;
 
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess.ViewSavingsPF;
import pagess.SavingsHomePage;
import steps.SharedSteps;

@Listeners
public class testngclass extends TestBase {
	 
	 
	 WebDriver driver = new ChromeDriver();

 	
SharedSteps s;
ViewSavingsPF Bankcomponent;
SavingsHomePage Savingscomponent;



public testngclass(SharedSteps s) {
	
	
	
	this.s=s;
 
	
}
@Test

@Given("I open the banking website")
public void i_open_the_banking_website() throws Throwable{
    
	  
	Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);
	Savingscomponent = PageFactory.initElements(driver,SavingsHomePage.class);
}

@When("I enter Username and password")
public void i_enter_username_and_password( ) throws Throwable{
    
     String expectedTitle  ="Digital Bank";
     String actualTitle = driver.getTitle();
	Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_" );
   Assert.assertEquals(actualTitle, expectedTitle,"The title does matches ...");
   


}




@Then("I click on the Sign in buttton")
public void i_click_on_the_sign_in_buttton() throws Throwable{
//	driver.findElement(By.id("submit")).click();
	Savingscomponent.clickthemenu();
	
}

  


 
@Then("I click on the Savings tab")
public void i_click_on_the_savings_tab() throws Throwable {
    Savingscomponent.clickTheSavings();
}

@Then("I click on the 	view savings option")
public void i_click_on_the_view_savings_option() throws Throwable {
    Savingscomponent.clickTheViewSavings();
}

@Then("I should see the Savings account Screen")
public void i_should_see_the_savings_account_screen()  throws Throwable{
    Savingscomponent.searchTransactionDetails();
}

@Then("I should search transcation in the search option")
public void i_should_search_transcation_in_the_search_option()  throws Throwable {
 
}
	@After
	
	public void teardown(Scenario scenario) {
	
	    
		   
		   {
		   
		   
		   TakesScreenshot takescreenshot = (TakesScreenshot) driver;
		   byte [] scrennshot = takescreenshot.getScreenshotAs(OutputType.BYTES);
		   
		   scenario.attach (scrennshot,"image/png","Failed Taking Screenshot");
		   }
		driver.quit();
	
	
	
	}
	
	
//	
//	
//	@Test  //Success Test
//	public void CloseBrowser() {
//		driver.close();
//		Reporter.log("Driver Closed After Testing");
//	}
//	
//	@Test //Failed Test
//	public void OpenBrowser() {
//	        
//
//		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriverwin64\\chromedriver.exe");
//		driver =new  ChromeDriver();
//		driver.get("http://dbankdemo.com/bank");
//	        String expectedTitle = "Digital Bank";
//	        String originalTitle = driver.getTitle();
//	        Assert.assertEquals(originalTitle, expectedTitle, " matched");
//  } 
//	
//	@Test  // Skip Test
//	public void SkipTest() {
//		throw new SkipException("Skipping The Test Method ");
//	}
}