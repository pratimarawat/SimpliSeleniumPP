package com.automationpractice.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class HomePage extends TestBase {

	// Page Factory-- OR
	@FindBy(linkText="Sign in")
	WebElement signin;

	@FindBy(xpath = "//a[@title='Contact Us']")
	WebElement contactus;

	@FindBy(xpath = "//a[@title='Women']")
	WebElement women;

	@FindBy(xpath = "//a[@title='Dresses']")
	WebElement dresses;

	@FindBy(xpath = "//a[@title='T-shirts']")
	WebElement tshirts;

	@FindBy(id = "search_query_top")
	WebElement searchfield;

	@FindBy(name = "submit_search")
	WebElement searchbutton;

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	WebElement cart;

	@FindBy(xpath = "//a[text()='Popular']")
	WebElement popular;

	@FindBy(xpath = "//a[text()='Best Sellers']")
	WebElement bestSellers;

	@FindBy(xpath = "//img[contains(@class,'logo img-responsive')]")
	WebElement logo;

	// Initializing the page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public Boolean validateImage() {
		return logo.isDisplayed();
	}

	public LoginPage signInClick() {
		signin.click();
		return new LoginPage();
	}

	
	
}
