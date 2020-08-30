package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox {
    /**
     * Create main method and complete the following task.
     * Go to https://the-internet.herokuapp.com/checkboxes
     * Locate the elements of checkboxes
     * Then click on checkbox1 if box is not selected
     * Then click on checkbox2 if box is not selected
     */
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //putting implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Maximizing window
        driver.manage().window().maximize();
        //Go to https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
    }
    @Test
    public void checkBoxTest(){
        //Locate the elements of checkboxes
        WebElement check1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]")),
                check2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        //Then click on checkbox1 if box is not selected
        if(!check1.isSelected()) check1.click();
        //Then click on checkbox2 if box is not selected
        if(!check2.isSelected()) check2.click();
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
