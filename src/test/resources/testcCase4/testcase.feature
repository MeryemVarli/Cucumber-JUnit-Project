Feature: Test case 4 functionality
  Scenario: test case 4 workflow
    Given user navigates to web page
    And user clciks on signup login button
    Then user enters email as 'as@d.com' and enters password as '12345'
    Then user clicks on login button and validates logged in as username
    And user clicks on log out button and verifies user is on login page
