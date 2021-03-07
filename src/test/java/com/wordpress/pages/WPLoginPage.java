package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WPLoginPage {

	WebDriver driver;

	public WPLoginPage(WebDriver driver) {
		//PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	@FindBy(id = "usernameOrEmail")
	WebElement useroremail;
	@FindBy(name = "Continue")
	WebElement continueButton;
	@FindBy(id = "password")
	WebElement password;
	@FindBy(name = "Log In")
	WebElement loginButton;

	public void enterUserId(String uid) {

		useroremail.sendKeys(uid);

	}

	public void clickContinue() {

		continueButton.click();
	}

	public void enterPassword(String upw) {

		useroremail.sendKeys(upw);

	}

	public void clickLogIn() {

		loginButton.click();
	}

}
