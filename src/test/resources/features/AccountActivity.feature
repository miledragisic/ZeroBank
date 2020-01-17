
  Feature: Account Activity page
    Verifying Account Activity Page options

    Background: loging page
      Given user is on login page
      Then user logs in with valid credentials using "username" and "password"



      Scenario: verify the page title and options
        When user is on Account Activity Page
        Then drop down default option should be "Savings"


