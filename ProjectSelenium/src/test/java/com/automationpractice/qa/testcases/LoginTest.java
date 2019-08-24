package com.automationpractice.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LoginPage;

public class LoginTest extends TestBase {
	
	LoginPage lp;
	HomePage hp;
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		initialization() ;
		lp=new LoginPage();
		hp=new HomePage();

	}

	@Test(priority=1)
	public void signIn()
	{
		hp.signInClick();
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals(driver.getTitle(),"My account-My Store");
	}
	
	@Test(priority=2)
	public void createaccount()
	{
		hp.signInClick();
		lp.createaccount(prop.getProperty("newuser"));
		Assert.assertEquals(driver.getTitle(),"Create an account");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
