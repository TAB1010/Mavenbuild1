package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fillipForm1 {
	
	WebDriver driver;
	@FindBy(tagName="title")
    WebElement AutUrl;
	@FindBy(id="email_create")
	WebElement email;
	@FindBy(id="SubmitCreate")
	WebElement submitbtn;
	
	public fillipForm1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String pageTitle() {
		return driver.getTitle();
	}

	public void EnterEmail(String emailadr) {
		email.sendKeys(emailadr);;
	}

	public void ClickSubmit() {
		submitbtn.click();
	}

	public void opensignup(String emailadr) {
		this.pageTitle();
		this.EnterEmail(emailadr);
		this.ClickSubmit();
	}	


}
