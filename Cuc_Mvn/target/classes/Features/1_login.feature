@set3
Feature: Login feature

Scenario: Verify login is successful with valid login credentials.
Given Login page is displayed

When Enter the userid and password
When Click the login button
Then Products page is displayed 
