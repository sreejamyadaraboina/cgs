package com.cgs.generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import com.google.common.io.Files;

public class Webdrivercommonlib {
	public String getpagetitle()
	{
		String pagetitle = Basetest.driver.getTitle();
		return pagetitle;
	}
	
	public void waitpage(String title)
	{
		WebDriverWait wait = new WebDriverWait(Basetest.driver,20);
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	public void selectOption(String text, WebElement element)
	{
//		Select sel = new Select(element);
//		sel.selectByVisibleText(text);
		
		Select s = new Select(element);
		s.deselectByValue(text);
		
	}
	public void selectOptions(String value,WebElement element)
	{
		Select sel = new Select(element);
		
		sel.selectByValue(value);
	}
	public void selectOptions(WebElement element,int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void mouseHover(WebElement element)
	{
	Actions ac = new Actions(Basetest.driver);
	ac.moveToElement(element).perform();
	}
	
	public void verify(String actual, String expected, String page)
	{
		if(actual.equals(expected))
		{
			System.out.println(page+" is displayed, pass");
		}
		else
		{
			System.out.println(page+" is not displayed, fail");
		}
	}
	
	public void getpagescreeenshot(String path)
	{
		TakesScreenshot ts = (TakesScreenshot)Basetest.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	public void getelementscreenshot(WebElement element,String path)
	{
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			Files.copy(src, dest);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public void switchToFrame(int index)
	{
		Basetest.driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String value)
	{
		Basetest.driver.switchTo().frame(value);
	}
	
	public void switchToFrame(WebElement element)
	{
		Basetest.driver.switchTo().frame(element);
	}
	
	public void dropdownenabled(WebElement element, String elementname)
	{
		if(element.isEnabled())
		{
			Assert.assertTrue(true);
			Reporter.log(elementname+" is Enabled",true);
		}
		else
		{
			Assert.assertTrue(false);
			Reporter.log(elementname+" is Disabled",true);
		}
	}
	
	
	
	

}



