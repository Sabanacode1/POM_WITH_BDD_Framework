Feature: Place Order
User will search an item,ADD item to cart and place an order

Scenario: Search Item
Given User is on Home Page
When User search an item "Parry Hotter"
Then Item must be displayed

Scenario: Add Item to Cart
Given Item must be displayed
When User add item to cart
Then Item must be listed in cart