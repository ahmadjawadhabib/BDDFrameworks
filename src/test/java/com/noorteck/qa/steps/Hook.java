package com.noorteck.qa.steps;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Hook  extends BaseClass{
	@Before 
	public void beforeTest(Scenario scenario)  {
		setUp();
		System.out.println("Test environment set up");
		System.out.println("Execution Scenario:[" +scenario.getName()+"]");
	}
	@After 
	public void afterTest(Scenario scenario) {
		System.out.println("finish execution scenario "+scenario.getName());
		tearDown();
		
	}
	@Given("^User is logged in and in CRM Home page$")
	public void login()  {
		loginObj.enterEmail(prop.getProperty("username"));
		loginObj.enterPassword(prop.getProperty("password"));
		loginObj.clickLogin();
	    
	}

}
