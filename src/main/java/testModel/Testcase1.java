package testModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageModel.fillupForm;
import pageModel.signupForm;
import pageModel.singinForm;

public class Testcase1 {
	
	WebDriver driver;//driver is an object of AutomationPractice class and it is accessible on every method that belongs to the class
	WebDriverWait wait;
	singinForm openurl;
	signupForm opensignUp;
	fillupForm opensignUpForm;
	
	@BeforeTest
	public void Setup()  {
		
		
		//System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 wait= new WebDriverWait(driver,10);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("http://automationpractice.com/index.php");
		 openurl= new singinForm(driver); 
		 opensignUp = new signupForm(driver);
		 opensignUpForm= new fillupForm(driver);
}

	@Test (priority=0)
	public void pageModelTest() {
		
		openurl.openSignin();
		opensignUp.openSignup("mibhassan@yahoo.com");
		opensignUpForm.fillSignupForm("Clark", "Kent", "qwerty", "10","10", "2010  ", "Smallville", "KS", 22, "11372", "United States", "718456787", "CentralCity");
	}

		
}


