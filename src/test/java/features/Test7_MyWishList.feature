Feature: WishList Feature

  Background:
    Given User is on the landing page
    When User clicks on log in button
    And User enters email and password
    And User clicks login button

    Scenario: Verify products in the wishlist
      And User searches products and add them to wishlist
      Then User validates products in the wishlist