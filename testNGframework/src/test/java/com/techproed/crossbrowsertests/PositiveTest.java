package com.techproed.crossbrowsertests;

import com.techproed.utilities.TestBaseCross;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PositiveTest extends TestBaseCross {

    @Test
    public void positiveTest(){
        driver.get("http://www.kaolapalace-qa-environment2.com/Account/Logon");
        WebElement userNameBox=driver.findElement(By.id("UserName"));
        WebElement password=driver.findElement(By.id("Password"));
        WebElement logInButton=driver.findElement(By.id("btnSubmit"));

        userNameBox.sendKeys("manager2");
        password.sendKeys("Man1ager2!");
        logInButton.click();
    }

}

