package com.techproed.tests;
import com.techproed.utilities.Driver;
import com.techproed.utilities.ReusableMethods;
import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsClass2 extends TestBase {
    //Create ReusableMethod object to access its methods
    @Test
    public void hoverOver() throws InterruptedException {
//        Given user is on the https://www.amazon.com/
        Driver.getDriver().get("https://www.amazon.com/");
//        When use click on “Your Account” link
        //We have to hover over to see Your Account
        WebElement hoverOverElement=Driver.getDriver().findElement(By.id("nav-link-accountList"));
//        Actions actions = new Actions(driver);
//        //We use moveToElement to hover over on an element
//        actions.moveToElement(hoverOverElement).perform();
        ReusableMethods.hover(hoverOverElement);
        Thread.sleep(3000);
//        Then verify the page title contains “Your Account”
        //Locationg the element of Your Account
        WebElement account= Driver.getDriver().findElement(By.linkText("Your Account"));
        account.click();
        //Verifying your Account page title
        String actualPageTitle=Driver.getDriver().getTitle();
        String expectedTitle="Your Account";
        Assert.assertTrue(actualPageTitle.contains(expectedTitle));
    }
}
