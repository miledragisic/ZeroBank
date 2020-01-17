package com.zerobank.stepdefs;

import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class PayBillsStepDefs {

    @When("user is on Pay Bills Paged")
    public void user_is_on_Pay_Bills_Paged() {
        Driver.get().findElement(By.linkText("Pay Bills")).click();
        String expectedTitle= "Zero - Pay Bills";
        String actualTitle= Driver.get().getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user completes a successful Pay operation, {string} is displayed.")
    public void user_completes_a_successful_Pay_operation_is_displayed(String messageSucc) {

        Driver.get().findElement(By.id("sp_amount")).sendKeys("1500");
        Driver.get().findElement(By.id("sp_date")).sendKeys("2020-01-12");
        Driver.get().findElement(By.id("sp_description")).sendKeys("Deposit");
        Driver.get().findElement(By.id("pay_saved_payees")).click();
        System.out.println(Driver.get().findElement(By.id("alert_content")).getText());

        Assert.assertEquals(messageSucc, Driver.get().findElement(By.id("alert_content")).getText() );

    }
    @Then("user completes unsuccessful Pay operation {string} is displayed.")
    public void user_completes_unsuccessful_Pay_operation_is_displayed(String messageUnsucc) {

        Driver.get().findElement(By.id("sp_amount")).sendKeys("1500");
        //Driver.get().findElement(By.id("sp_date")).sendKeys("2020-01-12");
        Driver.get().findElement(By.id("sp_description")).sendKeys("Deposit");
        Driver.get().findElement(By.id("pay_saved_payees")).click();

        System.out.println("message: "+Driver.get().findElement(By.id("sp_date")).getAttribute("validationMessage"));
        String actualMessage= Driver.get().findElement(By.id("sp_date")).getAttribute("validationMessage");

        Assert.assertEquals(messageUnsucc, actualMessage);

    }

}
