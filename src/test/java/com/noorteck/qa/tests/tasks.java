package com.noorteck.qa.tests;

import org.testng.Assert;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tasks extends BaseClass {
	
	@When("^User navigates to tasks page$")
	public void user_navigates_to_tasks_page()  {
		taskObj.clickTaskLink();
		
	}

	@When("^User clicks New$")
	public void user_clicks_New() {
		taskObj.clickNew();
	   
	}

	@When("^User saves the task$")
	public void user_saves_the_task()  {
	   taskObj.clickSave();
	}

	@Then("^it should display error \"([^\"]*)\"$")
	public void it_should_display_error(String expectedError)  {
		String actualError = taskObj.getTitleError();
		Assert.assertEquals(expectedError,actualError);
			
		}
		
	

	@When("^User enters task title \"([^\"]*)\"$")
	public void taskData(String arg1)  {
	}  	

	@Then("^the title of task should be displayed \"([^\"]*)\"$")
	public void expectedTitle(String arg1)  {
	   
	}

}
