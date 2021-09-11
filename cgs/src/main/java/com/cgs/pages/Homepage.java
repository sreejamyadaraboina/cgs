package com.cgs.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cgs.generic.Basetest;

public class Homepage {
	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath = "//a[text()='Accounts']") private WebElement acccountstab;
	@FindBy(xpath = "//a[@href='/crm/ShowDetails.do?module=Contacts&quickcreate=true']") private WebElement contacttab;
	
	public Homepage()
	{
		PageFactory.initElements(Basetest.driver, this);
		
	}
	
	
    public WebElement getAcccountstab() {
		return acccountstab;
	}


	public void setAcccountstab(WebElement acccountstab) {
		this.acccountstab = acccountstab;
	}


	public void clickLeadsTab()
    {
    	leadsTab.click();
    	
    }
	
	public void clickaccountTab()
	{
		acccountstab.click();
	}
	
	public void clickcontacttab()
	{
		contacttab.click();
	}
}


