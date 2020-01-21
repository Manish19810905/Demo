package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {
	//contact click link
	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement ContactPageElement;
	//click on new contact
	@FindBy(xpath="//i[@class='edit icon']")
	WebElement newContactLink;
	// first name
	@FindBy(name="first_name")
	WebElement firstName;
	// last name
	@FindBy(name="last_name")
	WebElement lastName;
	// company name
	@FindBy(name="company")
	WebElement companyName;
	//click save button
	@FindBy(xpath="//i[@class='save icon']")
	WebElement saveBtn;
	
	
	
	
	
	
	
	
	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
	

	public  boolean verifyContactLevel(){
	return ContactPageElement.isDisplayed();
		}	
	
	public void clickOnNewContactLonk(){
		newContactLink.click();
		}
	
	public void createNewContact(String ftName, String ltName, String conName){
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		//companyName.sendKeys(conName);
		saveBtn.click();
		
	}
	
	
	
	/*public void selectCotactByName(String name){
		//provide dynamic xpath 
		driver.findElement(By.xpath("+name+"));
		
	}*/

}
