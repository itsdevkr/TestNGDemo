package com.toolsQA.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.toolsQA.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest()
	{
		
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUsername(username);
		logger.info("Username is entered");
		
		lp.setPassword(password);
		logger.info("Password is entered");
		
		lp.clickLogin();
		
		if(driver.getTitle().equals("Instagram"))
		{
			Assert.assertTrue(true);
			logger.info("Login Test 001 is passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Login Test 001 is failed");
		}
	}
	
	
}
