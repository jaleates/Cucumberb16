@regression
Feature: Teasting weborder login functionality
  @smoke
  Scenario: Login with correct username and password

    When User fills the requested fields 'guest1@microworks.com' and 'Guest1!'
    Then User validates the page 'ORDER DETAILS - Weborder'
@smoke
  Scenario: Login with correct username and wrong password

    When User fills the requested fields 'guest1@microworks.com' and 'Gues1!'
    Then User validates the error message 'Sign in Failed'

  Scenario: Login with wrong username and correct password

    When User fills the requested fields 'guester1@microworks.com' and 'Guest1!'
    Then User validates the error message 'Sign in Failed'

  Scenario: Login with empty username and empty  password

    When User fills the requested fields ' ' and ' '
    Then User validates the error message 'Sign in Failed'





