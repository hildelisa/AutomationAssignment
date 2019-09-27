package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationPracticeHomeContent {
	
	@FindBy(xpath = "//a[contains(text(), 'Women')]")
	public WebElement womenLink;

}
