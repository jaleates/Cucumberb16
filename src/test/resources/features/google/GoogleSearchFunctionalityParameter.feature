@apiregression  @regression
Feature: Testing the Google search functionality parameters
  Background: Google search
    Given User navigates to 'https://www.google.com/'
  #general description
  Scenario: Happy Path(positive) Testing for Search parameter
    #test case
   # Given User navigates to 'https://www.google.com/'
    When User searches for 'CodeFish'
    Then User validates first page returns more than 10 links



  Scenario: Happy PAth(positive) testing Result for Search parameter
  #  Given User navigates to 'https://www.google.com/'
    When User searches for 'Kyrgyz Food in USA'
    Then User Validates the result is less than '300000000'
@smoke
  Scenario:Loading time for search parameter
   # Given User navigates to 'https://www.google.com/'
    When User searches for 'Turkish Baklava'
    Then Validate the result of loading time is less than a '1.0'