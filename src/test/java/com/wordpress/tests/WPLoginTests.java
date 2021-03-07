package com.wordpress.tests;

import com.wordpress.tests.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.StartBrowser;
import com.wordpress.pages.WPLoginPage;

public class WPLoginTests {
	
	WebDriver driver;	
	
	@Test
	public void invalidLogin () {
		
		driver= StartBrowser.startBrowser(driver, "Chrome", "https://www.wordpress.com/");
		
		//WPLoginPage loginPage = new WPLoginPage(driver);
		//loginPage.enterUserId ("damianpereiramdq");
		
		
	}

	

}
