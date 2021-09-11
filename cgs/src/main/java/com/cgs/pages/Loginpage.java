package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	private static final String Basetest = null;
	@FindBy(id="userName") private WebElement untb;
	@FindBy(name = "j_password") private WebElement pwtb;
	@FindBy(xpath = "//input[@title=\"Sign In\"]") private WebElement signInbtn;
	
	public Loginpage()
	{
		PageFactory.initElements(com.cgs.generic.Basetest.driver,this);
	}
	public WebElement getuntb()
	{
		return untb;
	}
	public void setuntb(WebElement untb)
	{
		this.untb =untb;
		
	}
	public WebElement getpwtb()
	{
		return pwtb;
	}
	
	public void setpwtb(WebElement pwtb)
	{
	this.pwtb = pwtb;
	}
	public WebElement getSignInbtn()
	{
		return signInbtn;
		
	}
	public void setsignInbtn(WebElement signInbtn)
	{
	this.signInbtn = signInbtn;
	}
	public void logintoAPP(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signInbtn.click();
	}
	

}


