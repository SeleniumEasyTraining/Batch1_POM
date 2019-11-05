package com.selenium.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	private static WebDriver driver;

	public static void launchBrowser(String browserName) {

		if(browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			driver = new ChromeDriver(); 

		}else if(browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

			driver = new FirefoxDriver(); 
		}

	}

	public static WebDriver getDriver() {

		return driver;
	}
	
	public static void closeBrowser() {
		
		driver.quit();
	}
}
