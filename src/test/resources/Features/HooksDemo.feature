Feature: Check Login functionlity

  Scenario: Check 01
    Given user comes to login page
    When user enters valid username and password
    And clicks on submit
    Then user is navigated to the home page
    When user clicks on logout
    Then user is navigated back to login page

  Scenario: Check 02
    Given user comes to login page
    When user enters valid username and password
    And clicks on submit
    Then user is navigated to the home page
    When user clicks on logout
    Then user is navigated back to login page
