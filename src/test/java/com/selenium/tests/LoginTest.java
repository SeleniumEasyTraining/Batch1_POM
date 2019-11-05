package com.selenium.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.selenium.pages.LoginPage;
import com.selenium.utils.DriverFactory;

public class LoginTest extends LoginPage{


	@BeforeMethod
	@Parameters({"browserName","baseURL"})
	public void doBeforeEachMethod(String browserName,String baseUrl) {

		DriverFactory.launchBrowser(browserName);
		
		DriverFactory.getDriver().get(baseUrl);
	}

	///26738 - Verify the logo from login page
	@Test(description = "I am going to verify the logo present in login page")
	public void verifyLogo() {

		checkLogoIsPresent();

		checkLogoIsClickable();

	}

	@AfterMethod
	public void doAfterEachMethod() {
		
		DriverFactory.closeBrowser();
	}


}
