Feature: User search Cables Product

Scenario: User search for Cables
Given User is already on Home Page
When User search for Cables from Search tab
Then User click on Search Icon
Then User is on Search Page Result
Then Browser is closed