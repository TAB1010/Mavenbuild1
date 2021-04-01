package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class signUpForm {
 
	WebDriver driver;
	@FindBy(tagName="title")
	WebElement Automationtitle;
	@FindBy(id="id_gender1")
	WebElement gender1;
	@FindBy(id="id_gender2")
	WebElement gender2;
	@FindBy(id="customer_firstname")
	WebElement fname;
	@FindBy(id="customer_lastname")
	WebElement lname;
	@FindBy(id="passwd")
	WebElement password;
	@FindBy(id="days")
	WebElement dob1;
	@FindBy(id="months")
	WebElement dob2;
	@FindBy(id="years")
	WebElement dob3;
	@FindBy(id="newsletter")
	WebElement newsletter;
	@FindBy(id="address1")
	WebElement address;
	@FindBy(id="city")
	WebElement city;
	@FindBy(id="id_state")
	WebElement state;
	@FindBy(id="postcode")
	WebElement zipcode;
	@FindBy(id="id_country")
	WebElement country;
	@FindBy(id="phone_mobile")
	WebElement mobileph;
	@FindBy(id="alias")
	WebElement aliasadr;

	public signUpForm(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickGender1() {
		gender1.click();	
	}
	public void clickGender2() {
		gender2.click();
	}
	public void enterCustFirstName(String Robin) {
		fname.sendKeys(Robin);
	}
	public void enterCustLastName(String Hood) {
		lname.sendKeys(Hood);
	}
	public void enterPassword(String abcdef) {
		password.sendKeys(abcdef);
	}
	public void enterdob1(String ten) {
		Select elevator= new Select(dob1);
		elevator.selectByValue(ten);
	}
	public void enterdob2(String eleven) {
		Select elevator1=new Select(dob2);
		elevator1.selectByValue(eleven);
	}
	public void enterdob3(String twok) {
		Select elevator2= new Select(dob3);
		elevator2.selectByVisibleText(twok);
	}
	public void selectNewsletter() {
		newsletter.click();
	}

	public void enterAddress(String WashingtonSt) {
		address.sendKeys(WashingtonSt);
	}
	public void enterCity(String DC) {
		city.sendKeys(DC);
	}
	public void selectState(int twentyone) {
		Select elevator3= new Select(state);
		elevator3.selectByIndex(twentyone);
	}//selectByIndex value of 21
	public void enterZipCode(String zip) {
		zipcode.sendKeys(zip);
	}
	public void selectCountry(String UnitedStates) {
		Select elevator4=new Select(country);
		elevator4.selectByVisibleText(UnitedStates);
	}
	public void enterMobileph(String mobilephn) {
		mobileph.sendKeys(mobilephn);
	}
	public void enterAliasAddress(String GeorgetownCondo) {
		aliasadr.sendKeys(GeorgetownCondo);
	}

	public void fillSignupForm(String Robin, String Hood, String abcdef, String ten, String eleven, String twok, String WashingtonSt, String DC, int twentyone, String zip, String UnitedStates, String mobilephn, String GeorgetownCondo) {
		this.getPageTitle();
		this.clickGender1();
		this.clickGender2();
		this.enterCustFirstName(Robin);
		this.enterCustLastName(Hood);
		this.enterPassword(abcdef);
		this.enterdob1(ten);
		this.enterdob2(eleven);
		this.enterdob3(twok);
		this.selectNewsletter();
		this.enterAddress(WashingtonSt);
		this.enterCity(DC);
		this.selectState(twentyone);
		this.enterZipCode(zip);
		this.selectCountry(UnitedStates);
		this.enterMobileph(mobilephn);
		this.enterAliasAddress(GeorgetownCondo);
		
	}

}
