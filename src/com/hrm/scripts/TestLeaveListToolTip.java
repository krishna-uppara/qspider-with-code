package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.LeaveListPage;

public class TestLeaveListToolTip extends BaseTest
	{
		@Test(priority = 9)
		public void testLeave()
		{
			DashboardPage dbp = new DashboardPage(driver);
			dbp.clickLeaveMenu();
			LeaveListPage llp = new LeaveListPage(driver);
			llp.moveToLeaveListBar();
			llp.checkhideOptionsToolTipIsDisplayed();
			llp.clickhideOptionsToolTip();
			llp.moveToAdminModule();
			llp.moveToLeaveListBar();
			llp.checkExpandforOptionsToolTipIsDisplayed();
			llp.clickExpandOptionsToolTip();
			
		}
	}
