package com.techproed.smoketest;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest extends TestBase {

    //Create a clickOnLogin method
    public void clickOnLogin(){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        WebElement mainPageLoginButton=driver.findElement(By.linkText("Log in"));
        mainPageLoginButton.click();
    }

    @Test
    public void invalidPassword() throws InterruptedException {
//        ACCEPTANCE CRITERIA:
//        When user goes to the application http://www.kaolapalace-qa-environment2.com/
//        And click on the Login button
//        Then verify user is not able to login with incorrect password.
        clickOnLogin();
        WebElement username=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        username.sendKeys("manager2");
        password.sendKeys("1234");
        WebElement loginButton=driver.findElement(By.id("btnSubmit"));
        loginButton.click();
        WebElement errorMessage=driver.findElement(By.id("divMessageResult"));
        String errorMessageText=errorMessage.getText();
        System.out.println(errorMessageText);
        //When the username correct, password is incorrect, then i must see Wrong password in the error message
        Assert.assertTrue(errorMessageText.contains("Wrong password"));
    }
    @Test
    public void invalidID(){
//        ACCEPTANCE CRITERIA:
//        When user goes to the application http://www.kaolapalace-qa-environment2.com/
//        And click on the Login button
//        Then verify user is not able to login with incorrect ID when the username is correct.
        clickOnLogin();
        WebElement username=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        username.sendKeys("fakeid");
        password.sendKeys("Man1ager2!");
        WebElement loginButton=driver.findElement(By.id("btnSubmit"));
        loginButton.click();
        WebElement errorMessage=driver.findElement(By.id("divMessageResult"));
        String errorMessageText=errorMessage.getText();
        Assert.assertTrue(errorMessageText.contains("Username or password is incorrect, please correct them and try again"));
    }
    @Test
    public void invalidIDAndPassword(){
//        ACCEPTANCE CRITERIA:
//        When user goes to the application http://www.kaolapalace-qa-environment2.com/
//        And click on the Login button
//        Then verify user is not able to login with incorrect ID and incorrect password

        clickOnLogin();
        WebElement username=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        username.sendKeys("fakeid");
        password.sendKeys("123141235");
        WebElement loginButton=driver.findElement(By.id("btnSubmit"));
        loginButton.click();
        WebElement errorMessage=driver.findElement(By.id("divMessageResult"));
        String errorMessageText=errorMessage.getText();
        Assert.assertTrue(errorMessageText.contains("Try again please"));
    }

}
