package com.noorteck.qa.steps;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Campaigns extends BaseClass{
	
	

	@When("^User navigates to campaings page$")
	public void navigateToPage() {
		campaingObj.clickCampaingsLink();
	     
	}

	@When("^User clicks template$")
	public void clicksContent()  {
		campaingObj.clickTemplateButton();
	   
	}

	@When("^User clicks new content template$")
	public void clickNewContentTemplate()  {
	 campaingObj.clickNewContentTemplate();
	    
	}

	@When("^User enters name, subject, body in the field \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enterEmailData(String name, String subject, String body) {
	    campaingObj.enterSmsBody(name);
	    campaingObj.enterSubject(subject);
	    campaingObj.enterEmailBody(body);
	}

	@When("^User clicks save button$")
	public void clicksSave()  {
		campaingObj.clickSave();
	  
	}

	@Then("^User should be directed to the Content Templates Page$")
	public void inContentTempPage()  {
		System.out.println("User is in Content Templates Page ");
	   
	}
}
