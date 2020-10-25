package com.techproed.tests;

import com.techproed.utilities.Driver;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExtentReportsDemo extends TestBase {

    @Test
    public void invalidPassword() {
        //This line is to create the report. This is used only once per testcase
        extentTest=extentReports.createTest("Kaola Login Test","Negative login test");
        //extentTest is used to log custom information
        extentTest.info("Opening the browser");
        Driver.getDriver().get("http://www.kaolapalace-qa-environment2.com/Account/Logon");
        WebElement userNameBox = Driver.getDriver().findElement(By.id("UserName"));
        WebElement password = Driver.getDriver().findElement(By.id("Password"));
        WebElement logInButton = Driver.getDriver().findElement(By.id("btnSubmit"));
        extentTest.info("entering correct username");
        userNameBox.sendKeys("manager2");
        extentTest.info("entering incorrect password");
        password.sendKeys("fakepassword");
        extentTest.info("clicking on the login button");
        logInButton.click();
        WebElement errorMessage=Driver.getDriver().findElement(By.id("divMessageResult"));
        String errorMessageText=errorMessage.getText();
        System.out.println(errorMessageText);
        extentTest.info("Verifying the error message");
        Assert.assertTrue(errorMessageText.contains("Wrong password"));//FAILING
        extentTest.pass("Negative Login test passed");//IF THIS WON'T EXECUTE. THEN WE SEE RED IN TEH REPORT
    }

}
