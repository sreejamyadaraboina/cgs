package com.cgs.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.cgs.generic.IAutoconstants.IAutoconstant;

public class Basetest implements IAutoconstant{
	public static WebDriver driver;
	@BeforeClass
	public  void openbrowser() throws Throwable
	{
		Filelib fl = new Filelib();
		String browser = fl.getpropdata("browser",PROP_PATH);
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, Chrome_VALUE);
		 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		String url = fl.getpropdata("url", PROP_PATH);
		driver.get(url);
		//System.out.println(url);
		
//		String actualtitle = driver.getTitle();
//		String expectedtitle = fl.getpropdata("title", PROP_PATH);
//		WebDriverCommonLib w = new WebDriverCommonLib();
//		//w.verify(actualtitle, expectedtitle, "Online Hotel Booking ");
	}
//	@AfterClass
//	public void closebrowser()
//	{
//		driver.close();
//	}

}



