package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
    @Test
    public void hardAssertTest(){
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
        //Assert if the gmail link text equals "gmail"
        String expectedGmailText="gmail";
        String actualGmailText=gmailLink.getText();
        Assert.assertEquals(actualGmailText,expectedGmailText);//FAIL
        WebElement imagesLink=driver.findElement(By.linkText("Images"));
        //Assert if the images link text is equal to "Images"
        String actualImageLinkText=imagesLink.getText();
        String expectedImageLinkText="Images";
        Assert.assertEquals(actualImageLinkText,expectedImageLinkText);//PASS
        WebElement singInLink=driver.findElement(By.linkText("Sign in"));
        //Assert if the sign in link text "sign in"
        String expectedSignInLinkText="sign in";
        String actualSignInLinkText=singInLink.getText();
        Assert.assertEquals(actualSignInLinkText,expectedSignInLinkText);//FAIL
    }
    @Test
    public void softAssertTest(){
        //Assert if the gmail link text equals "gmail"
        WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
        String expectedGmailText="gmail";
        String actualGmailText=gmailLink.getText();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualGmailText,expectedGmailText);//FAIL
        //Assert if the images link text is equal to "Images"
        WebElement imagesLink=driver.findElement(By.linkText("Images"));
        String expectedImageLinkText="Images";
        String actualImageLinkText=imagesLink.getText();
        softAssert.assertEquals(actualImageLinkText,expectedImageLinkText);//PASS
        //Assert if the sign in link text "sign in"
        WebElement singInLink=driver.findElement(By.linkText("Sign in"));
        String actualSignInLinkText=singInLink.getText();
        String expectedSignInLinkText="sign in";
        softAssert.assertEquals(actualSignInLinkText,expectedSignInLinkText);//FAIL
        //When we use soft assert, we have to use assertAll() to get the actual reports.
        //Without assertAll, this is not correct test case.
        softAssert.assertAll();
    }

    @AfterMethod
    public void tesarDown(){
        driver.close();
    }

}
