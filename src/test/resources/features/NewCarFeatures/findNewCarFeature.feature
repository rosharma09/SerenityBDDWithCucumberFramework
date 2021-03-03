Feature: Find new car feature
  
  In order to check the new cars in the market, 
  we have the find new car feature which allows
  the user to view the newly arrived cars in 
  the market for different segments and type

  Scenario: Finding new cars by brand name Renault
    Given User launches the website using the browser
    When User selects the "Find New Cars" option in the "NEW CARS" menu
    Then All the brands are displayed to the user
    When User selects the brand of the car as "Renault"
    Then User is displayed all the related cars of the brand selected
