@uiregression @regression
Feature: Testing the Google search functionality
  #general description
  Scenario: Happy Path(positive) Testing for Search
    #test case
    Given User navigates to google
    When User searches for CodeFish
    Then User validates first page returns more than ten links


@smoke
Scenario: Happy PAth(positive) testing Result for Search
  Given User navigates to google
  When User searches for Kyrgyz Food in USA
  Then User Validates the result is less than three hundred million

  Scenario:Loading time for search
    Given User navigates to google
    When User searches for Turkish Baklava
    Then Validate the result of loading time is less than a second