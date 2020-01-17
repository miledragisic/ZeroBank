package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = "com/zerobank/stepdefs",
        dryRun = true,
        tags = "@wip",

        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"}

)
public class CukesRunner {

}
