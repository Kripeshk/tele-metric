package com.tele.metric.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getUsernameTextbox()
	{
		WebElement un = driver.findElement(By.name("username"));
		return un;
	}
	public WebElement getPasswordTextbox()
	{
		return driver.findElement(By.name("pwd"));
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(
				By.cssSelector("input[type='submit']"));
	}
	public WebElement getLoginErrorMsg()
	{
		return driver.findElement(By.xpath(
				"//span[contains(text(), 'Username or Password')]"));
	}
}
