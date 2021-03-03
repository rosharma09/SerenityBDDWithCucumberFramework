Feature: We can use the list as an argument in the step definations

  Scenario: To check the list argument
    Given User launches the website using the browser
    Then All the menu options are displayed to the user
      | menu options  |
      | NEW CARS      |
      | USED CARS     |
      | REVIEW & NEWS |
