Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName|siva                  |
|lastName |prasad                |
|telephone|123456789             |   
|password |Pass@9100             |
And User selects Privacy policy
And User clicks on continue button
Then User account should get created successfully

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User enters the details into below fields
|firstName|siva                  |
|lastName |prasad                |
|telephone|123456789             |   
|password |Pass@9100             |
And User selects Yes for Newsletter
And User selects Privacy policy
And User clicks on continue button
Then User account should get created successfully

Scenario: User creates a duplicate account
Given User navigates to Register Account page
When User enters the details into below fields with duplicate email
|firstName|siva                  |
|lastName |prasad                |
|email    |sivaprasad8931@gmail.com|
|telephone|123456789             |   
|password |Pass@9100             |
And User selects Yes for Newsletter
And User selects Privacy policy
And User clicks on continue button
Then User account should get a proper warning about duplicate email

Scenario: User creates an account without filling any details 
Given User navigates to Register Account page
When User dont enter any details into fields
And User clicks on continue button
Then User should get a proper warning messages for every mandatory fields


