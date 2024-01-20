package tests;

 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pagess.TestBase;
import pagess.ViewSavingsPF;

public class ViewSavingsTest extends TestBase {

	
	
	
	
	

 
	ViewSavingsPF Bankcomponent;
	 

	
	
	
 
 

@Test(priority =1)
 
public void clicksigin() throws Throwable{

	driver =new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://dbankdemo.com/bank/login");

	Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);

	Bankcomponent.enterLoginDetails("oolhelll7@gmail.com","Qwerty123_");
 
	String actualtitle= driver.getTitle();
	String expectedTitle = "Digital Bank";
    Assert.assertEquals(actualtitle, expectedTitle);
}
@Test (priority =2)
public void clcikingMenuIcon() throws Throwable{
	
	Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);
Bankcomponent.clickthemenu();
//Assert.assertFalse(Bankcomponent.validate_menu(),"Validated menu icon");


}

 @Test (priority =3)
public void  clickingsavings() throws Throwable {
 Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);
Bankcomponent.clickTheSavings();
//Assert.assertFalse(Bankcomponent.validate_savings(),"validated  savings");



}
 @Test  (priority =4)
public void navigationofsavings() throws Throwable {
	 Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);
Bankcomponent.clickTheViewSavings();
// Assert.assertEquals(Bankcomponent.MethodforTestViewSavings(),"View Savings Accounts" );

//Assert.assertFalse(Bankcomponent.Validate_ViewSavings(),"validated  view  savings test passed succesfully");
 
 }

 @Test(priority =5)
public void serachtranscations() throws Throwable{
	 Bankcomponent = PageFactory.initElements(driver,ViewSavingsPF.class);
	 Bankcomponent.searchTransactionDetails("11111.12");
//Assert.assertFalse(Bankcomponent.validate_serachtransaction(),"Assert success");
 
 }
 	
}
