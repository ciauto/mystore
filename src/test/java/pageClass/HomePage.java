package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement signInbtn;
	
	
	
	public void clickSigninbtn() {
		signInbtn.click();
	}
	
	
	
	

}
