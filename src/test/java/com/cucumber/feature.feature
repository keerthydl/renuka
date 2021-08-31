Feature: deatils on functionality of app

Scenario Outline: login functionality
Given user should be on the homepage
Then user shold enter "<username>" and "<password>"
Then user should clikc the login button
Then user validate on correct page
Then user should quit the browser

Examples:
 |username|password|
 |keerthydl|keerthy1234|
 |karun|karun23|
