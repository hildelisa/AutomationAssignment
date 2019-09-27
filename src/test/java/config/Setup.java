package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//import utils.ExcelUtils;

public class Setup {
	public static WebDriver driver;
	static String chromePath = System.getProperty("user.dir")+"/drivers/chromedriver.exe";
	public static String testCaseWorkBook = System.getProperty("user.dir") + "/resources/FlightRegisterData.xlsx";
	
	@BeforeSuite
	public static void setBrowser() {
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		
	}
	

	
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}

}
