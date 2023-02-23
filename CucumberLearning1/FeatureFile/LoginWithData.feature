Feature: To check the login feature for Orange HRM
Scenario: Login Scenario
Given user is on the login page 
When user is entering valid credentials "Admin" and "admin123"
And user click the login button
Then user should see the home page