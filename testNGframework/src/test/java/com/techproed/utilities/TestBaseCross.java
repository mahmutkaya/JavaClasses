package com.techproed.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public abstract class TestBaseCross {
    protected WebDriver driver;
    // @Optional --> Since we don't want to provide the the parameter from teh xml file at all time, we are making it @Optional
// @Parameters -> how do we get the browser type from the xml file???
// using @Parameters : this will help testbase read the xml file. find the "browser" and assign the value
    @Parameters("browser")
    @BeforeMethod
    public void setUp(@Optional String browser) {
        driver = DriverCross.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() {
        DriverCross.closeDriver();
    }
}
