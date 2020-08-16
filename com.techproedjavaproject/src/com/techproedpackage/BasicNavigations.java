package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    /**
     * On the same class, Navigate to amazon home page https://www.amazon.com/
     * Navigate back to google
     * Navigate forward to amazon
     * Refresh the page
     * Maximize the window
     * Close/Quit the browser
     **/
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Navigate back to google
        driver.get("https://www.google.com/");
        // waiting 2 seconds
        Thread.sleep(2000);
        //Navigate forward to amazon
        driver.navigate().to("https://www.amazon.com/");
        // waiting 2 seconds
        Thread.sleep(2000);
        //Navigate back to google
        driver.navigate().back();
        // waiting 2 seconds
        Thread.sleep(2000);
        //Navigate forward to amazon
        driver.navigate().forward();
        //Refresh the page
        driver.navigate().refresh();
        //Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //Close/Quit the browser
        driver.close();

    }
}
