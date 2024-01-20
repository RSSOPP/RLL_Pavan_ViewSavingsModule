package pagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewSavingsPF {

	
 WebDriver driver;
	
	@FindBy(id="username")
    static WebElement TxtBox_UserName;
	
	

	@FindBy(id="password")
    static WebElement TxtBox_Password;
    
    
    
    @FindBy(xpath="//*[@id=\"page-title\"]")
    static WebElement TestViewSavings;
 
    

	@FindBy(id="submit")
    static WebElement Btn_Login;
	
	
	 @FindBy(xpath = "//input[@class='form-control form-control-sm']")
	 static WebElement Form_fill;


		@FindBy(xpath="//a[@class='nav-link'][normalize-space()='Create Data']")
			    static WebElement createdata;
			@FindBy(xpath ="//img[@alt='User Avatar']")
	 
			static WebElement menu;
			 
			 
			@FindBy(xpath = "//a[@id='savings-menu'][@class='dropdown-toggle'][normalize-space()='Savings']")
		    static WebElement savings;
		
			 
			@FindBy(xpath = "//a[@id='view-savings-menu-item'][normalize-space()='View Savings']")
		    static WebElement savingsView;
			
			@FindBy(xpath = "//input[@class='form-control form-control-sm']")
			static WebElement SearchTransaction;
			
	 
	
	

			public void clickTheCreateData() {
			
			
			createdata.click();
			}

			public void clickthemenu() {
				
				
				menu.click();
			
			
		}

			

			public void clickTheSavings() {
			
			
			savings.click();
			}
			
			
			

			public void clickTheViewSavings() {
			
			
			savingsView.click();
			}
		
			
			public void searchTransactionDetails(String u) {
				
				SearchTransaction.sendKeys(u);
				
			}
			
			
			

 
	
	public void enterUsername(String s)
	{
		
		
		TxtBox_UserName.sendKeys(s);
	}
	public void enterPassword(String P)
	{
		
		
		TxtBox_UserName.sendKeys(P);
	}
	 
	public void enterLoginDetails(String u, String y) {
		
		
		TxtBox_UserName.sendKeys(u);
		TxtBox_Password.sendKeys(y);
		Btn_Login.click();
		
		
		
		
		
		
	}
//	public boolean Validate_ViewSavings() {
//		
////		
////	String actualMessage=	TestViewSavings.getText();
////	return actualMessage; 
//			
//	
//	
//	
//
//	try {
//		
//		
//		
//	    savingsView.click();
//		return savingsView.isEnabled();
//		
//	}finally
//	{
//		
//	}
//	}
//	
//	
//	
//	public static boolean MethodforSearcchTransactions() {
//		
////		boolean actualMessage = Form_fill.equals("11111.12");
////		return ;
//				
//
//		try {
//			
//			
//			
//		    savingsView.click();
//			return savingsView.isEnabled();
//			
//		}finally
//		{
//			
//		}
//		}
//		
//		
//		
//	public boolean  validate_serachtransaction() {
//		
////		
//
//		try {
//			
//			
//			
//		    savingsView.click();
//			return savingsView.isEnabled();
//			
//		}finally
//		{
//			
//		}
//		}
//		
////		return Form_fill.isEnabled();
//	
//
//
//	
//	public boolean validate_username() {
//		
//		try {
//			
//			
//			
//			TxtBox_UserName.click();
//			return Form_fill.isSelected();
//			
//		}finally
//		{
//			
//		}
////		
////		return TxtBox_UserName.getText().isBlank();
//	}
//	
//public boolean validate_menu() {
//		
//		try {
//			
//			
//			
//		    menu.click();
//			return menu.isSelected();
//			
//		}finally
//		{
//			
//		}
// 	}
//
//public boolean validate_savings() {
//	
//	try {
//		
//		
//		
//	    savings.click();
//		return savings.isSelected();
//		
//	}finally
//	{
//		
//	}
//	}


	 
//	public boolean validate_password()
//	{ 
////		return TxtBox_Password.isDisplayed();
//		return TxtBox_Password.getText().isEmpty();
//	}
//	
//	public boolean validate_signin()
//	{
//		return Btn_Login.isSelected();
//	}
	
	public ViewSavingsPF(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	
	}
	 

	
	
	 
	
	
}
