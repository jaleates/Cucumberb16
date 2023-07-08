@regression
Feature: Testing the search functionality of the etsy website
  Scenario: Search Functionality Happy Path for Etsy Hat
    When User searches for 'Hat' for etsy website
    Then User validate the title 'Hat - Etsy' from Etsy

  Scenario: Search Functionality Happy Path for Etsy Key
    When User searches for 'Key' for etsy website
    Then User validate the title 'Key - Etsy' from Etsy

  Scenario: Search Functionality Happy Path for Etsy Pin
    When User searches for 'Pin' for etsy website
    Then User validate the title 'Pin - Etsy' from Etsy