@Test3

Feature: Shopping cart feature

  Background:
    Given User is on the landing page
    When User clicks on log in button
    And User enters email and password
    And User clicks login button


  Scenario: Verify products are added to cart
    And User searches for products and add them to cart
    Then User validates products are successfully added
