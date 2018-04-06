Feature: User search for lighting product

Scenario: User search for Lighting
Given User is already on Home Page
When User search for Lighting from Search tab
Then User click on Search Icon
Then User is on Search Page Result
Then Browser is closed