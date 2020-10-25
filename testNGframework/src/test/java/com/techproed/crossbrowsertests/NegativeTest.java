package com.techproed.crossbrowsertests;

import com.techproed.utilities.TestBaseCross;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NegativeTest extends TestBaseCross {
    @Test
    public void invalidPassword(){
        driver.get("http://www.kaolapalace-qa-environment2.com/Account/Logon");
        WebElement userNameBox=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        WebElement logInButton=driver.findElement(By.id("btnSubmit"));

        userNameBox.sendKeys("manager2");
        password.sendKeys("fakepassword");
        logInButton.click();

    }

    @Test
    public void invalidID(){
        driver.get("http://www.kaolapalace-qa-environment2.com/Account/Logon");
        WebElement userNameBox=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        WebElement logInButton=driver.findElement(By.id("btnSubmit"));

        userNameBox.sendKeys("fakeusername");
        password.sendKeys("Man1ager2!");
        logInButton.click();
    }

    @Test
    public void invalidIDAndPassword(){
        driver.get("http://www.kaolapalace-qa-environment2.com/Account/Logon");
        WebElement userNameBox=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        WebElement logInButton=driver.findElement(By.id("btnSubmit"));

        userNameBox.sendKeys("fakeusername");
        password.sendKeys("fakepassword");
        logInButton.click();
    }
}

