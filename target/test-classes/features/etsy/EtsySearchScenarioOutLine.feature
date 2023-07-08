Feature: Testing Etsy Search Functionality With Scenario Outline
  Scenario Outline: Testing different products for search functionslity
    When User searches for '<itemName>' for etsy website
    Then User validate the title '<title>' from Etsy
    Examples:
    |itemName|title     |
    |Hat     |Hat - Etsy|
    |Key     |Key - Etsy|
    |Pin     |Pin - Etsy|