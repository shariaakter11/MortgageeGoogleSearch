Feature: Search google mortgagee calculator

Scenario Outline: Search items by expected result

Given I am in "Google" home page
When I enter "<Search input>" in search bar
And Click on enter
Then It display expected "<Search result>" 

Examples:
|Search input|Search result|
|google mortgage calculator|Mortgage calculator|
|Google Mortgage Calculator|Mortgage calculator|
|GOOGLE MORTGAGE CALCULATOR|Mortgage calculator|




Scenario Outline: Search items by expected result

Given I am in "Google" home page
When I enter "<Search input>" in search bar
And Click on enter
Then It should not displays expected "<Search result>" 

Examples:
|Search input|Search result|
|chfhtu|Mortgage calculator|

