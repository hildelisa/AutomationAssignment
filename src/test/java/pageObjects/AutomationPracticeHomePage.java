package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageLocators.AutomationPracticeHomeContent;

public class AutomationPracticeHomePage {
	
	private WebDriver driver;
	public AutomationPracticeHomeContent automationPracticeHomeContent;
	
	public AutomationPracticeHomePage(WebDriver webDriver) {
		driver = webDriver;
		automationPracticeHomeContent=PageFactory.initElements(driver, AutomationPracticeHomeContent.class);
	}
	

	public void clickWomenLink() {
		automationPracticeHomeContent.womenLink.click();
	}
}
