package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class EmployeeInformationPage extends HomePage
	{
		public EmployeeInformationPage(WebDriver driver)
			{
				super(driver);
			}

		@FindBy(id = "btnDelete")
		private WebElement btnDelete;
		@FindBy(id = "dialogDeleteBtn")
		private WebElement btnOk;
		@FindBy(id = "searchBtn")
		private WebElement searchBtn;

		@FindBy(id = "empsearch_termination")
		private WebElement includeListbox;

		public void CheckSearchButtonIspresent()
			{
				checkElementIsPresent(searchBtn);
			}

		public void selectEmpCheckBox(String eId)
			{
				String xp = "//a[.='" + eId + "']/../..//input";
				driver.findElement(By.xpath(xp)).click();
			}

		public void clickDelete()
			{
				btnDelete.click();
			}

		public void clickOk()
			{
				btnOk.click();
			}

		public void checkEmpisdeleted(String eId)
			{
				String xp = "//a[.='" + eId + "']";
				checkElementIsNotPresent(By.xpath(xp));
				log.info("pass : Emp: " + eId + " is deleted");
			}

		public void checkIncludeListBoxHasNoDuplicates()
			{
				checkListBoxHasNoDuplicate(includeListbox, 0);
			}
		public void checkIncludeListIssorted()
		{
			checkListBoxIsSorted(includeListbox, 0);
		}

	}
