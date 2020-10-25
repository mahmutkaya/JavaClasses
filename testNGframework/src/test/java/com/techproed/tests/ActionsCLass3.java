package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsCLass3 extends TestBase {
    //    Go to google
//    Send iPhone X prices => convert small letter capital vice versa.
//    Highlight the search box by double clicking
    @Test
    public void keysUpDown() throws InterruptedException {
        driver.get("https://www.google.com/");
        WebElement searchBox=driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions
                .keyDown(searchBox, Keys.SHIFT)//Pressing shift on the search box element
                .sendKeys("iPhone X prices")//typing in the box
                .keyUp(searchBox,Keys.SHIFT)//we have to un press from the shift button
                .perform();// performing the action
        Thread.sleep(2000);
    }
    @Test
    public void keysUpDown1() throws InterruptedException {
        driver.get("https://www.amazon.com/");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions
                .keyDown(searchBox, Keys.SHIFT)//Pressing shift on the search box element
                .sendKeys("iPhone X prices")//typing in the box
                .keyUp(searchBox,Keys.SHIFT)//we have to un press from the shift button
                .perform();// performing the action
        Thread.sleep(2000);
    }
}

