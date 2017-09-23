package com.tele.metric.test.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tele.metric.test.config.TestConfiguration;
import com.tele.metric.ui.HomePage;
import com.tele.metric.ui.LoginPage;

public class TestLoginUS156 
{
	WebDriver driver;
	LoginPage login_page;
	HomePage home_page;
	
	@BeforeMethod
	public void setUp()
	{
		driver = TestConfiguration.getDriverInstance();
		login_page = new LoginPage(driver);
		home_page = new HomePage(driver);
	}
	@Test
	public void testLoginSuccess_TC211()
	{
		login_page.getUsernameTextbox().sendKeys("admin");
		login_page.getPasswordTextbox().sendKeys("manager");
		login_page.getLoginButton().click();
		boolean status = home_page.getLogoutButton().isDisplayed();
		Assert.assertEquals(status, true);
	}
	@Test
	public void testLoginFailTC_212()
	{
		login_page.getUsernameTextbox().sendKeys("test");
		login_page.getPasswordTextbox().sendKeys("invalid");
		login_page.getLoginButton().click();
		String actual_errr_msg =
				login_page.getLoginErrorMsg().getText();
		String expected_err_msg = 
				"Username or Password is invalid. Please try again.";
		Assert.assertEquals(actual_errr_msg, expected_err_msg);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
