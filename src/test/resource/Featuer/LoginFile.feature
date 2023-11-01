@All
Feature: verify Complete Login functionality

@PostiveTesting
Scenario: Verify Login function With valid credentials
   Given launch the browser enter url
   When enter valid username
   And enter valid password
   And click on login btn
   Then it should navgate to Dashboard page
   And Close the Browser

@NegativeTesting
 Scenario: verify loginfunction with Invalid credentials
   Given launch the browser enter url
   When enter Invalid username
   And enter Invalid password
   And click on login btn
   Then it should through error message
   And Close the Browser
   
@IndividualNegativeTesting   
  Scenario: verify loginfunction with Invalid username and valid password
   Given launch the browser enter url
   When enter Invalid username
   And enter valid password
   And click on login btn
   Then it should through usernmae error message
   And Close the Browser  

@IndividualNegativeTesting
 Scenario: verify loginfunction with valid username and Invalid password
   Given launch the browser enter url
   When enter valid username
   And enter Invalid password
   And click on login btn
   Then it should through invalid password error message
   And Close the Browser
 
 @EmptyTest 
    Scenario: verify loginfunction without username and password
   Given launch the browser enter url
   When username field keep as empty
   And Password field keep as empty
   And click on login btn
   Then it should through required error message
   And Close the Browser
   