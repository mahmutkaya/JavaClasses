package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Create a new class: VerifyURLTest
 * Navigate to google homepage
 * Verify if google homepage url is “www.google.com”
 */
public class VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Navigate to google homepage
        driver.get("https://www.google.com/");

        String actualUrl = driver.getCurrentUrl(),
                expectedUrl = "www.google.com";

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
            System.out.println("actual url: " + actualUrl + "\nexpected url: " + expectedUrl);
        }

        driver.close();
    }
}
