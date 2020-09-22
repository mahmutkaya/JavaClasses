package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitTest1 extends TestBase {
    /**
     * Create a class:ExplicitWaitTest1. Create a method: isEnabled
     * Go to https://the-internet.herokuapp.com/dynamic_controls
     * Click enable Button
     * And verify the message is equal to “It's enabled!”
     * And verify the textbox is enabled (I can type in the box)
     * And click on Disable button
     * And verify the message is equal to “It's disabled!”
     * And verify the textbox is disabled (I cannot type in the box)
     */
    @Test
    public void isEnabled() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Go to https://the-internet.herokuapp.com/dynamic_controls
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebElement enabledButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        enabledButton.click();

        //And verify the message is equal to “It's enabled!”

        WebElement enabledMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        String actualEnabledMessage = enabledMessage.getText();
        String expectedEnabledMessage = "It's enabled!";
        Assert.assertEquals(actualEnabledMessage, expectedEnabledMessage);

        WebElement textBox = driver.findElement(By.xpath("//input[@type='text']"));
        textBox.sendKeys("I can type in the box");
        Assert.assertTrue(textBox.isEnabled());

        //And click on Disable button

        WebElement disableButton = driver.findElement(By.xpath("(//button[@autocomplete='off'])[2]"));
        disableButton.click();

//        And verify the message is equal to “It's disabled!”
        WebElement disableMessage=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        String disableMessageText=disableMessage.getText();
        Assert.assertEquals(disableMessageText,"It's disabled!");
//        And verify the textbox is disabled (I cannot type in the box)
        WebElement inputBox1=driver.findElement(By.xpath("//input[@type='text']"));
        Assert.assertTrue(!inputBox1.isEnabled());


    }
}

