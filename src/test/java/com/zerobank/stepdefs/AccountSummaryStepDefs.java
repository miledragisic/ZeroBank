package com.zerobank.stepdefs;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountSummaryStepDefs extends BrowserUtils {

    @Then("user should have to following account types: {string}, {string}, {string}, {string}")
    public void user_should_have_to_following_account_types(String string1, String string2, String string3, String string4) {

        List<String> account= Arrays.asList(string1, string2,string3,string4);

        List<WebElement> accounts=  Driver.get().findElements(By.xpath("//*[@class='board-header']"));
        List<String> str= new ArrayList<String>();

        for(WebElement each : accounts){
            str.add(each.getText());
        }
        Assert.assertTrue(str.containsAll(account));
    }

    @Then("Credit Accounts must have columns {string}, {string} and {string}.")
    public void credit_Accounts_must_have_columns_and(String account, String creditC, String balance) {

        List<String> strExpected= Arrays.asList(account, creditC, balance);
        List<String> listStr= new ArrayList<>();

        List<WebElement> creditAccounts2= Driver.get().findElements(By.xpath("//div[3]/div/table/thead/tr//th"));
        for(WebElement each: creditAccounts2){
            listStr.add(each.getText()) ;
        }
        Assert.assertTrue(strExpected.containsAll(listStr));


    }
}
