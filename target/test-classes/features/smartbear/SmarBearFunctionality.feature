@regression
Feature: Testing The Creation Of Account In Order Page

  Scenario Outline: Testing account creation for Oder page
    Given User provides username and password then click login button
    When User clicks order button and provides '<Product>' and '<Quantity>' for product information
    And USer provides '<Name>', '<Street>', '<City>','<State>' and '<Zip>' for address information
    And User provides '<Card>','<Card#>' and '<ExpireDate>' for payment information
    Then User clicks process button and validate '<massage>' and click view order button
    And User validate all the information '<Name>','<Product>','<Quantity>', '<Street>', '<City>','<State>', '<Zip>','<Card>','<Card#>' and '<ExpireDate>' from the table
    Examples:
      | Name  | Product     | Quantity | Street              | City     | State | Zip    | Card             | Card#           | ExpireDate |massage|
      | Jale  | MyMoney     | 4        | 645478 Rosemary Ave | St Louis | MO    | 32456  | Visa             | 8768593769034   | 03/26      |New order has been successfully added.|
      | Leyla | FamilyAlbum | 6        | 6573 Pilot Ave      | St Louis | MO    | 756432 | MasterCard       | 7654593769034   | 05/26      |New order has been successfully added.|
      | Jale  | ScreenSaver | 7        | 645478 Rosemary Ave | St Louis | MO    | 32456  | American Express | 1234593769034   | 02/26      |New order has been successfully added.|
      | Jale  | MyMoney     | 3        | 645478 Rosemary Ave | St Louis | MO    | 32456  | Visa             | 876854563269034 | 07/26      |New order has been successfully added.|

Scenario: Testing account creation for Oder page with data table
  Given User provides username and password then click login button
  When User clicks order button and provides product and quantity for product information
  |product|MyMoney|
  |quantity|4     |
  And USer provides customername, street, city,state and zip for address information
  |customername|Jale|
  |street      |rosemarry|
  |city        |St louis |
  |state       |MO       |
  |zip         |123456   |
  And User provides card, cardNumber and expireDate for payment information
  |card|Visa|
  |cardNumber|2435476847|
  |expireDate|04/23     |
  Then User clicks process button and validate massage
|New order has been successfully added.|








