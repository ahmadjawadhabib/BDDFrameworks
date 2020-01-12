#Feature: Free Form Feature 
#
###Scenario: Test From creating feature 
###
###	Given User is on FREE crm HOME page 
###	When User clicks forms links 
###	And User clickd new button 
###	And User enters name "QAT Team"
###	And User enters intro text "Team member introduction"
###	And User enters completion text "Team Lunch"
###	Then User clicks save 
###	And closes the broswer
###
#	
#	Scenario Outline: Test From creating feature 
#
#	Given User is on FREE crm HOME page 
#	When User clicks forms links 
#	And User clickd new button 
#	And User enters name "<name>"
#	And User enters intro text "<introduction>"
#	And User enters completion text "<Completion>"
#	Then User clicks save 
#	And closes the broswer
#	 
#	 Examples:
#	 |name|introduction      | Completion       |
#	 |Mike|Functuional tester|Strong Java Skills|
#	 |Tim |Manager           |Good Communication|
#	 |Kim | Lead Tester		 |developer         |
#	 
	Feature: Forms Page functionality Validation 

Background: 
	Given User is logged in and in CRM Home page 

#this is not data driven, because we are not passing any data
@RegressionTest
Scenario: Delete first row from froms table 
	When User navigates to forms page 
	And User click delete icon
	And User clicks delete button
	Then User should be directed to Forms page 

	
#	Cucumber Data Driven Approach type 1 (passing data in quotes directly)"	

Scenario: Create new form 
	When User navigates to forms page 
	And User clicks New 
	And User enters name "John" 
	And User enters introduction text "New SDET Student" 
	And User enters completion text "New Career Path" 
	And User clicks save 
	Then User should be directed to Active page 
	
Scenario: Create new form 
	When User navigates to forms page 
	And User clicks New 
	And User enters form field data 
		|name |introductionText | completionText    |
		|Mike | Current Student | Approach 1| 
	And User clicks save 
	Then User should be directed to Active page 
	
	#Cucumber Data Driven Approach type 2 using dataTables with Scenario
	@SmokeTest	@RegressionTest
Scenario: Create new form 
	When User navigates to forms page 
	And User clicks New 
	And User enters  form data 
		|name |introductionText | completionText     |
		|Mike | Current Student | Databale Approach 2| 
	And User clicks save 
	Then User should be directed to Active page 
	
	
	#Cucumber Data Driven Approach type 3 using Scenario Outline	
	@RegressionTest
Scenario Outline: Create new form 
	When User navigates to forms page 
	And User clicks New 
	And User enters form field data "<name>","<introductionText>","<completionText>" 
	And User clicks save 
	Then User should be directed to Active page 
	
	Examples: 
		|name |introductionText  | completionText   	 |
		|Tim  | Developer 		 | works from home		 | 	
		|Jim  | Automation 		 | Cubic 123			 |  
#		|Mane | Functional Tester| New Team member 
	 
	 
	 
	 
	 
	Scenario Outline: Test login with valid credentails 
	Given  User is on FREE CRM Login page 
	
	When title of login page is Cogmento CRM 
	
	And User enters valid username "<username>" and password "<password>" 
	
	And User clicks on login Butten 
	
	Then close the browser 
	 Examples:
	 |username            |password         | 
	 |abc                 |noorteck123      |
	 |fahimn12@gmail.com  |   worng pass    |         
	 |wrongUserName       |   wrongpassword |    
	 |fahimn12@gmail.com  |noorteck123      |
	 
	 
	 
	 
	 
	 
	 
	 
	 
	     
	 