package com.hrm.scripts;

import org.testng.annotations.Test;

import com.hrm.base.BaseTest;
import com.hrm.pages.AddEmployeesPages;
import com.hrm.pages.DashboardPage;
import com.hrm.pages.EmployeeInformationPage;
import com.hrm.pages.PersonalDeatailsPage;

import generics.Utility;

public class TestCreateDeleteEmp extends BaseTest 
	{
		@Test(priority = 5)
		public void testCreateDeleteEmp()
		{
			String fn = Utility.getExcelCellValue(INPUT_PATH, "emp", 1, 0);
			String ln = Utility.getExcelCellValue(INPUT_PATH, "emp", 1, 1);
			//gog to PIM -> add employee
			DashboardPage dbPage = new DashboardPage(driver);
			dbPage.clickPIM_menu();
			dbPage.click_Add_Employees();
			//enter firstname ,lastname & Save button
			AddEmployeesPages aePage = new AddEmployeesPages(driver);
			aePage.setFirstName(fn);
			aePage.setLastName(ln);
			aePage.clickSave();
			// compare the First name and Last name 
			PersonalDeatailsPage pdPage = new PersonalDeatailsPage(driver);
			pdPage.checkFirstName(fn);
			pdPage.checklastName(ln);
			// get the Employee Id
			String eID = pdPage.checkEid();
			//click on the Employee List
			dbPage.click_Employee_List();
			//select check box of the new emp id
			EmployeeInformationPage eipage = new EmployeeInformationPage(driver);
			eipage.selectEmpCheckBox(eID);
			//click delete button
			eipage.clickDelete();
			//cloick ok
			eipage.clickOk();
			//virify deleted emp not present
			eipage.checkEmpisdeleted(eID);
		}
			
	}
