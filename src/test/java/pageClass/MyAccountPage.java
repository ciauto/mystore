package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage {
	
	@FindBy(xpath="//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
	public WebElement signOutbtn;
	
	

}
