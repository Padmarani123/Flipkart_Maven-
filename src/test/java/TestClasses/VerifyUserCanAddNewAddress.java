package TestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.BaseClass1;
import PomClasses.HomePage;
import PomClasses.ProfilePage;

public class VerifyUserCanAddNewAddress {
	
	
	static WebDriver driver;
	HomePage hp;
	
	@BeforeClass
	public void beforeClass() throws IOException
	{
		driver = BaseClass1.getDriver("chrome");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		hp = new HomePage(driver);
	}
	
	
	@Test
	public void VerifyUserCanGoToProfilePage()
	{
		hp.moveToProfileName();
		hp.clickOnProfileText();
		
		ProfilePage pp = new ProfilePage(driver);
		
		Assert.assertTrue(pp.getFullProfileName());
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		
	}
	
	
	@AfterClass
	public void afterClass()
	{
		
	}


}
