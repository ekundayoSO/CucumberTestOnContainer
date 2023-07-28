@Test2

Feature: HomePage functionality test

  Background:
    Given User is on the landing page
    When User clicks on log in button
    And User enters email and password
    And User clicks login button

  Scenario: Verify the home page message
    Then User verify login is successful