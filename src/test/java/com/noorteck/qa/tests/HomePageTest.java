package com.noorteck.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.noorteck.qa.utilities.BaseClass;
import com.noorteck.qa.utilities.Common;

public class HomePageTest extends BaseClass {
	
	//Executing With Priority
	@Test  (priority = 2)//this will execute 2nd
	public void homePageTitleTest() {
		String expectedTitle = "Cogmento CRM";
		String actualTitle = homeObj.getHomePageTitle();
		boolean isEqual = Common.compareTwoValue(
				actualTitle, expectedTitle);
		Assert.assertTrue(isEqual);
	}

	@Test  (priority = 1) //this will execute 1st
	public void homePageUserNameTest() {
		String expectedUserName = "fahim noor";
		String actualUserName = homeObj.getUserNameText();
		boolean isEqual = Common.compareTwoValue(
				actualUserName, expectedUserName);
		Assert.assertTrue(isEqual);
	}

}
