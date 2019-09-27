package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOutContent {
	@FindBy(xpath="//a[contains(text(),'Sign out')]")
	public WebElement singOutBtn;
	
	@FindBy(xpath="//h1[contains(text(),'My account')]")
	public WebElement welcomePageTitle;

}
