package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTest extends TestBase {
    @Test
    public void iframeTest() throws InterruptedException {
//        Go to https://the-internet.herokuapp.com/iframe
        driver.get("https://the-internet.herokuapp.com/iframe");
//        Verify the Bolded text contains “Editor”
        //Note that this Bolded text is NOT inside the iframe, so we don;t switch to iframe
        WebElement boldedText= driver.findElement(By.xpath("//h3"));
        //Getting the text of the element
        String boldedTextText=boldedText.getText();
        //Making the assertion
        Assert.assertTrue(boldedTextText.contains("Editor"));
//        Locate the text box
        //WE HAVE TO SWITCH TO IFRAME FIRST BECAUSE THE TEXTBOX IS IN THE IFRAME
        //METHOD 1: Swithing to the iframe by index
//        driver.switchTo().frame(0);//It is the first iframe=indexof(0)
        //METHOD 2: Switch the iframe by ID value
//        driver.switchTo().frame("mce_0_ifr");//We just need to put iframe ID value to switch to that iframe
        //METHOD 3:Switching to iframe by webelement
        WebElement iframeElement=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElement);
        Thread.sleep(3000);
        WebElement textBoxElement=driver.findElement(By.xpath("//p"));
//        Delete the text in the text box. Use clear() method to clear the input
        textBoxElement.clear();
//        Type “This text box is inside the iframe”
        Thread.sleep(3000);
        textBoxElement.sendKeys("This text box is inside the iframe");
        Thread.sleep(3000);
//        Verify the text Elemental Selenium text is displayed on the page
        //Elemental Selenium is OUTSIDE of the iframe. But currently our driver is inside the iframe.
        //So we need to get out of the iframe:driver.switchTo().parentFrame(); OR driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
        String elementText = driver.findElement(By.linkText("Elemental Selenium")).getText();
        Assert.assertTrue(elementText.equals("Elemental Selenium"));
    }

}
