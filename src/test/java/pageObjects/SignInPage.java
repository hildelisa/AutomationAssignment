package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.SignInPageContent;

public class SignInPage {
	private WebDriver driver;
	public SignInPageContent signInPageContent;
	
	public SignInPage(WebDriver webDriver) {
		driver=webDriver;
		signInPageContent=PageFactory.initElements(driver, SignInPageContent.class);
		
	}
	
	public Boolean verifyCreateAccountTitle() {
		String title=signInPageContent.createAccountTitle.getText();
		if(title.equalsIgnoreCase("Create an account"))
		{
			return true;
		}
		return false;
	}
	
	public void clickSignIn() {
		signInPageContent.singInBtn.click();
	}
	
	public void enterEmail(String email) {
		signInPageContent.emailField.sendKeys(email);
	}
	
	public void clickCreateAccountBtn() {
		signInPageContent.submitBtn.click();
	}

}
