Feature: To get the data from Virgin Games
  Scenario: User wants to get Bingo Data
    When User send the get request
    Then User get response status code 200
    And user verify name is 'Adventure'






