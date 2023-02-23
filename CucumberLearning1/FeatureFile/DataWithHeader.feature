@DataDriven
Feature: To check the login feature with header
Scenario: Login Scenario
Given Go to login page 
When enter credentials 
|UserName | Password|
|Admin | admin123|
And click login button