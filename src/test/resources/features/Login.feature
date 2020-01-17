
@login
  Feature: Login to zerobank
    Only authorized users should be able to login to the application.

    Background: loging page
      Given user is on login page

    Scenario: only authorized user should be able to login
      Given user logs in with valid credentials using "username" and "password"
      Then "Zero - Account Summary" page should be displayed "

      Scenario: Users with wrong username or wrong password should not be able to login.
        When user enters nothing and tries to signin
        Then error message should display "Login and/or password are wrong."
        Then user enters wrong username "user" and password "pass"
        And error message should display "Login and/or password are wrong."

