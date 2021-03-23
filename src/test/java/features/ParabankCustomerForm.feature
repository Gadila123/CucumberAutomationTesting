Feature: Parabank customer form validation
Scenario: Parabank customer form error validation
Given user is on parabank home page
When user clicks on contact button
When user enter customer form
Then user can see the error
