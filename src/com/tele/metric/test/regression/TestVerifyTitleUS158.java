package com.tele.metric.test.regression;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tele.metric.test.config.TestConfiguration;

public class TestVerifyTitleUS158 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver = TestConfiguration.getDriverInstance();
	}
	@Test
	public void testVerifyTitleTC510()
	{
		String actual_title = driver.getTitle();
		String expected_title = "actiTIME - Login";
		Assert.assertEquals(actual_title, expected_title);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
}
