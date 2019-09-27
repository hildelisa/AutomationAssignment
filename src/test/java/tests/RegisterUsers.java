package tests;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.Setup;
import pageObjects.CreateAccountPage;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;
import utils.ExcelUtils;
import java.util.Date;


public class RegisterUsers extends Setup{
	//public WebDriver driver;
	Object[][] testObjArray;
	
	@DataProvider(name="UserRegistration")
	public Object[][] userRegister() throws Exception{
		testObjArray= ExcelUtils.getTableArray(testCaseWorkBook, "RegisterUser");
		return(testObjArray);
	}

	/*@BeforeMethod
	public void clickCreateAccount() {
		SignInPage signIn=new SignInPage(driver);
		signIn.clickSignIn();
		Assert.assertTrue(signIn.verifyCreateAccountTitle(), "something went wrong");
		signIn.enterEmail("hcantu2@mail.com");
		signIn.clickCreateAccountBtn();
	}*/
	
	@AfterMethod
	public void signOut() {
		SignOutPage signout=new SignOutPage(driver);
		Assert.assertTrue(signout.verifyMyAccountPageTitle(),"My account");
		signout.clickSignOut();
	}
	
	@Test(dataProvider = "UserRegistration", description="Test Case for Register an user")
	public void registerUserInformation(String ... registerInfo) throws InterruptedException{
//	public void registerUserInformation(String firstName, String lastName, String phone, String email, String address, String city,
//			String state, String postalCode, String country, String userName, String password){
		
		//Go to Sign in page after create an user
		SignInPage signIn=new SignInPage(driver);
		signIn.clickSignIn();
		Assert.assertTrue(signIn.verifyCreateAccountTitle(), "something went wrong");
		String [] emailuser=registerInfo[3].split("@", 2);

		Date date= new Date();
		long time = date.getTime();
		String randomUserEmail=emailuser[0]+ time+"@"+emailuser[1];
		
		signIn.enterEmail(randomUserEmail);
		signIn.clickCreateAccountBtn();
		
		//go to create an account page
		CreateAccountPage createNewAccount=new CreateAccountPage(driver);
		Assert.assertTrue(createNewAccount.verifyPageTitle(), "Page create an account its not found");
		
		//Adding Contact Information
		createNewAccount.enterFirstName(registerInfo[0]);
		createNewAccount.enterLastName(registerInfo[1]);
		//createNewAccount.enterEmail(email);
		createNewAccount.enterPassword(registerInfo[10]);
		//createNewAccount.enterFirstName2("test1");
		//createNewAccount.enterLastName2("test lastname");
		createNewAccount.enterAddress(registerInfo[4]);
		createNewAccount.enterCity(registerInfo[5]);
		createNewAccount.selectState(registerInfo[6]);
		createNewAccount.enterPostalcode(registerInfo[7]);
		createNewAccount.enterCountry(registerInfo[8]);
		createNewAccount.enterPhone(registerInfo[2]);
		createNewAccount.enterAlias(registerInfo[9]);
		createNewAccount.clickCreateNewAccountBtn();
		
	}
	
}
