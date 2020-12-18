Feature: Login 
Scenario: Login Functionality
Given user navigate to facebook homepage
When user enters username as "Venkateshnani23" and password as "password"
When user clicks on login button
Then user should be login into facebook successfuly
