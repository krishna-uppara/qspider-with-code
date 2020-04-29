package com.hrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.hrm.base.HomePage;

public class JobTitlePage extends HomePage
	{

		public JobTitlePage(WebDriver driver)
			{
				super(driver);
				// TODO Auto-generated constructor stub
			}

		@FindBy(id = "btnAdd")
		private WebElement btnAdd;

		@FindBy(id = "btnDelete")
		private WebElement delete;

		@FindBy(id = "dialogDeleteBtn")
		private WebElement ok;

		public void clickAdd()
			{
				btnAdd.click();
			}

		public void clickDelete()
			{
				delete.click();
			}

		public void clickOk()
			{
				ok.click();
			}

		public void checkJobTitlesPresent(String title)
			{
				String xp = "//table[@id='resultTable']//a[.='" + title + "']";
				checkElementIsPresent(By.xpath(xp));
			}

		public void selectJobTitleCheckBox(String title)
			{
				// dependent and independent
				String xp = "//a[.='" + title + "']/../..//input";
				driver.findElement(By.xpath(xp)).click();
			}
		
		public void checkJobTitlesNotPresent(String title)
			{
				String xp = "//table[@id='resultTable']//a[.='"+title+"']";
				checkElementIsNotPresent(By.xpath(xp));
			}

	}
