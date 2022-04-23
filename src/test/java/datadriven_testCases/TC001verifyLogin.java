package datadriven_testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageClass.HomePage;
import pageClass.SignInPage;


public class TC001verifyLogin extends BaseClass {
	
	

	@Test(dataProviderClass = utilities.Utilities.class, dataProvider = "dp")
	public void verifyLogin(String eaddress, String pword) {
		
		HomePage hp = new HomePage(driver);
		SignInPage sp = new SignInPage(driver);
		hp.clickSigninbtn();
		sp.dologin(eaddress, pword);
		String expectedTitle = "My account - My Store";
		String actualTitle=driver.getTitle(); 
		Assert.assertEquals(actualTitle, expectedTitle);
	
		
	}

}
