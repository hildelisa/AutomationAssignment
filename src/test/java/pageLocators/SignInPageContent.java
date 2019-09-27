package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageContent {
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	public WebElement singInBtn;
	
	@FindBy(xpath="//*[@id='create-account_form']/child::h3")
	public WebElement createAccountTitle;
	
	@FindBy(id="email_create")
	public WebElement emailField;
	
	@FindBy(id="SubmitCreate")
	public WebElement submitBtn;

}
