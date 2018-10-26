package com.gamesys.stepdefinitions;

import com.gamesys.utils.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;


public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() throws IOException {
        driver = getDriver();

    }

    @After
    public void tearDownAndScreenshotOnFailure(Scenario scenario) {
        try {
            if(driver !=null && scenario.isFailed()){
                scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
            if (driver != null) {
                driver.manage().deleteAllCookies();
                driver.quit();
                driver = null;
            }
        } catch (Exception e) {
            System.out.println("Method Failed: tearDownAndScreenshotOnFailure, Exception: " + e.getMessage());
        }
    }
}

