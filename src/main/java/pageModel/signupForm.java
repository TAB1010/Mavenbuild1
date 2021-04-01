package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signupForm {
	
	WebDriver driver;
	By title= By.tagName("title");
	By email= By.id("email_create");
	By button= By.id("SubmitCreate");

	public signupForm(WebDriver driver) {
		this.driver=driver;
	}

	public String pageTitle() {
		return driver.getTitle();
	}

	public void EnterEmail(String emailadr) {
		driver.findElement(email).sendKeys(emailadr);
	}

	public void ClickSubmit() {
		driver.findElement(button).click();
	}

	public void openSignup(String emailadr) {
		this.pageTitle();
		this.EnterEmail(emailadr);
		this.ClickSubmit();
	}
	

}
