package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.generic.Basetest;

public class Createaccount {
@FindBy(xpath = "//input[@value='New Account']") private WebElement newaccount;
	
	public void Accountpage()
	{
		PageFactory.initElements(Basetest.driver, this);
	}

	public WebElement getNewaccount() {
		return newaccount;
	}

	public void setNewaccount(WebElement newaccount) {
		this.newaccount = newaccount;
	}
	public void Clickonnewaccounttab()
	{
		newaccount.click();
	}

}
