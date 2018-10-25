package com.gamesys.utils;


import com.gamesys.pageobject.BasePage;
import com.gamesys.pageobject.LoginPage;
import com.gamesys.pageobject.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
    public static LoginPage loginPage;
    public static RegistrationPage registrationPage;
    public static BasePage basePage;
    public static Properties properties;
    public static FileInputStream configfile;

    public WebDriver getDriver() {
        try {
            // Read Config
//            ReadConfigFile file = new ReadConfigFile();
//            String browserName = file.getBrowser();
            properties = new Properties();
            configfile = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/com/gamesys/utils/Config.properties");
            properties.load(configfile);
            String browserName=properties.getProperty("browserName");

//            switch (browserName) {
//
//                case "firefox":
//                    // code
//                    if (null == driver) {
//                       // System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
//                        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//                        capabilities.setCapability("marionette", true);
//                        driver = new FirefoxDriver();
//                    }
//                    break;
//
//                case "chrome":
//                    // code
//                    if (null == driver) {
//                       System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/com/gamesys/drivers/chromedriver");
//                        driver = new ChromeDriver();
//                        driver.manage().window().maximize();
//                    }
//                    break;
//
//                case "ie":
//                    // code
//                    if (null == driver) {
//                        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
//                        //System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
//                        capabilities.setCapability("ignoreZoomSetting", true);
//                        driver = new InternetExplorerDriver(capabilities);
//                        driver.manage().window().maximize();
//                    }
//                    break;
//            }
            if(browserName.equalsIgnoreCase("chrome")){
                if (null == driver) {
                      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/java/com/gamesys/drivers/chromedriver");
                      driver = new ChromeDriver();
                       driver.manage().window().maximize();
                  }

            }else if(browserName.equalsIgnoreCase("firefox")){
                if (null == driver) {
                       System.setProperty("webdriver.gecko.driver", "path");
                       DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                        capabilities.setCapability("marionette", true);
                       driver = new FirefoxDriver();
                  }
            }
        } catch (Exception e) {
            System.out.println("Unable to load browser: " + e.getMessage());
        } finally {
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
            loginPage=PageFactory.initElements(driver,LoginPage.class);
            registrationPage=PageFactory.initElements(driver,RegistrationPage.class);
            basePage=PageFactory.initElements(driver,BasePage.class);

        }
        return driver;
    }
}
