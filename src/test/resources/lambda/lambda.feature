Feature: ajax input forms in lambda webpage
  Scenario: validate input forms
    Given user is on main page of lambda and clicks on ajax submit form link
    When user enters name and message as follows
    |name|meryem             |
    |message|hello what is up|
    Then user clicks on submit button
    And user validates prompted message as follow
    |expectedMessage|Ajax Request is Processing!|
    Then user validates of title of the webpage as follow
    |expectedTitle|Selenium Grid Online |