package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountContent {
	
	@FindBy(xpath="//*[contains(text(),'Create an account')]")
	public WebElement createAccountPageTitle;
	
	@FindBy(id="customer_firstname")
	public WebElement firstName;
	
	@FindBy(id="customer_lastname")
	public WebElement lastName;

	@FindBy(id="email")
	public WebElement email;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	@FindBy(id="firstname")
	public WebElement firstName2;
	
	@FindBy(id="lastname")
	public WebElement lastName2;
	
	@FindBy(id="address1")
	public WebElement address1;
	
	@FindBy(id="city")
	public WebElement city;
	
	@FindBy(id="id_state")
	public WebElement slctState;
	
	@FindBy(id="postcode")
	public WebElement postalCode;
	
	@FindBy(id="id_country")
	public WebElement slctCountry;
	
	@FindBy(id="phone_mobile")
	public WebElement phoneMobile;
	
	@FindBy(id="alias")
	public WebElement alias;
	
	@FindBy(id="submitAccount")
	public WebElement submitAccount;
}
