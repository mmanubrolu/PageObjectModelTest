package com.altitime.qa.testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.altitime.qa.testbase.TestBase;

public class TimeTrackPage extends TestBase {
	
	// Object repository
	@FindBy(id="logo_aT")
	WebElement altiTimeLogo;
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	WebElement userName;
	
	@FindBy(id="taskSearchControl_field") 
	WebElement searchBox;
	
	@FindBy(xpath="//span[contains(text(),'Add Rece')]")
	WebElement addRecentTask;
	
	@FindBy(xpath="//span[contains(text(),'Add Task')]")
	WebElement addTaskButton;
	
	@FindBy(xpath="//a[text()='Enter Time-Track']")
	WebElement enterTimeTrack;
	
	@FindBy(xpath="//a[text()='View Time-Track']")
	WebElement viewTimeTrack;
	
	@FindBy(xpath="//a[@class='content tasks']")
	WebElement tasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	WebElement reports;
	
	@FindBy(xpath="//a[@class='content users']")
	WebElement users;
	
	@FindBy(id="container_users")
	WebElement userTab;
	
	//constructor
	public TimeTrackPage() {
		PageFactory.initElements(driver, this);
	}
	
	//action functions
	
	public String getTitle() {
		System.out.println("title: "+driver.getTitle());
		return driver.getTitle();
	}
	
	public boolean isLogoDisplayed() {
		return altiTimeLogo.isDisplayed();
	}
	
	public boolean isUserNameDisplayed() {
		return userName.isDisplayed();
	}

	public boolean isSearchBoxDisplayed() {
		return searchBox.isDisplayed();
	}
	
	public boolean isAddRecentTaskLinkDispayed() {
		return addRecentTask.isDisplayed();
	}
	
	public boolean isRecentTaskButtonDisplayed() {
		return addTaskButton.isDisplayed();
	}
	
	public boolean isEnterTimerTrackLinkDisplayed() {
		return enterTimeTrack.isDisplayed();
	}
	
	public boolean isViewTimerTrackLinkDisplayed() {
		return viewTimeTrack.isDisplayed();
	}
	
	public boolean isUserTabDisplayed() {
		return users.isDisplayed();
	}
	
	public UsersPage clickInUserTab() {
		userTab.click();
		return new UsersPage();
	}
}
