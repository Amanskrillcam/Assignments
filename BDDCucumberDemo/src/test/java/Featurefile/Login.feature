
Feature: Checking login Functionality of Orange HRM

  Scenario: Checking user login with valid credentials

    Given user is on login page
    When user is clicking on forgot password button
    Then User enters username and password
    When user clicks on login button
    Then user is on Homepage

