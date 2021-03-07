# MortgageeGoogleSearch

Execution Instruction:
1. Checkout project in local
2. Expand project
3. Right click on "TestRunnar.java" class
4. (Eclipse) Run As > TestNG Test



Manual Test Cases:

Scenario: Positive


TC1:

Given I am in "Google" home page

When I enter "google mortgage calculator" in search bar

And Click on enter

Then It display expected "Mortgage calculator" 


TC2:

Given I am in "Google" home page

When I enter "Google Mortgage Calculator" in search bar

And Click on enter

Then It display expected "Mortgage calculator" 


TC3:

Given I am in "Google" home page

When I enter "GOOGLE MORTGAGE CALCULATOR" in search bar

And Click on enter

Then It display expected "Mortgage calculator" 



Scenario: Negative


TC4:

Given I am in "Google" home page

When I enter "chfhtu" in search bar

And Click on enter

Then It should not displays expected "Mortgage calculator" 


TC5:

Given I am in "Google" home page

When I do not enter any search value in search bar

And Click on enter

Then It should not displays expected "Mortgage calculator" 


TC6:

Given I am in "Google" home page

When I enter "123#chfhtu@-" in search bar

And Click on enter

Then It should not displays expected "Mortgage calculator" 



Note: 

1. TC1 to TC4 are automate

2. TC5 and TC6 also possible to automate

