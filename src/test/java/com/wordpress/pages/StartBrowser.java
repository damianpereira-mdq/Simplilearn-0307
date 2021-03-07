package com.wordpress.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class StartBrowser {
	
	
	public static WebDriver startBrowser (WebDriver driver, String browserName, String appURL) {
		
		if (browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "WebDrivers/chromedriver.exe");
			driver = new ChromeDriver();			
			
		} else if (browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "WebDrivers/geckodriver.exe");
			driver = new FirefoxDriver();	
			
		} else if (browserName.equals("Opera")) {
			
			System.setProperty("webdriver.opera.driver", "WebDrivers/operadriver.exe");
			driver = new OperaDriver();	
			
		} else {
			
			System.out.println("Browser not supported!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(appURL);
		
		return driver;
		
	}

}
