package com.noorteck.qa.runners;

import com.noorteck.qa.utilities.BaseClass;
import com.noorteck.qa.utilities.ReadProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CampaignTest  extends BaseClass{
	@Given("^when your in home page then click on campaign link$")
	public void campaignlink()  {
		prop = ReadProperties.getProperties(environmentDataFilePath);
	openBrowser();
	navigate(prop.getProperty("url"));
	initializeClassObj();

	   
	}
	@When("^you click on TemplateButton$")
	public void clickonTemplateButton()  {
		campaingObj.clickCampaingsLink();
		campaingObj.clickTemplateButton();
		
	    
	}
	@When("^enter name \"([^\"]*)\"$")
	public void entername(String arg1)  {
	    campaingObj.enterName("Jawad");
	}

	@When("^enter Sujbect \"([^\"]*)\"$")
	public void enterujbect(String arg1)  {
		
	    campaingObj.clickSave();
	}

	@When("^enter emailBody \"([^\"]*)\"$")
	public void enteremailBody(String arg1)  {
	    
	}

	@Then("^click the save button$")
	public void click_the_save_button() {
	    
	}
	
}
