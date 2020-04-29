package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddJobTitlePage;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.JobTitlePage;

public class TestJobTitle extends BaseTest
	{
		@Test
		public void testJobTitle()
		{
			DashboardPage dbpage = new DashboardPage(driver);
			dbpage.clickAdminModule();
			dbpage.moveToJob();
			dbpage.clickJobTitleMenu();
			JobTitlePage jtp = new JobTitlePage(driver);
			jtp.clickAdd();
			AddJobTitlePage ajtp = new AddJobTitlePage(driver); 
			ajtp.setjobTitle("manager");
			ajtp.clickSave();
			jtp.checkJobTitlesPresent("manager");
			jtp.selectJobTitleCheckBox("manager");
			jtp.clickDelete();
			jtp.clickOk();
			jtp.checkJobTitlesNotPresent("manager");
		}
	}
