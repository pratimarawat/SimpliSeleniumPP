package com.automationpractice.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory

	@FindBy(id = "email")
	WebElement emailID;

	@FindBy(id = "pass")
	WebElement passwd;

	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement signInButton;

	@FindBy(id = "search_query_top")
	WebElement search;

	@FindBy(name = "submit_search")
	WebElement searchclick;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgotpwdLink;

	@FindBy(id = "email_create")
	WebElement createAccount;
	
	@FindBy(id="SubmitCreate")
	WebElement createaccsubmitbtn;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public AccountPage login(String username, String password)

	{
		emailID.sendKeys(username);
		passwd.sendKeys(password);
		signInButton.click();
		return new AccountPage();

	}

	public ForgotPasswordPage forgotpwdclick() {
		forgotpwdLink.click();
		return new ForgotPasswordPage();
	}

	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public CreateAccountPage createaccount(String newusername) {
		createAccount.sendKeys(newusername);
		createaccsubmitbtn.click();
		return new CreateAccountPage();
	}

}
