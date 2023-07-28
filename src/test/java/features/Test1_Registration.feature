Feature: Register New User Feature

  Background:
    Given User is on the landing page

  Scenario: Register new user steps
    Given User clicks on register element
    And User select gender
    And User inputs the following details
    |Bugs|Tester|
    And User enters email address
    And User inputs password and confirm password
    Then User clicks register button and verify successful registration