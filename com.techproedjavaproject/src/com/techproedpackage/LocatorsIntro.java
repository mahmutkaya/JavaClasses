package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.Assert;

public class LocatorsIntro {
    /**
     * Create a class : LocatorsIntro
     * Create main method and complete the following task.
     * user goes to http://a.testaddressbook.com/sign_in
     * Locate the elements of email textbox,password textbox, and signin button
     * Enter below username and password then click sign in button
     * Username :  testtechproed@gmail.com
     * Password : Test1234!
     * Then verify that the expected user id  testtechproed@gmail.com
     * Verify the Addresses and Sign Out  texts are displayed
     * Find the number of total link on the page
     * Sign out from the page
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        // Locate the elements of email textbox,password textbox, and signin button
        WebElement emailTextBox = driver.findElement(By.id("session_email")),
                passwordTextBox = driver.findElement(By.id("session_password")),
                signInBtn = driver.findElement(By.name("commit"));
        // Enter below username and password then click sign in button
        // Username :  testtechproed@gmail.com
        emailTextBox.sendKeys("testtechproed@gmail.com");
        //Password : Test1234!
        passwordTextBox.sendKeys("Test1234!");
        // click sign in button
        signInBtn.click();
        // Then verify that the expected user id is testtechproed@gmail.com
        String actualUserId = driver.findElement(By.className("navbar-text")).getText(),
                expectedUserId = "testtechproed@gmail.com";
        if (actualUserId.equals(expectedUserId)) {
            System.out.println("user id is testtechproed@gmail.com");
        } else {
            System.out.println("user id is not testtechproed@gmail.com");
            System.out.println("actual user id: " + actualUserId + "\nexpected user id: " + expectedUserId);
        }
        //Verify the Addresses and Sign Out texts are displayed
        String addresses = driver.findElement(By.linkText("Addresses")).getText();
        WebElement signOut = driver.findElement(By.linkText("Sign out"));

        if (addresses.equals("Addresses") && signOut.getText().equals("Sign out")) {
            System.out.println("Addresses and Sign Out texts are displayed");
        } else {
            System.out.println("Addresses and Sign Out texts are not displayed");
            System.out.println("addresses: "+addresses + "\nsign_out: "+ signOut.getText());
        }
        // Find the number of total link on the page
        int allLinks = driver.findElements(By.tagName("a")).size();
        System.out.println(allLinks);

        // Sign out from the page
        signOut.click();

        driver.close();
    }
}
