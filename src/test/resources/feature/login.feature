Feature: Free CRM Login Feature 
Scenario: Test login with valid credentails 
	Given  User is on FREE CRM Login page 
	
	When title of login page is Cogmento CRM 
	
	And User enters valid username and password 
	
	Then User is on home page 
	
	
Scenario: Test login with valid credentails 
	Given  User is on FREE CRM Login page 
	
	When title of login page is Cogmento CRM 
	
	And User enters valid username "username" and password "password" 
	
	And User clicks on login Butten 
	
	Then close the browser
	