package com.zerobank.stepdefs;

import com.zerobank.pages.BasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountActivityNavigationStepDefs {
    BasePage basePage= new BasePage();


    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String accountName) {

        basePage.navigateToModule(accountName);
    }

    @Then("the Account Activity page should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {

    }

    @Then("Account drop down should have Savings selected")
    public void account_drop_down_should_have_Savings_selected() {

    }

    @Then("Account drop down should have Brokerage selected")
    public void account_drop_down_should_have_Brokerage_selected() {

    }

    @Then("Account drop down should have Checking selected")
    public void account_drop_down_should_have_Checking_selected() {

    }

    @Then("Account drop down should have Credit Card selected")
    public void account_drop_down_should_have_Credit_Card_selected() {

    }

    @Then("Account drop down should have Loan selected")
    public void account_drop_down_should_have_Loan_selected() {

    }
}
