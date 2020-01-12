//package com.noorteck.qa.steps;
//
//import com.noorteck.qa.utilities.BaseClass;
//import com.noorteck.qa.utilities.ReadProperties;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition extends BaseClass {
//
//@Given("^User is on FREE CRM Login page$")
//public void Loginpage() {
//     
//
//			prop = ReadProperties.getProperties(environmentDataFilePath);
//			openBrowser();
//			navigate(prop.getProperty("url"));
//			initializeClassObj();
//	}
//	
// @When("^title of login page is Cogmento CRM$")
// public void getLoginTitle() {
//	 System.out.println(driver.getTitle());
//	 
// }
// 
//@When("^User enters valid username and password$")
//public void enterCredentatils()  {
//	
//	//System.out.println("enterCredentials");
//	loginObj.enterEmail(prop.getProperty("username"));
//	loginObj.enterPassword(prop.getProperty("password"));
//
//}
//
//
//	
// 
//	@When("^User clicks on login Butten$")
//	public void clickslogin() {
//		loginObj.clickLogin();
//
//	}
//	
//	@Then("^User is on home page$")
//	public void validateHomePage()  {
//		System.out.println(homeObj.getUserNameText());
//		//driver.close();
//
//	}
//	@When("^User enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void userName(String userName, String password)  {
//	    
//	}
//	@Then("^close the browser$")
//	public void closeTheBrowser()  {
//	   driver.close();
//
//	 
//	}
//}
