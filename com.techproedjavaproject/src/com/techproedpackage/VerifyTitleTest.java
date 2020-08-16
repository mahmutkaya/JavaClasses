package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Create a new class: VerifyTitleTest
 * Navigate to google homepage
 * Verify if google title is “google”
 */

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Navigate to google homepage
        driver.get("https://www.google.com/");
        // get the page title
        String actualTitle = driver.getTitle(),
                expectedTitle = "google";
        // Verify if google title is “google”
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
            System.out.println("actual: " + actualTitle);
            System.out.println("expected: " + expectedTitle);
        }

        driver.close();
    }
}
