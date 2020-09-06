package com.techproed.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdown {
    WebDriver driver;
    //Go to https://the-internet.herokuapp.com/dropdown
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dropdown");
    }

    @Test
    public void dropdownTest() throws InterruptedException {
        //1. Locate teh dropdown
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        //2. Create Select Object
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        //1.Select and Print Option 1 using index
        //Step3 Select the option byindex, or byvalue, or byvisibletext
        options.selectByIndex(1);

    }

    @Test
    public void selectByValue() throws InterruptedException {
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        //2.Select and Print Option 2 by value
        options.selectByValue("2");
    }
    //3.Select and Print Option 1 by visible text
    @Test
    public void selectByVisibleTest() throws InterruptedException {
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        options.selectByVisibleText("Option 1");
    }
    //4.Print all dropdown values
    @Test
    public void printAllValues(){
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        List<WebElement> allOptions = options.getOptions(); // this gives ALL OFF THE DROPDOWN OPTIONS

        for(WebElement w : allOptions){
            System.out.println(w.getText());
        }

    }
    //5.Find the size of the dropdown, Print true if there are 4 elements in the dropdown.
    // Print false otherwise.
    @Test
    public void dropdownSize() throws InterruptedException {
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdown);
        Thread.sleep(3000);
        int actualSize = options.getOptions().size();
        Assert.assertEquals(actualSize, 4, "EXPECTED IS NOT EQUAL TO ACTUAL");
    }
    @Test
    public void getFirstSelectedOptionTest() throws InterruptedException {
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));
        Select options = new Select(dropdownElement);
        Thread.sleep(3000);
        String firstSelectedOption=options.getFirstSelectedOption().getText();
        System.out.println("First Selected Option => "+firstSelectedOption);
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
