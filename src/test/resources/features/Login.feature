Feature: Login functionality

Scenario Outline: Login with valid credentials
Given User has navigated to Login page
When User has entered valid email address <username> into email field
And User has entered valid password <password> into password field
And User clicks on Login button
Then User should get successfully logged in
Examples:
|username                        |password |
|sivaprasad8931@gmail.com        |Pass@9100|
|kodurusivaprasadreddy0@gmail.com|Pass@9100|


Scenario: Login with invalid credentials
Given User has navigated to Login page
When User enters invalid email address into email field
And User enters invalid password "Password@9100" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with valid email and invalid password
Given User has navigated to Login page
When User has entered valid email address "sivaprasad8931@gmail.com" into email field
And User enters invalid password "Password@9100" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login with invalid email and valid password
Given User has navigated to Login page
When User enters invalid email address into email field
And User has entered valid password "Pass@9100" into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch

Scenario: Login without providing valid credentials
Given User has navigated to Login page
When User dont enter email address into email field
And User dont enter password into password field
And User clicks on Login button
Then User should get a proper warning message about credentials mismatch




