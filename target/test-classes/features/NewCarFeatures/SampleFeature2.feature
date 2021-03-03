Feature: Book movie ticket for PVR cinemas
  
  
  In order to watch movie at the theater the user must 
  be able to book the movie ticket using the application

  Scenario: Book a movie ticket using the mobile application , ios
    Given user is having an iOS mobile
    When user opens the web application
    And user opens the application
    And user enters the credentials
    And user clicks on the login button
    Then user is logged into the application

  Scenario: Book a movie ticket using the mobile application
    Given user is having an android mobile
    When user opens the web application
    And user opens the application
    And user enters the credentials
    And user clicks on the login button
    Then user is logged into the application
