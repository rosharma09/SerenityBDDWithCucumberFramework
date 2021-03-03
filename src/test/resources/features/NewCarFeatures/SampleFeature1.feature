Feature: To illustrate the usage of list in feature file

  Scenario: This is a sample scenario to illustrate the usage of list
    Given User is on the login page
    When User enter the username and password
      | username     | password     |
      | testusername | testpassword |
    And Click on the login button
    Then User can see the following options on the home page
      | Home Page Options |
      | New car           |
      | old car           |
      | features car      |
      | luxury car        |
