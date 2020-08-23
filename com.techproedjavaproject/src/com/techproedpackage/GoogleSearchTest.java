package com.techproedpackage;

import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    /**
     * Create a new class : GoogleSearchTest
     * Create main method and complete the following task.
     * When user goes to https://www.google.com/
     * Search for “porcelain teapot”
     * And print how many related results displayed on Google
     * And click on Shopping
     * Then verify the texts : Home, Stores, Departments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //go to google
        driver.get("https://www.google.com/");
        //Search for “porcelain teapot”
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("porcelain teapot" + Keys.ENTER);

        Thread.sleep(2000);
        WebElement searchResultElement=driver.findElement(By.xpath("//div[@id='result-stats']"));
        String searchResultText=searchResultElement.getText().substring(6,16);
        System.out.println(searchResultText);
        //    And click on Shopping
        WebElement shopping=driver.findElement(By.linkText("Shopping"));
        shopping.click();
        Thread.sleep(2000);
        WebElement home=driver.findElement(By.linkText("Home"));
        String actualHomeText=home.getText();
        String expectedHomeText="Home";
        if (actualHomeText.equals(expectedHomeText)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
