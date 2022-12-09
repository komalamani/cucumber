Feature: validate the adactin hotel application

  Scenario Outline: validate adactine application with correct Username and Password
    Given User launches the Adactin url
    When User enters the "<Username>" and "<Password>" and clicks login button
    And User searchs the holel
    And User selects the hotel
    And User enters the "<Firstname>", "<Lastname>" and "<Address>"
    And User enters the Month, Year and Card type
    And User enters the "<Cardno>" and "<cvc>"
    Then Books the hotel

    Examples: 
      | Username   | Password  | Firstname | Lastname | Address | Cardno           | cvc |
      | komalamani | komala123 | komala    | selvaraj | cbe     | 1234567898765432 | 123 |
      | komalamani | komala123 | preethi   | selvaraj | cbe     | 0987654321234567 | 893 |