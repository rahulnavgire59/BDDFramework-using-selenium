Feature: Launch the Yatra.com and show the lowest price in the Current month

  @smoke
  Scenario Outline: for the flights pick find the lowes price
    Given the user loges in to the Yatra.com
    When user clicks selects "<TripType>"
    And user selects "<From>" and "<To>" destinations
    Then find the Lowest price in curent months.

    Examples:
      | TripType   | From      | To     |  |
      | Round Trip | Hyderabad | Mumbai |  |