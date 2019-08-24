	package com.automationpractice.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.qa.base.TestBase;
import com.automationpractice.qa.pages.HomePage;
import com.automationpractice.qa.pages.LoginPage;

public class HomePageTest extends TestBase  {
	
	HomePage hp;
	LoginPage lp;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUP()
	{
		initialization();
		
		hp=new HomePage();
		lp=new LoginPage();
		
	}
	
	@Test
	public void pageTitle()
	{
		String title=hp.validateHomePageTitle();
		Assert.assertEquals(title, "My Store");
	}
	
	@Test
	public void logo()
	{
		Boolean img=hp.validateImage();
	    Assert.assertTrue(img);
	}
	
	
	@Test
	public void login()
	{
		lp=hp.signInClick();
		String titleSign=lp.validateLoginPageTitle();
		Assert.assertEquals(titleSign, "Login - My Store");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	 
	

}
