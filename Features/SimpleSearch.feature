@googlesearch

Feature: google search



Scenario Outline: simple search
Given I am on google homepage
When I enter search "<Keyword>"
And I click on google search button
Then I receive related search result 


Examples:
| Keyword						|
| Quality Assurance	|
| Software Testing	|