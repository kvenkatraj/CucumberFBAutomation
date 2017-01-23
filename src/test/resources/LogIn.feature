Feature: This is my login feature

Scenario: This scenario is for valid credentialsasdfsdfsdfsdf blach blah

Given user goes to fb login page
When user enters valid username and passsword
Then User should be able to login successfully





Scenario Outline: This scenario is for In valid credentialsasdfsdfsdfsdf blach blah

Given user goes to fb login page
When user enters Invalid username "<uname>" or Invalid passsword "<password>"
Then User shouldn't be logged into the application and should be redirected to login error page.

Examples:

|uname|password|
|venkat|sdfsdfsdf|
|anusha|sdfds|
|sharath|sdfsdsdf|


Scenario: USer registration

Given user goes to fb registration page
When user enters the following user details

|Venkat|Raju|waterstone|cumming|ga|
|Venkat|Raju|waterstone|cumming|ga|
|Venkat|Raju|waterstone|cumming|ga|
|Venkat|Raju|waterstone|cumming|ga|



Then registration should be successful.

 
 


 


 













 