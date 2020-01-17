
  Feature: Account Summary page
    Verifying all account types

    Background: loging page
      Given user is on login page
      Then user logs in with valid credentials using "username" and "password"

      Scenario: verifying account types and columns
        When "Zero - Account Summary" page should be displayed "
        Then user should have to following account types: "Cash Accounts", "Investment Accounts", "Credit Accounts", "Loan Accounts"
        And Credit Accounts must have columns "Account", "Credit Card" and "Balance".


