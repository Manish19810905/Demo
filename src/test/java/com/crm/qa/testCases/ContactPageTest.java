package com.crm.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactPage contactPage;
	
	public ContactPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		contactPage = new ContactPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		contactPage = homePage.clickOnContactsLink();
		}
	
	
	@Test(priority =1)
	public void vefifyContactPageLevel(){
		Assert.assertTrue(contactPage.verifyContactLevel(), "contact page level is "
				+ "missing on the page");
		}
	
	// just for git hub propose
	/*@DataProvider
	public void getCRMTestData(){
		
	}*/
	
	@Test(priority =2)
	public void validateCreateNewContact(){
		contactPage.clickOnNewContactLonk();
		contactPage.createNewContact("Mizash", "Ghimire", "XYZ Inc.");
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}
	
}
