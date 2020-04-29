package com.hrm.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.LoginPage;

public class LoginButtonCheck extends BaseTest
	{
		@BeforeClass
		public void disableAutologin()
		{
			loginlogoutRequired = false;
		}
		@Test(priority = 3)
		public void testLoginButtonIsPresent()
		{
			LoginPage lpage = new LoginPage(driver);
			lpage.checkLoginButtonIsPresent();
			mmm();
		}
		
		
		 
	}
