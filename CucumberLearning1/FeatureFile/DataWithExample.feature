@DataDriven
Feature: Checking Login Feature with Example Keyword
Scenario Outline: Login Scenario
Given Go login page 
When you entered credentials "<UserName>" and password "<Password>"
And click login button

Examples:
|UserName | Password|
|Admin | admin123|
|Admin | admin123|