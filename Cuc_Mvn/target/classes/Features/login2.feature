@set2
Feature: Login Feature
Scenario Outline: Login with valid and invalid credentials
Given The login page is displayed
When User enters "<username>" and "<password>"
When User clicks on login button
Then The application should display the message "<message>"

Examples:

| username        |   password        |  message    |
| standard_user   |   secret_sauce    |  Products    |
| standard_user   |   standard_user1  |  Epic sadface: Username and password do not match any user in this service    |  