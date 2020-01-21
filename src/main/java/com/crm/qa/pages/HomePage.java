package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase  {

	//user display 
	@FindBy(xpath="//span[@class='user-display']")
	WebElement userNameLevel;
	//contact link
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	//deal link
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealLink;
	//task link
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement taskLink;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle(){
		
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName(){
		return userNameLevel.isDisplayed();
	}
	
	public ContactPage clickOnContactsLink(){
		contactsLink.click();
		return new ContactPage();
	}
	
	public DealsPage clickOnDealLink(){
		dealLink.click();
		return new DealsPage();
	}
	
	public TaskPage clickOnTeskLink(){
		taskLink.click();
		return new TaskPage();
	}
	
}
