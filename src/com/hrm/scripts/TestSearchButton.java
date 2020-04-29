package com.hrm.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hrm.base.BasePage;
import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeInformationPage;

import generics.Utility;

public class TestSearchButton extends BaseTest
	{
		@Test(priority = 1)
		public void testSearchButton()
		{
			DashboardPage dbpage = new DashboardPage(driver);
			dbpage.clickPIM_menu();
			EmployeeInformationPage eip = new EmployeeInformationPage(driver);
			eip.CheckSearchButtonIspresent();
			String sss = "hkjdhkjs"+"/"+Utility.getFormatedDateTime()+".png";
			System.out.println(sss);
		}
	
	
		
	}
