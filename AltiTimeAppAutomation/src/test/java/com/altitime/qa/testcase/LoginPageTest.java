package com.altitime.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.altitime.qa.testbase.TestBase;
import com.altitime.qa.testpage.LoginPage;
import com.altitime.qa.testpage.TimeTrackPage;

public class LoginPageTest extends TestBase {
	LoginPage  loginPage;
	TimeTrackPage timeTrackPage;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void validateLoginPageTitleTest() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "actiTIME - Login","Login page title is not matched");
	}
	
	@Test(priority=2) 
	public void validateLogoDisplayedTest() {
		boolean isLogoDisplayed = loginPage.isAltiTimeLogoDisplayed();
		Assert.assertTrue(isLogoDisplayed, "Logo was not displayed in login page");
	}
	
	@Test(priority=3)
	public void validateLoggedInCheckBoxDisplayedTest() {
		boolean ischeckboxDisplayed = loginPage.isAltiTimeKeepLoggedInCheckBoxDisplayed();
		Assert.assertTrue(ischeckboxDisplayed, "LoggedIn check box was not displayed in login page");
	}
	
	@Test(priority=4)
	public void validateForgotPasswordLinkDisplayedTest() {
		boolean isForgotPasswordLinkdisplayed = loginPage.isForgotPasswordLinkDisplayed();
		Assert.assertTrue(isForgotPasswordLinkdisplayed, "Forgot password link was not displayed in login page");
	}
	
	@Test(priority=5)
	public void validateLoginButton() {
		timeTrackPage = loginPage.loginButtonClicked(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("Timetrack page class name"+timeTrackPage.getClass());
		//Assert.assertEquals(timeTrackPage.getClass(), "class com.altitime.qa.testpage.TimeTrackPage","TimeTrackPage class name is not matched");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
