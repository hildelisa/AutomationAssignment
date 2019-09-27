package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import config.Setup;
import pageObjects.AutomationPracticeHomePage;
import pageObjects.CreateAccountPage;
import pageObjects.SignInPage;
import pageObjects.SignOutPage;
import pageObjects.WomanPage;

public class AutomationPracticeHomeAction extends Setup {
	
	@BeforeMethod
	public void clickCreateAccount() {
		SignInPage signIn=new SignInPage(driver);
		signIn.clickSignIn();
		Assert.assertTrue(signIn.verifyCreateAccountTitle(), "something went wrong");
		signIn.enterEmail("hcantu1@mail.com");
		signIn.clickCreateAccountBtn();
	}
	
	@AfterMethod
	public void signOut() {
		SignOutPage signout=new SignOutPage(driver);
		Assert.assertTrue(signout.verifyMyAccountPageTitle(),"My account");
		signout.clickSignOut();
	}

	@Test
	//@Parameters("email")
	public void testCase()  throws InterruptedException{
		AutomationPracticeHomePage automationPracticeHomePage= new AutomationPracticeHomePage(driver);
		automationPracticeHomePage.clickWomenLink();
		
		WomanPage wp=new WomanPage(driver);
		Assert.assertEquals(wp.getSceneTextP1(), "You will find here all woman fashion collections.");
		Assert.assertEquals(wp.getSceneTextP2(), "This category includes all the basics of your wardrobe and much more:");
		Assert.assertEquals(wp.getSceneTextP3(), "shoes, accessories, printed t-shirts, feminine dresses, women's jeans!");
		
		wp.clickAnyLink("Sign in");
		
		
		SignInPage signIn=new SignInPage(driver);
		signIn.clickSignIn();
		Assert.assertTrue(signIn.verifyCreateAccountTitle(), "something went wrong");
		signIn.enterEmail("hcantu@mail.com");
		signIn.clickCreateAccountBtn();
		
		
		/*CreateAccountPage createNewAccount=new CreateAccountPage(driver);
		Assert.assertTrue(createNewAccount.verifyPageTitle(), "Page create an account its not found");
		
		createNewAccount.enterFirstName("jose");
		createNewAccount.enterLastName("test lastname");
		//createNewAccount.enterEmail(email);
		createNewAccount.enterPassword("12345678");
		//createNewAccount.enterFirstName2("test1");
		//createNewAccount.enterLastName2("test lastname");
		createNewAccount.enterAddress("direccion de prueba 123");
		createNewAccount.enterCity("ensenada");
		createNewAccount.selectState("1");
		createNewAccount.enterPostalcode("91911");
		createNewAccount.enterCountry("21");
		createNewAccount.enterPhone("6461234777");
		createNewAccount.enterAlias("TEST1");
		createNewAccount.clickCreateNewAccountBtn();
		*/
		
		/*SignOutPage signout=new SignOutPage(driver);
		Assert.assertTrue(signout.verifyMyAccountPageTitle(),"My account");
		signout.clickSignOut();
		*/
		
		
		Thread.sleep(2000);
		
	}	
	

}
