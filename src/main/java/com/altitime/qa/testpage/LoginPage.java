package com.altitime.qa.testpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.altitime.qa.testbase.TestBase;

public class LoginPage extends TestBase {
	
	// object repository
	@FindBy(xpath="//div[@class='atLogoImg']")
	WebElement altiLogoImage;
	
	@FindBy(id="username")
	WebElement userName;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(id="keepLoggedInCheckBox")
	WebElement keepLoggedInCheckBox;
	
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	WebElement isForgotPasswordLink;
	
	
	//constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// action methods or action functions
	
	public boolean isAltiTimeLogoDisplayed() {
		return altiLogoImage.isDisplayed();
	}

	public boolean isAltiTimeKeepLoggedInCheckBoxDisplayed() {
		return keepLoggedInCheckBox.isDisplayed();
	}
	
	public boolean isForgotPasswordLinkDisplayed() {
		return isForgotPasswordLink.isDisplayed();
	}
	
	public TimeTrackPage loginButtonClicked(String un, String pwd) {
		System.out.println("user name : "+un + "    password:  "+pwd);
		//userName.clear();
		userName.sendKeys(un);
		
		//password.clear();
		password.sendKeys(pwd);
		
		
		loginButton.click();
		System.out.println("after login button click");
		return new TimeTrackPage();
		
		
	}
}
