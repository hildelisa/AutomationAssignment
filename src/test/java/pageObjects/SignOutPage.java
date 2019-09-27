package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.SignOutContent;

public class SignOutPage {
	
	private WebDriver driver;
	public SignOutContent signOutContent;
	
	public SignOutPage(WebDriver webDriver) {
		driver= webDriver;
		signOutContent=PageFactory.initElements(driver, SignOutContent.class);
	}
	
	public Boolean verifyMyAccountPageTitle() {
		String title=signOutContent.welcomePageTitle.getText();
		if(title.equalsIgnoreCase("My account")) {
			return true;
		}
		return false;
	}
	
	public void clickSignOut() {
		signOutContent.singOutBtn.click();
	}

}
