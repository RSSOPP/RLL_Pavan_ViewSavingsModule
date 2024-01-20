package steps;

 
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagess.TestBase;
import pagess.ViewSavingsPF;

 
public class SavingsTest  extends TestBase{

	
 
		ViewSavingsPF Bankcomponent;
		 
 
 
		
	@Given("I open the banking website")
			
			
public void i_open_the_banking_website() throws Throwable{
         driver =new  ChromeDriver();
 
		 
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");
		 
		
	}
		 
	@When("I enter Username and password")	
	public void  i_enter_username_and_password() throws Throwable{
		

		Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);
		 

		Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_");
	}
 		
 

 
@Then("I click on the Sign in buttton")
public void i_click_on_the_sign_in_buttton() throws Throwable{
	 
	Bankcomponent.clickthemenu();}
  
@Then("I click on the Savings tab")
public void i_click_on_the_savings_tab() throws Throwable {
    Bankcomponent.clickTheSavings();
}

@Then("I click on the 	view savings option")
public void i_click_on_the_view_savings_option() throws Throwable {
    Bankcomponent.clickTheViewSavings();
}

@Then("I should see the Savings account Screen")
public void i_should_see_the_savings_account_screen()  throws Throwable{
    Bankcomponent.searchTransactionDetails("1111.12");
}

@Then("I should search transcation in the search option")
public void i_should_search_transcation_in_the_search_option()  throws Throwable {
 
 
	
	
}}
