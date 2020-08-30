package LocatorsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class EbayLocators {
    /**
     *Test case 2
     * 1. Go to ebay
     *  2. enter search any text “lg g6” term
     *  3. click on search button
     *  4. print number of results
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //1. Go to ebay
        driver.get("https://www.ebay.com/");
        //2. enter search any text “lg g6” term
        //3. click on search button
        driver.findElement(By.id("gh-ac")).sendKeys("lg g6", Keys.ENTER);
        //4. print number of results
        String res = driver.findElement(By.xpath("//h1[@Class='srp-controls__count-heading']//span[@Class='BOLD'][1]")).getText();
        System.out.println("result: "+res);

    }
}
