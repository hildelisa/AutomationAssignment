package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomanContent {
	
	@FindBy(xpath="//*[@class='rte']/p[1]")
	public WebElement womenContentSceneP1;
	
	@FindBy(xpath="//*[@class='rte']/p[2]")
	public WebElement womenContentSceneP2;
	
	@FindBy(xpath="//*[@class='rte']/p[3]")
	public WebElement womenContentSceneP3;

}
