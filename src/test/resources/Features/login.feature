Feature: Feature to test login funcitonality

  Scenario Outline: Check login is successful using valid credentials
    Given our browser is open
    And user is on login page
    When user enters <mobilenumber> and generates OTP
    And user is navigated to the home page having <name> as user name
    Then user logs out

    Examples: 
      | mobilenumber | name   |
      |   9777959064 | Ramani |
