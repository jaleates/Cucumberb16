@regression
Feature: Teasting weborder login functionality with Scenario OUtline
  @smoke
  Scenario: Login with correct username and password

    When User fills the requested fields '<guest1@microworks.com>' and 'Guest1!'
    Then User validates the page 'ORDER DETAILS - Weborder'


    Scenario Outline: Nagative Loging Functinality
      When User fills the requested fields '<userName>' and '<password> '
      Then User validates the error message '<message>'
      Examples:
        | userName                | password | message        |
        | guest1@microworks.com   | Gues1!   | Sign in Failed |
        | guester1@microworks.com | Guest1!  | Sign in Failed |
        |                         |          | Sign in Failed |

