@OpenGoogle
Feature: This to test Google search box
Scenario: Google search scenario
  Given user is entering google.co.in
  When user is typing search term "Arshad"
  And hitting enter button
  Then user should see the result
