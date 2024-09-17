Feature: Smart bear order functionality
  Scenario Outline: Positive scenario to check input fields
    When user is on login page user enters username as '<username>' and password as '<password>'
    Given user is on main page of smartbear and user clicks on order button
    And user is on order page and validates title of the order page as '<title>'
    Then user user selects '<productName>' from dropdown and enters '<quantity>' into quantity input field
    And user enters their name as '<name>' and street address as '<street>'
    Then user enter city as '<city>' state as '<state>' and zipcode as '<zipcode>'
    Then user checks visa radio button and enter credit card as "<creditCard>" and expiration as "<expiration>"
    And user clicks on process button
    Examples: Test data for smartBear Web App
    |username|password|title|productName|quantity|name|street|city|state|zipcode|creditCard|expiration|
    |Tester  |test    |Web Orders|ScreenSaver|100|Jerry bone|1524 st|philly|PA|19122|23457618|12/24   |
    |Tester  |test    |Web Orders|FamilyAlbum|20|Joe Doe|1524 st|fishtown|PA|19122|23457618|12/24   |