package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		contactPage = new ContactPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		}
	
	@Test(priority =1)
	public void homePageTitle(){
		String hopageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(hopageTitle, "Cogmento CRM", "Home page title not matched");
		}
	
	@Test(priority = 2)
	public void veriftUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
		}
	
	@Test(priority = 3)
	public void verifyContactsLinkTest(){
		contactPage = homePage.clickOnContactsLink();
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
