package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WPHomePage {

	WebDriver driver;

	public WPHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(name="Log In") WebElement loginButton;	
	@FindBy(name="Get Started")	WebElement signupButton;	
	@FindBy(name="Products") WebElement products;	
	@FindBy(name="Features") WebElement features;	
	@FindBy(name="Resources") WebElement resources;	
	@FindBy(name="Plans & Prices") WebElement plansandprices;

	public void clickLogin () {
		
		loginButton.click();
		
	}
	
	public void clickSignIn () {
		
		signupButton.click();
		
	}

}
