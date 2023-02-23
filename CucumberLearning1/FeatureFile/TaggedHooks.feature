@TaggedHooks
Feature: Test tagged hooks

@First
Scenario: This is first scenario
Given this is first step
When This is second step
Then this is third step 

@Second
Scenario: This is second scenario
Given this is first step
When This is second step
Then this is third step 

@Third
Scenario: This is second scenario
Given this is first step
When This is second step
Then this is third step 