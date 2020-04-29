package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeInformationPage;

public class TestIncludeListBox extends BaseTest
	{
		@Test(priority=6)
		public void testIncludeListBox()
		{
			//click pim menu
			DashboardPage dbPage = new DashboardPage(driver);
			dbPage.clickPIM_menu();
			//check include LB has no duplicates
			EmployeeInformationPage eiPage = new EmployeeInformationPage(driver);
			eiPage.checkIncludeListBoxHasNoDuplicates();		
			// check include Lb is sorted
			eiPage.checkIncludeListIssorted();
		}

	}
