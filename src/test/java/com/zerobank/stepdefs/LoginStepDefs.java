package com.zerobank.stepdefs;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs extends BrowserUtils {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Driver.get().findElement(By.id("signin_button")).click();
        wait(1);

    }

    @Given("user logs in with valid credentials using {string} and {string}")
    public void user_logs_in_with_valid_credentials_using_and(String userName, String passWord) throws InterruptedException {

        Driver.get().findElement(By.id("user_login")).sendKeys(userName);
        Driver.get().findElement(By.id("user_password")).sendKeys(passWord);
        Driver.get().findElement(By.cssSelector("[name='submit']")).click();
        wait(1);


    }

    @Then("{string} page should be displayed \"")
    public void page_should_be_displayed(String pageTitle) throws InterruptedException {
        String actualTitle= Driver.get().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(pageTitle, actualTitle);

    }

    @When("user enters nothing and tries to signin")
    public void user_enters_nothing_and_tries_to_signin() {
        Driver.get().findElement(By.cssSelector("[name='submit']")).click();
        wait(2);
    }

    @Then("error message should display {string}")
    public void error_message_should_display(String expectedErrorMessage) {

        String actualEror= Driver.get().findElement(By.cssSelector("[class='alert alert-error']")).getText();
        System.out.println(actualEror);
        Assert.assertEquals(actualEror, expectedErrorMessage);
        wait(2);
    }

    @Then("user enters wrong username {string} and password {string}")
    public void user_enters_wrong_username_and_password(String wrongUser, String wrongPass) {

        Driver.get().findElement(By.id("user_login")).sendKeys(wrongUser);
        Driver.get().findElement(By.id("user_password")).sendKeys(wrongPass);
        wait(2);
        Driver.get().findElement(By.cssSelector("[name='submit']")).click();
        wait(2);


    }


}
