Feature: Checking homepage functionality

  Scenario: Checking homepage icons are working

    When user logggedin and user is on Homepage
    When user clicks on admin button
    When user clicks on PIM button
    When user clicks on leave button
    When user clicks on time button
    When user clicks on recruitment button
    When user clicks on Myinfo button
    When user clicks on performance button
    When user clicks on Dashboard button
    Then user is logging out

#    Scenario: To Validate Add user

