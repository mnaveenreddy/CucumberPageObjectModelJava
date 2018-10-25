package com.gamesys.stepdefinitions;
import com.gamesys.utils.DriverFactory;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;


public class LoginSteps extends DriverFactory {

    @Given("^I open \"([^\"]*)\" browser$")
    public void iOpenBrowser(String arg0) throws Throwable {
        System.out.println("Browser Opened");
    }

    @When("^I naviagte to \"([^\"]*)\" url$")
    public void iNaviagteToUrl(String url) throws Throwable {
      driver.get(url);
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void iEnterIntoTheEmailField(String email) throws Throwable {
        loginPage.enterEmail(email);
        //Thread.sleep(2000);
        System.out.println(email + "i am here");
       String Actual=loginPage.txtEmail.getAttribute("value");
        Assert.assertEquals(email,Actual);

    }

    @And("^I enter \"([^\"]*)\" into the password field$")
    public void iEnterIntoThePasswordField(String password) throws Throwable {
        loginPage.enterPssword(password);
    }
}

