package com.techproedpackage;

import com.sun.tools.javac.util.Assert;
import com.sun.xml.internal.ws.policy.AssertionSet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 1.Create a new class : Day1Homework
 * 2.Using ChromeDriver, Go to facebook and verify if page 3tle is “facebook”,
 * If not, print the correct 3tle.
 * 3.Verify if the page URL contains facebook  if not, print the right url.
 * 4.Then Navigate to https://www.walmart.com/
 * 5.Verify if the walmart page 3tle includes “Walmart.com”
 * 6.Navigate back to facebook
 * 7.Refresh the page
 * 8.Maximize the window
 * 9.Close the browser
 */

public class Day1Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Go to facebook
        driver.get("https://www.facebook.com/");

        //verify if page title is “facebook”
        String actualTitle = driver.getTitle(), expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("title verified");
        } else {
            System.out.println("title can not verify");
            System.out.println("actual: " + actualTitle);
            System.out.println("expected: " + expectedTitle);
        }
        //Verify if the page URL contains facebook  if not, print the right url.
        String url = driver.getCurrentUrl();
        if(url.contains("facebook")){
            System.out.println("url contains 'facebook");
        }else {
            System.out.println("url does not contains 'facebook'");
            System.out.println("actual: " + url);
        }
        //Then Navigate to https://www.walmart.com/
        driver.navigate().to("https://www.walmart.com/");

        //Verify if the walmart page title includes “Walmart.com”
        String walmartTitle = driver.getTitle();
        if (walmartTitle.contains("Walmart.com")) {
            System.out.println("walmart title includes 'Walmart.com'");
        } else {
            System.out.println("walmart title does not includes 'Walmart.com'");
            System.out.println("actual: " + walmartTitle);
        }
    }

}
