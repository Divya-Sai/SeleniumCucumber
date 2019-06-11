Feature: Login to Application URL

  @First
  Scenario: Login test to application URL
    Given User is already on login page
    When Click on Log In to enter details
    Then User enters username
    Then User enters password
    Then Verify user is on Home Page

  @Second
  Scenario: Close the browser
    Given Close the browser
