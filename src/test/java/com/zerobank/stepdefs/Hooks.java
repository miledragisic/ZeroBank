package com.zerobank.stepdefs;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("\nThis is coming from before scenario");
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("This is coming from after scenario\n");
        // if scenario fails, take a screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        BrowserUtils.wait(3);
        Driver.get().close();
    }

}
