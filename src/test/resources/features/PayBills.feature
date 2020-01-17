
Feature: Pay Bills page

  Background: loging page
    Given user is on login page
    Then user logs in with valid credentials using "username" and "password"


    Scenario: Successful Pay operation
      When user is on Pay Bills Paged
      Then user completes a successful Pay operation, "The payment was successfully submitted." is displayed.


      Scenario: Unsuccessful Pay operation
        When user is on Pay Bills Paged
        Then user completes unsuccessful Pay operation "Please fill out this field." is displayed.
