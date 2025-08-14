Feature: Feature to test login functionality

  Scenario Outline: Check login is successful using valid credentials
    Given our browser is open
    And user is on login page
    When user enters <mobile_number> and generates OTP
    And user is navigated to the home page having <name> as user name
    Then user logs out

    Examples: 
      | mobile_number | name   |
      |   9777959064 | Raman |
