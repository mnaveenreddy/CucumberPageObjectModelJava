package com.gamesys.stepdefinitions;

import com.gamesys.utils.DriverFactory;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class RegistrationSteps extends DriverFactory {

    @Given("^I enter \"([^\"]*)\" into the firstname field$")
    public void iEnterIntoTheFirstnameField(String firstName) throws Throwable {
    registrationPage.enterFirstName(firstName);
    }

    @When("^I enter \"([^\"]*)\" into the lastname field$")
    public void iEnterIntoTheLastnameField(String lastName) throws Throwable {
    registrationPage.enterLastName(lastName);
    }
}
