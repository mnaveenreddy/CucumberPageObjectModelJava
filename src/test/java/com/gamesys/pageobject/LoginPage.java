package com.gamesys.pageobject;

import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class LoginPage extends BasePage {
    public LoginPage() throws IOException {
        super();
    }

    @FindBy(id="email") public WebElement txtEmail;
    @FindBy(id="pass") public WebElement txtPassword;

    public LoginPage enterEmail(String email) throws IOException, InterruptedException {
        txtEmail.sendKeys(email);
        Thread.sleep(3000);
        return new LoginPage();
    }
    public LoginPage enterPssword(String password) throws IOException {
        txtPassword.sendKeys(password);
        return new LoginPage();

    }

    //Example for Data table
    public LoginPage enteremail(DataTable dataTable, int row, int column) throws IOException {
        List<List<String>> data=dataTable.raw();
        txtEmail.sendKeys(data.get(row).get(column));
        return new LoginPage();
    }
    //In steps LoginPage.enteremail(datatable, 0,1) also we can call base page methods by creating base page object in Driver Factory class
    //Using basepage object we can access all the methods.


}
