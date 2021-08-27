package com.altitime.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.altitime.qa.testbase.TestBase;
import com.altitime.qa.testpage.LoginPage;
import com.altitime.qa.testpage.TimeTrackPage;

public class TimeTrackPageTest extends TestBase  {
	LoginPage loginPage;
	TimeTrackPage timeTrackPage;
	
	public TimeTrackPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		timeTrackPage = loginPage.loginButtonClicked(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void validateTitleTest() {
		String title= timeTrackPage.getTitle();
		Assert.assertEquals(title, "actiTIME -  View Time-Track", "Title was not matched in time track page");
	}
	
	@Test(priority=2)
	public void validateSearchBoxDisplayedTest() {
		boolean isSearchBoxDisplayed = timeTrackPage.isSearchBoxDisplayed();
		Assert.assertTrue(isSearchBoxDisplayed, "Search box is not displayed");
	}
	
	@Test(priority=3)
	public void validateLogoDisplayedTest() {
		boolean isLogoDisplayed = timeTrackPage.isLogoDisplayed();
		Assert.assertTrue(isLogoDisplayed, "Logo is not displayed");
		
	}
	
	@Test(priority=4)
	public void validateUserNameDisplayedTest() {
		boolean isUserNameDisplayed = timeTrackPage.isUserNameDisplayed();
		Assert.assertTrue(isUserNameDisplayed, "User name  is not displayed");
	}
	
	@Test(priority=5)
	public void validateAddRecentTaskLinkDisplayedTest() {
		boolean isAddRecentLinkDisplayed = timeTrackPage.isAddRecentTaskLinkDispayed();
		Assert.assertTrue(isAddRecentLinkDisplayed, "Add recent link  is not displayed");
	}
	
	@Test(priority=6)
	public void validateAddRecentTaskButtonDisplayedTest() {
		boolean isAddrecentTaskButtonDisplayed = timeTrackPage.isRecentTaskButtonDisplayed();
		Assert.assertTrue(isAddrecentTaskButtonDisplayed, "Add recent task button  is not displayed");
		
	}
	
	@Test(priority =7)
	public void validateUserTabLinkDisplayedTest() {
		boolean isUserTabLinkDisplayed = timeTrackPage.isUserTabDisplayed();
		Assert.assertTrue(isUserTabLinkDisplayed, "User Tab  is not displayed");
	}
	
	@Test(priority =8)
	public void clickOnUserTabLinkDisplayedTest() {
		timeTrackPage.clickInUserTab();
		//boolean isUserTabLinkDisplayed = timeTrackPage.isUserTabDisplayed();
		//Assert.assertTrue(isUserTabLinkDisplayed, "User Tab  is not displayed");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
