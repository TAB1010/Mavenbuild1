package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class fillupForm {
	
	WebDriver driver;
	By title= By.tagName("title");
	By gender1= By.id("id_gender1");
	By gender2= By.id("id_gender2");
	By firstname= By.id("customer_firstname");
	By lastname= By.id("customer_lastname");
	By password= By.id("passwd");
	By dob1= By.id("days");
	By dob2= By.id("months");
	By dob3= By.id("years");
	By newsletter= By.id("newsletter");
	By address= By.id("address1");
	By city= By.id("city");
	By state= By.id("id_state");
	By postcode= By.id("postcode");
	By country= By.id("id_country");
	By mobileph= By.id("phone_mobile");
	By alias= By.id("alias");
	
	public fillupForm(WebDriver driver) {
		this.driver=driver;
		
		/*parameterized constructor  has parameter
		this.driver = driver;
		This is a keyword. It refers one thing to another thing. This is a reference variable
		This ()method can be used to call the class constructor. fillupForm(WebDriver driver). Line 30 is referring to the code on line 11*/

		
		
		
	}
	public String getPageTitle() {
		return driver.getTitle();
	}
	public void clickGender1() {
		driver.findElement(gender1).click();	
	}
	public void clickGender2() {
		driver.findElement(gender2).click();
	}
	public void enterCustFirstName(String Robin) {
		driver.findElement(firstname).sendKeys(Robin);
	}
	public void enterCustLastName(String Hood) {
		driver.findElement(lastname).sendKeys(Hood);
	}
	public void enterPassword(String abcdef) {
		driver.findElement(password).sendKeys(abcdef);
	}
	public void enterdob1(String ten) {
		WebElement dob1selection=driver.findElement(dob1);
		Select elevator= new Select(dob1selection);
		elevator.selectByValue(ten);
	}
	public void enterdob2(String eleven) {
		WebElement dob2selection=driver.findElement(dob2);
		Select elevator1=new Select(dob2selection);
		elevator1.selectByValue(eleven);
	}
	public void enterdob3(String twok) {
		WebElement dob3selection= driver.findElement(dob3);
		Select elevator2= new Select(dob3selection);
		elevator2.selectByVisibleText(twok);
	}
	public void selectNewsletter() {
		driver.findElement(newsletter).click();
	}

	public void enterAddress(String WashingtonSt) {
		driver.findElement(address).sendKeys(WashingtonSt);
	}
	public void enterCity(String DC) {
		driver.findElement(city).sendKeys(DC);
	}
	public void selectState(int twentyone) {
		WebElement stateselection=driver.findElement(state);
		Select elevator3= new Select(stateselection);
		elevator3.selectByIndex(twentyone);
	}//selectByIndex value of 21
	public void enterZipCode(String zip) {
		driver.findElement(postcode).sendKeys(zip);
	}
	public void selectCountry(String UnitedStates) {
		WebElement countryselection= driver.findElement(country);
		Select elevator4=new Select(countryselection);
		elevator4.selectByVisibleText(UnitedStates);
	}
	public void enterMobileph(String mobilephn) {
		driver.findElement(mobileph).sendKeys(mobilephn);
	}
	public void enterAliasAddress(String GeorgetownCondo) {
		driver.findElement(alias).sendKeys(GeorgetownCondo);
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
	
	


