#This is a sample feature file demonstrating background functionality with out having the actual logic
#in its respective step definition file.
Feature: Check home page functionality

  Background: user is logged in
    Given user is present on login page
    When user provides username and password
    And clicks on login button
    Then user is navigated to the dashboard
    And quick launch toolbar is displayed

  Scenario: check logout link
    When user clicks on username link
    Then logout link is displayed

  Scenario: verify personal details section is present
    When user clicks on my info link
    Then personal details section is displayed
