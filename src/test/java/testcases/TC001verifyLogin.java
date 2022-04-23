package testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.HomePage;
import pageClass.SignInPage;


public class TC001verifyLogin extends BaseClass {
	

	@Test
	public void verifyLogin() {
		
		app_logs.info("Verify Login test started");
		HomePage hp = new HomePage(driver);
		SignInPage sp = new SignInPage(driver);
		app_logs.info("Clicked Signin button");
		hp.clickSigninbtn();
		app_logs.info("SignIn in progress");
		sp.dologin("username@hello.com", "password");
		String expectedTitle = "My account - My Store";
		String actualTitle=driver.getTitle(); 
		Assert.assertEquals(actualTitle, expectedTitle);
		app_logs.info("Validation in progress");
		app_logs.info("Verify Login test completed");
	
		
	}

}
