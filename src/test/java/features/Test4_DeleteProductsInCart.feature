@Test4

Feature: Delete functionality test of the application

  Background:
    Given User is on the landing page
    When User clicks on log in button
    And User enters email and password
    And User clicks login button

    Scenario: Verify products are deleted from cart
      When User clicks shopping cart element
      And User clicks on remove checkboxes
      And User clicks on update shopping cart
      Then User verify all products are deleted from cart