package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageLocators.CreateAccountContent;

public class CreateAccountPage {
	
	private WebDriver driver;
	public CreateAccountContent createAccountContent;
	
	public Boolean verifyPageTitle() {
		String title=createAccountContent.createAccountPageTitle.getText();
		if(title.equalsIgnoreCase("Create an account")) {
			return true;
		}
		return false;
	}
	

	public CreateAccountPage(WebDriver webDriver) {
		driver=webDriver;
		createAccountContent=PageFactory.initElements(driver, CreateAccountContent.class);
	}
	
	public void enterFirstName(String firstname) {
		createAccountContent.firstName.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname) {
		createAccountContent.lastName.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		createAccountContent.email.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		createAccountContent.password.sendKeys(password);
	}
	public void enterFirstName2(String firstname) {
		createAccountContent.firstName2.sendKeys(firstname);
	}
	
	public void enterLastName2(String lastname) {
		createAccountContent.lastName2.sendKeys(lastname);
	}
	
	public void enterAddress(String address) {
		createAccountContent.address1.sendKeys(address);
	}
	
	public void enterCity(String city) {
		createAccountContent.city.sendKeys(city);
	}
	
	public void selectState(String state) {
		Select sltState=new Select(createAccountContent.slctState);
		System.out.println(state);
		sltState.selectByVisibleText(state);
	}
	
	public void enterPostalcode(String postcode) {
		createAccountContent.postalCode.sendKeys(postcode);
	}
	
	public void enterCountry(String country) {
		Select sltCountry=new Select(createAccountContent.slctCountry);
		sltCountry.selectByVisibleText(country);
	}
	
	public void enterPhone(String phoneNumber) {
		createAccountContent.phoneMobile.sendKeys(phoneNumber);
	}
	
	public void enterAlias(String alias) {
		createAccountContent.alias.sendKeys(alias);
	}
	public void clickCreateNewAccountBtn() {
		createAccountContent.submitAccount.click();
	}
}
