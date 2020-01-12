Feature: Froms Page Valitadtion 

Background:
Given User ids logged in and in CRM Home page

Scenario: create new form 

When User navigates to Forms page 
And User clicks new 
And User enters form data 
|name | introducationText | completionText|
|John |new Student        | Batch2        |
Then User saves the form 