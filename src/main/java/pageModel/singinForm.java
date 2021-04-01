package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class singinForm {
	
	
		WebDriver driver;
		//We use By method for creating page model
		By url= By.tagName("title");
		By signin= By.className("login");
		
	public singinForm(WebDriver driver)	{
		this.driver=driver;
	}
		
	public String Pagetitle() {
		return driver.getTitle();
		}

	public void clickSignin() {
		driver.findElement(signin).click();
	}
		public void openSignin() {
			this.Pagetitle();
			this.clickSignin();
		}
		
		
		
		
	}


