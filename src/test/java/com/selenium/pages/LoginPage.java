package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.selenium.locators.Constants;
import com.selenium.utils.BaseUtils;
import com.selenium.utils.DriverFactory;

public class LoginPage extends BaseUtils implements Constants{
	

	public void checkLogoIsPresent() {
		
		boolean isPresent;
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(LoginPage.LOGO_ELEMENT)));
		
		isPresent = findElementByXpath(LoginPage.LOGO_ELEMENT).isDisplayed();
		
		Assert.assertTrue(isPresent, "Logo is not present in Login Page");
		
	}
	
	public void checkLogoIsClickable() {
		
		findElementByXpath( LoginPage.LOGO_ELEMENT).click();
		
		String actualUrl = DriverFactory.getDriver().getCurrentUrl();
		
		Assert.assertEquals(actualUrl, LoginPage.EXPECTED_URL);
		
	}
	
	
	
}
