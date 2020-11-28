package pageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
	
	@FindBy(id="email")
	public WebElement emailTxtbox;
	
	public void enterEmail() {
		emailTxtbox.sendKeys("username@hello.com");
	}
	
	@FindBy(id="passwd")
	public WebElement passwordTxtbox;
	
	public void enterPassword() {
		passwordTxtbox.sendKeys("password");
	}

	
	@FindBy(name="SubmitLogin")
	public WebElement submitbtn;
	
	public void clickSubmitbtn() {
		submitbtn.click();
	}
	
	public void dologin(String email, String password) {
		emailTxtbox.sendKeys(email);
		passwordTxtbox.sendKeys(password);
		submitbtn.click();
	}
	
}
