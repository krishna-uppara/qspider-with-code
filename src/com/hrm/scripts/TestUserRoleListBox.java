package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.SystemUserpage;

public class TestUserRoleListBox extends BaseTest
	{
		@Test(priority = 8)
		public void testUserRoleListBox()
		{
			DashboardPage dbp = new DashboardPage(driver);
			dbp.clickAdminModule();
			dbp.moveToUserManagementMenu();
			dbp.clickUsersMenu();
			SystemUserpage sup = new SystemUserpage(driver);
			sup.checkUserRoleListBoxIsSorted();
		}
		
	}
