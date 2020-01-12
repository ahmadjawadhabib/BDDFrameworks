package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.utilities.BaseClass;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormsStepDefinition extends BaseClass {

	@When("^User navigates to Forms page$")
	public void user_navigates_to_Forms_page() {
		formsTempObj.clickFormsLink();
	}

	@When("^User clicks new$")
	public void userClicksNew() {
		formsTempObj.clickNewButton();

	}

	@When("^User enters form data$")
	public void user_enters_form_data(DataTable dataTable) {
		// convert Data Tale to list map
		List<Map<String, String>> listMap = dataTable.asMaps(String.class, String.class);

		// convert list MAP to a Map
		for (Map<String, String> map : listMap) {
			// using get() method to retrieve the value by passing the key

			formsTempObj.enterName(map.get("name"));
			formsTempObj.enterIntroText(map.get("introdaction Text "));
			formsTempObj.enterCompletionText(map.get("completionText "));

		}
	}

	@Then("^User saves the form$")
	public void user_saves_the_form() {
		formsTempObj.tearDown();

	}

	@When("^User navigates to forms page$")
	public void user_navigates_to_forms_page() {
		formsTempObj.clickFormsLink();

	}

	@When("^User click delete icon$")
	public void user_click_delete_icon() {
		//formsTempObj.checkBox();
		formsTempObj.clickDelete();
	}

	@When("^User clicks delete button$")
	public void user_clicks_delete_button() {
		formsTempObj.clickDeleteButton();
	}

	@Then("^User should be directed to Forms page$")
	public void user_should_be_directed_to_Forms_page() {
		formsTempObj.clickFormsLink();
		formsTempObj.clickNewButton();

	}
	@When("^User enters name \"([^\"]*)\"$")
	public void user_enters_name(String arg1)  {
		formsTempObj.enterName("John");
		
	    
	}

	@When("^User enters introduction text \"([^\"]*)\"$")
	public void user_enters_introduction_text(String arg1)  {
	  
	}

	@When("^User enters completion text \"([^\"]*)\"$")
	public void user_enters_completion_text(String arg1)  {
	    
	}

	@When("^User clicks save$")
	public void user_clicks_save()  {
	    
	}

	@Then("^User should be directed to Active page$")
	public void user_should_be_directed_to_Active_page() {
 
	}

}