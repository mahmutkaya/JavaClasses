package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionAnnotation {
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.out.println("before");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //putting implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //Maximizing window
        driver.manage().window().maximize();
    }

    @Test
    public void titleTest() {
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("titles are not same", expectedTitle, actualTitle);
    }

    @Test
    public void imageTest() {
        WebElement imageElement = driver.findElement(By.id("hplogo"));
        Assert.assertTrue("hplogo not found", imageElement.isDisplayed());
    }

    @Test
    public void linkTest() {
        WebElement linkElement = driver.findElement(By.linkText("Gmail"));
        Assert.assertTrue(linkElement.isDisplayed());
    }

    @AfterClass
    public static void tearDown() {
        System.out.println("after");
        //I am closing the driver after each test case
        driver.close();
    }
}
