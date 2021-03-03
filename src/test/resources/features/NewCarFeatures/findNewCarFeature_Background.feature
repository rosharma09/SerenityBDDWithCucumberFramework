Feature: Find new car feature

  Background: 
    Given User launches the website using the browser
    When User selects the "Find New Cars" option in the "NEW CARS" menu

  Scenario: To find a new car by brand
    When User selects the brand of the car as "Renault"

  Scenario: To find a new car by budget
    When User selects the budget as "Under 6Lakhs"
