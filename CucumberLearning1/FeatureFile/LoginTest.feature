@Logintest @DataDriven
Feature: logintest feature for Orange HRM
Scenario: Login Scenario
Given user is on login page 
When user is entering valid username and Password
And user is clicking login button
Then user should navigated to home page