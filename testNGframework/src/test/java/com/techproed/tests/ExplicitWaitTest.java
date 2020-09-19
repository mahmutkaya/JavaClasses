package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitTest extends TestBase {
    /**
     * Create a class:ExplicitWaitTest. Create a method: explicitWait
     * Go to https://the-internet.herokuapp.com/dynamic_controls
     * Click on remove button
     * And verify the message is equal to “It's gone!”
     * Then click on Add button
     * And verify the message is equal to “It's back!”
     */

    @Test
    public void explicitWait(){
        //CREATE WAIT OBJECT
        WebDriverWait wait = new WebDriverWait(driver,10);
//        Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        Click on remove button
        WebElement removeButton=driver.findElement(By.xpath("(//button[@type='button'])"));
        removeButton.click();
//        And verify the message is equal to “It's gone!”
        //This is where I need to wait
        //What is our expected condition???
        //Expected condition is to wait for the It's gone element
        WebElement goneMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
//        WebElement goneMessage=driver.findElement(By.xpath("//p[@id='message']"));
        String goneMessageText=goneMessage.getText();
        Assert.assertEquals(goneMessageText,"It's gone!");
//        Then click on Add button
        WebElement addButton=driver.findElement(By.xpath("(//button[@type='button'])[1]"));
        addButton.click();
//        And verify the message is equal to “It's back!”
        WebElement backMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
//        WebElement backMessage=driver.findElement(By.xpath("//p[@id='message']"));
        String backMessageText=backMessage.getText();
        Assert.assertEquals(backMessageText,"It's back!");
    }

}
