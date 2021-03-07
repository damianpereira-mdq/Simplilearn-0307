package com.wordpress.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.StartBrowser;
import com.wordpress.pages.WPHomePage;
import com.wordpress.pages.WPLoginPage;

public class WPLoginTests {
	
	WebDriver driver;	
	
	@Test
	public void invalidLogin () {
		
		driver= StartBrowser.startBrowser(driver, "Chrome", "https://www.wordpress.com/");
		System.out.println(driver.getTitle());
		
		WPHomePage homePage = PageFactory.initElements(driver, WPHomePage.class);			
		
		homePage.clickLogin();		
		
	}	

}
