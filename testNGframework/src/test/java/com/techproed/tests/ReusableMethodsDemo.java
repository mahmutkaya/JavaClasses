package com.techproed.tests;

import com.techproed.utilities.Driver;
import com.techproed.utilities.ReusableMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReusableMethodsDemo {

    @Test
    public void test1(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/2");
        Driver.getDriver().findElement(By.xpath("//button")).click();
        WebElement helloWord=Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));
        Assert.assertEquals(helloWord.getText(),"Hello World!");
        //All is good. We don't need to use explicit wait.
        //Implicit wait solved the issue
        Driver.closeDriver();
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Driver.getDriver().findElement(By.xpath("//button")).click();
        //Hard Wait works but not a good idea
//        ReusableMethods.waitFor(6);

        //We can wait for that element to be visible on the page.
        //We have that mehtod int he reusablemethods class
        ReusableMethods.waitForVisibility(Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']")),6);
        WebElement helloWord=Driver.getDriver().findElement(By.xpath("//h4[.='Hello World!']"));
        Assert.assertEquals(helloWord.getText(),"Hello World!");


    }
}
