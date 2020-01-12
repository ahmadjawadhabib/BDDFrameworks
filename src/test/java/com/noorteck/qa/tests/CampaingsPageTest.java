package com.noorteck.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.noorteck.qa.utilities.BaseClass;
import com.noorteck.qa.utilities.Common;

public class CampaingsPageTest extends BaseClass {

	@Test (priority = 1)
	public void campainsPageHeaderTest() {
		campaingObj.clickCampaingsLink();
		String expectedText = "Campaigns";
		String actualText = campaingObj.getTaskHeaderText();
		boolean isEqual = Common.compareTwoValue(actualText, expectedText);
		Assert.assertTrue(isEqual);
	}

	@Test
	public void campaingsPageCreateEmailMessage() {
		campaingObj.clickCampaingsLink();
		campaingObj.clickTemplateButton();
		campaingObj.clickNewContentTemplate();
		campaingObj.enterName("EMAIL Sandeep");
		campaingObj.enterSubject("EMAIL Batch 2 Sign Up");
		campaingObj.enterEmailBody("Email Register today for upcoming SDET class");
		campaingObj.clickSave();
		Assert.assertTrue(true, "Successfully Created New Email Message");

	}

	@Test
	public void campaingsPageCreateSmSMessage() {
		campaingObj.clickCampaingsLink();
		campaingObj.clickTemplateButton();
		campaingObj.clickNewContentTemplate();
		campaingObj.selectSmsTemplateType();
		campaingObj.enterName("SMS Sandeep");
		campaingObj.enterSmsBody("SMS Register today for upcoming SDET class");
		campaingObj.clickSave();
		Assert.assertTrue(true, "Successfully Created New SMS Message");

	}

	@Test
	public void campaingsPageRemoveSmSMessage() {
		campaingObj.clickCampaingsLink();
		campaingObj.clickTemplateButton();
		campaingObj.selectSmsContent();
		campaingObj.clickDeleteSms();
		campaingObj.validateErrorMessage();
		Assert.assertTrue(true, "Successfully Removed SMS Message");

	}

	@Test (priority = 2)
	public void campaingsPageRemoveEmailMessage() {
		campaingObj.clickCampaingsLink();
		campaingObj.clickTemplateButton();
		campaingObj.clickDeleteEmail();
		campaingObj.validateErrorMessage();
		Assert.assertTrue(true, "Successfully Removed Email Message");

	}

}
