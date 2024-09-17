Feature: Contact Us Form

  Scenario: Positive test for contact us functionality
    Given user naviagtes to web page
    When user enters name and email
    Then user enters subject and message
    And user uploads file ans click submit button and accept js alert


    Scenario: get text scenario from contact us
      Given user naviagtes to web page
      And user is on contact page and validates the contact us header
      Then user validates the get in touch header
      And user validates the feedback for us header
