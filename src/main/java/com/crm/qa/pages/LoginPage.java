package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	//page factory or OR
	
	//webelement username
	@FindBy(name="email")
	WebElement username;
	
	//webelement password
	@FindBy(name="password")
	WebElement password;
	
	//webelement login button button
	@FindBy(xpath = "//div[@class= 'ui fluid large blue submit button']")
	WebElement loginBtn;
	
	
	//webelement singh up
	@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
	WebElement signUpBtn;
	
	//initailization the page object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	// funcation to validate page title
	public String validateLoginPageTitle(){
		return driver.getTitle();
		}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	

}
