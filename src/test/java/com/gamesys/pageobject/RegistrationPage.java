package com.gamesys.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class RegistrationPage extends BasePage{
    public RegistrationPage() throws IOException {
        super();
    }
    @FindBy(name="firstname") public WebElement txtFirstName;
    @FindBy(name="lastname") public WebElement txtLastName;

    public RegistrationPage enterFirstName(String firstName) throws IOException {
        txtFirstName.sendKeys(firstName);
        return new RegistrationPage();
    }

    public RegistrationPage enterLastName(String lastName) throws IOException {
        txtLastName.sendKeys(lastName);
        return new RegistrationPage();

    }
}
