package com.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseUtils{
	
	public WebElement findElementByXpath(String locator) {

		return DriverFactory.getDriver().findElement(By.xpath(locator));
	}

	public WebElement findElementById(String locator) {

		return DriverFactory.getDriver().findElement(By.id(locator));
	}

	
}
