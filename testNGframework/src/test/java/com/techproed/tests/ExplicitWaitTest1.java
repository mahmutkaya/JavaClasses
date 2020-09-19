package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        public void isEnabled(){
//        Create a class:ExplicitWaitTest1. Create a method: isEnabled
//        Go to https://the-internet.herokuapp.com/dynamic_controls
            driver.get("https://the-internet.herokuapp.com/dynamic_controls");
//        Click enable Button
            WebElement enableButton=driver.findElement(By.xpath("(//button[@type='button'])"));
            enableButton.click();
//        And verify the message is equal to "It's enabled!"
//        And verify the textbox is enabled (I can type in the box)
            //Hint: isEnabled(); Similar to isDisplayed();
//        And click on Disable button
//        And verify the message is equal to "It's disabled!"
//        And verify the textbox is disabled (I cannot type in the box)
        }
    }

