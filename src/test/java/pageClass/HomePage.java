package pageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}



	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement signInbtn;
	
	
	
	public void clickSigninbtn() {
		signInbtn.click();
	}
	
	
	
	

}
