package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.hrm.base.HomePage;
import generics.Utility;

public class LeaveListPage extends HomePage
	{

		public LeaveListPage(WebDriver driver)
			{
				super(driver);
				// TODO Auto-generated constructor stub
			}

		@FindBy(css = ".toggle")
		private WebElement LeaveListBar;

		@FindBy(xpath = "//div[text()='Hide Options']")
		private WebElement hideOptionsToolTip;
		
		@FindBy(xpath = "//div[text()='Expand for Options']")
		private WebElement expandforOptionsToolTip;
		
		@FindBy(xpath = "//a[@class='toggle tiptip']")
		private WebElement clickHideOptionsToolTip;
		
		@FindBy(xpath = "//a[@class='toggle tiptip activated']")
		private WebElement clickexpandforOptionsToolTip;
		
		
		
		public void moveToLeaveListBar()
			{
				Utility.moveToElement(driver, LeaveListBar);
			}

		public void checkhideOptionsToolTipIsDisplayed()
			{
				checkElementIsPresent(hideOptionsToolTip);
				log.info("Hide Options tool tip is displayed");
			}
		public void clickhideOptionsToolTip()
		{
			clickHideOptionsToolTip.click();
		}
		
		
		
		public void checkExpandforOptionsToolTipIsDisplayed()
			{
				checkElementIsPresent(expandforOptionsToolTip);
				log.info("Expand for Options tool tip is displayed");
			}
		
		public void clickExpandOptionsToolTip()
			{
				clickexpandforOptionsToolTip.click();
			}
		

	}
