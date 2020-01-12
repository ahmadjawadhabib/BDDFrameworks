package com.noorteck.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.noorteck.qa.utilities.BaseClass;
import com.noorteck.qa.utilities.Common;

public class TasksPageTest extends BaseClass {

	@Test
	public void tasksPageHeaderTest() {
		taskObj.clickTaskLink();
		String expectedText = "Tasks";
		String actualText = taskObj.getTaskHeaderText();
		boolean isEqual = Common.compareTwoValue(actualText, expectedText);
		Assert.assertTrue(isEqual);
	}

	@Test
	public void tasksPageCreateNewTask() {
		taskObj.clickTaskLink();
		taskObj.clickNew();
		taskObj.enterTitle("Referral Program");
		taskObj.assignTo();
		taskObj.enterDueDate("25/01/2020 00:00");
		taskObj.enterDeal("Batch 2");
		taskObj.enterCloseDate("25/02/2020 00:00");
		taskObj.enterDiscription("Preparing for interview");
		taskObj.enterCompletion("24");
		taskObj.selectStatus();
		taskObj.selectType();
		taskObj.enterContact("John B");
		taskObj.enterCase("IT Career");
		taskObj.selectPriority();
		taskObj.selectStatus();
		taskObj.enterIdentifier("Batch2");
		taskObj.clickSave();
		Assert.assertTrue(true, "Successfully Created New Task");
		

	}

	@Test
	public void tasksPageRemoveTask() {
		taskObj.clickTaskLink();
		taskObj.clickCheckBox();
		taskObj.deleteRowOne();
		Assert.assertTrue(true, "Successfully Removed Task");

	}
}
