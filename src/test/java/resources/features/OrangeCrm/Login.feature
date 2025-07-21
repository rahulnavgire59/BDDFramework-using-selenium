Feature: Test the login functionality

  Scenario Outline: Checking the login functionality for OpenCRM

    Given the user is on Login page
    When the user enters "<Username>"
    And user enters the "<Password>"
    Then the user clicks on login Button


    Examples:
      | Username | Password |
      | Admin    | admin123 |