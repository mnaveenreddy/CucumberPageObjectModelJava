package com.gamesys.suiterunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        monochrome=true,
        features="src/test/java/com/gamesys/features",
        plugin={"pretty","html:target/cucumber-html-report",
                "com.cucumber.listener.ExtentCucumberFormatter:ExtentReports/ExtentReports.html" },
        glue="com/gamesys/stepdefinitions")
public class SuiteRunner extends AbstractTestNGCucumberTests {

}
