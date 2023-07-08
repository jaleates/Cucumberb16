@regression
Feature:Testing Functionality of sauceDemo Website
  Scenario Outline:
    Given User provides username and password then clicks login button to login to the website
    When User chooses the 'item' and clicks add to Cart button then clicks the cart sign and checkout button
    And User fills the information 'First Name', 'Last Name' and 'Postal Code' then clicks Continue Button
    Then User validates the 'Product Name' and 'Total Price', the price plus tax equals total price
    And User clicks Finish button and validate the 'massage'

    Examples: