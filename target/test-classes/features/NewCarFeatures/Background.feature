Feature: Understand the usage of background keyword
  
  In order to trigger some of the steps which are common for each of the scenario, 
  we can use the Background keyword to execute the common steps

  Background: 
    Given User launch the website using the browser
    When User enter the username
    And User enter the password
    And User clicks on the login button

  Scenario: To check if the user profile icon is displayed
    Then Profile icon is displayed

  Scenario: To check if the menu option is displayed
    Then Menu options are displayed
