package com.tele.metric.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHandler
{
	public static void mouseHover(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	// Add Mouse related actions
}
