package com.hrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hrm.base.HomePage;

public class PersonalDeatailsPage extends HomePage
	{

	public PersonalDeatailsPage(WebDriver driver)
		{
			super(driver);
			// TODO Auto-generated constructor stub
		}	
	
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement pFn;
	@FindBy(id="personal_txtEmpLastName")
	private WebElement pln;
	@FindBy(id="personal_txtEmployeeId")
	private WebElement eId;
		
	public void checkFirstName(String efn)
	{
		String afn = pFn.getAttribute("value");
		Assert.assertEquals(afn, efn,"verfying the firstname");
		log.info("first name is successfully verifed");
	}
	
	public void checklastName(String eln)
		{
			String aln = pln.getAttribute("value");
			Assert.assertEquals(aln, eln,"verfying the lastname");
			log.info("last name is successfully verifed");
	
		}

	public String checkEid()
		{
			return eId.getAttribute("value");
			
		}
		

	}
