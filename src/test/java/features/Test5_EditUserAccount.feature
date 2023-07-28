@ignore

Feature: Edit User Account Feature

  Background:
    Given User is on the landing page
    When User clicks on log in button
    And User enters email and password
    And User clicks login button

    Scenario: Verify existing uer information is updated
      And User clicks on the email text link
      And User edits name fields
      |Bola|Dale|
      And User enters new email
      Then User clicks on save button and verify successful update