@regression
Feature: Testing food order page functionality

  Background: The same steps between two scenario
    When  User provides 'guest1@microworks.com','Guest1!',clicks checkbox for groupOrder and clicks next button
    Then User sends invitees 'I LOVE SELENIUM'
    Then User invites 'email1@gmail.com','email2@gmail.com'
  Scenario: Group oder
   # When  User provides 'guest1@microworks.com','Guest1!',clicks checkbox for groupOrder and clicks next button
    #Then User sends invitees 'I LOVE SELENIUM'
 # Then User invites 'email1@gmail.com','email2@gmail.com'
  Then User provides location 'My House' and validate the address that contains '3137 Laguna Street' and click group order button
  Then User validate the header 'View Group Order'
  Then User Validate the description that contains 'Your group order is now pending'


  Scenario: Testing Office location Order
  #When User provides 'guest1@microworks.com','Guest1!',clicks checkbox for groupOrder and clicks next buttonThen User sends invitees 'I LOVE CUCUMBER'
    #Then User invites 'email4@gmail.com','email3@gmail.com'
 Then  User provides location 'Office' and validate the address that contains '2012 EMPIRE BLVD' and click group order button
    Then User validate the header 'View Group Order'
    Then User Validate the description that contains 'Your group order is now pending'





    #1-Login successfully weborder page parameterize username and password in feature file

  #2 click the order box and next button
  #3 send invitees section to "I LOVE SELENIUM"
  #4 send inviteList "email@gmail.com" and "email2@gmail.com"
  #5 choose the delivery option "My House" and validate adress(contains) ' 3137 Languna'
  #6 click group order button
  #7 Validate the header "View Group Order"(think about thread.sleep)
  #8 Validate the description contains(Your group order is now pending) from description

  #Scenarioe: Teasting happy path for my house food order
  #Given: user provide username and password
  #When: User clicks Group Order Box and Next Button
  #And User provides 'I love selenium' to invitees box
  #And User provides gmails"email1@gamil.com","email2@gmail.com"
  #And User chooses location 'My house' and validates the address ' '
  #And User click group order button
  #Then user validate hear' ' and description' '