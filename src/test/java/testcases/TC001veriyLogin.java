package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageClass.HomePage;
import pageClass.MyAccountPage;
import pageClass.SignInPage;


public class TC001veriyLogin {
	
	
	WebDriver driver;
	HomePage hp;
	SignInPage sp;
	MyAccountPage ap;


	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "c:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}	
	@Test
	public void verifyLogin() {
	
		hp=PageFactory.initElements(driver, HomePage.class);
		sp=PageFactory.initElements(driver, SignInPage.class);
		ap=PageFactory.initElements(driver, MyAccountPage.class);
		
		//clicking on sign in button on home page
		hp.clickSigninbtn();
		
		/*
		 * //enter username sp.enterEmail();
		 * 
		 * //enter password sp.enterPassword(); //click on submit button
		 * sp.clickSubmitbtn();
		 */
		
		sp.dologin("username@hello.com", "password");
	
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
