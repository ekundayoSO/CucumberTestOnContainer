Feature: Add Address Feature

  Background:
    Given User is on the landing page
    When User clicks on log in button
    And User enters email and password
    And User clicks login button

  Scenario: Validate uer address is updated
    And User clicks on email text link
    And User clicks on the addresses element
    And User adjust the necessary fields
    Then User clicks on save button and validate successful update