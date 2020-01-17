package com.zerobank.stepdefs;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountActivityStepDefs {

    @When("user is on Account Activity Page")
    public void user_is_on_Account_Activity_Page() {

        Driver.get().findElement(By.linkText("Account Activity")).click();
        BrowserUtils.wait(1);

        String expectedTitile= "Zero - Account Activity";
        String actualTitle= Driver.get().getTitle();
        Assert.assertEquals(expectedTitile, actualTitle);
    }

    @Then("drop down default option should be {string}")
    public void drop_down_default_option_should_be(String savingsDefault) {

        Select select= new Select(Driver.get().findElement(By.id("aa_accountId")));
        Assert.assertEquals(savingsDefault, select.getFirstSelectedOption().getText());
        System.out.println("select: "+select.getFirstSelectedOption().getText());

        List<String> opts= new ArrayList<>();
        List<WebElement> dropDownOpt= select.getOptions();
        for(WebElement each : dropDownOpt){
            opts.add(each.getText());
        }
        List<String> strExpected= Arrays.asList("Savings", "Checking", "Savings", "Loan", "Credit Card", "Brokerage");
        Assert.assertTrue(opts.containsAll(strExpected));
        System.out.println("strExpected: "+strExpected);


    }
}
