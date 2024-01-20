package listeners;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Signin implements IRetryAnalyzer {

	
	
	
	@Test()
	void loginbyemail() {
		
		
		
		System.out.println("Login by email");
	     Assert.assertEquals("pavan","pavan");
	     
	
	
	}
	
	
	
	
	@Test()
	void loginbypassword() {
		
		
		
		
		System.out.println("login by password");
		Assert.assertEquals("pavan", "pavann");
		
		
	}




	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
}
