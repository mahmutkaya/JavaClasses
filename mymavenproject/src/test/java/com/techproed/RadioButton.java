package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadioButton {
    /**
     * Create a class : RadioButton
     * Go to https://www.facebook.com/
     * Locate the elements of radio buttons
     * Then click on the radio buttons for your gender if they are not selected
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
        //Go to https://www.facebook.com/
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void checkRadioButtons(){
        //Locate the elements of radio buttons
        driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
        //Then click on the radio buttons for your gender if they are not selected
        WebElement genBtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        if(!genBtn.isSelected()) genBtn.click();
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
