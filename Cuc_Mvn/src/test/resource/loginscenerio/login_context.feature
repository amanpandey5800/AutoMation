
Feature: Login Feature
@set2
Scenario Outline: Login with valid and invalid credentials
#Given The login page is displayed
When User enters "<username>" and "<password>"

Then User action will be displayed

Examples:

| username|password       
| standard_user|secret_sauce 
  