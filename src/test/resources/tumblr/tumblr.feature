Feature:  workflow of tumblr

  Scenario Outline: negative login in functionality
    Given user clciks on login button on main page then clicks on continue with email
    When user enter email as '<email>' and clicks next button
    And user enter password '<password>' and clicks on login button
    Then  user validates the error text '<errorText>' that appears on negative scenario
    Examples:
    |email|password|errorText|
    |shdgj@gmail.com|merr1234|Your email or password were incorrect.|



@test
    Scenario: positive scenario for signup
      Given user is on main page of tumblr
      And user clicks toggle that changes colors
      Then usser verifies url of the main page