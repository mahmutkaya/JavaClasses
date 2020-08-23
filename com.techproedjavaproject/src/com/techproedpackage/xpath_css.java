package com.techproedpackage;

import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_css {
    /**
     * Create a class : xpath_css
     * Create main method and complete the following task.
     * user goes to http://a.testaddressbook.com/sign_in
     * Locate the elements of email textbox,password textbox, and signin button
     * Enter below username and password then click sign in button
     * Username :  testtechproed@gmail.com
     * Password : Test1234!
     * Then verify that the expected user id  testtechproed@gmail.com
     * Sign out from the page
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //user goes to http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate the elements of email textbox,password textbox, and signin button
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@type='email']")),
                passwordTextBox = driver.findElement(By.xpath("//input[@type='password']")),
                signInBtn = driver.findElement(By.xpath("//input[@name='commit']"));

        //Enter below username and password then click sign in button
        //Username :  testtechproed@gmail.com
        //Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInBtn.click();

        //Then verify that the expected user id  testtechproed@gmail.com
        String actualUserId = driver.findElement(By.xpath("//span[@data-test='current-user']")).getText(),
                expectedUserId = "testtechproed@gmail.com";
        Assert.check(actualUserId.equals(expectedUserId));

        //Sign out from the page
        WebElement signOutBtn = driver.findElement(By.xpath("//a[@data-test='sign-out']"));
        signOutBtn.click();
        //To understand if we signed out, we can find a core element like sign in button to verify
        Thread.sleep(2000);
        //I am checking if signInButton element is visible after clicking on sign out
        WebElement signIn=driver.findElement(By.xpath("//input[@value='Sign in']"));
        //isDispladed() =>>>> This method is used to check is the element is on the page or not. It Returned boolean
        //If the element is on the page, this returns true it the element is not on the page, this returns false.
        if (signIn.isDisplayed()){
            System.out.println("PASSED. YOU ARE IN SING IN PAGE");
        }else{
            System.out.println("FAILED. YOU ARE NOT ON SIGN IN PAGE");
        }
        //Locating the email, password, signin element with CSS locator
        WebElement emailTextCSS=driver.findElement(By.cssSelector("input[type='email']"));
        WebElement passwordTextCSS=driver.findElement(By.cssSelector("#session_password"));
        WebElement signInCSS=driver.findElement(By.cssSelector("input[type='submit']"));
        Thread.sleep(2000);
        emailTextCSS.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        passwordTextCSS.sendKeys("Test1234!");
        Thread.sleep(2000);
        signInCSS.click();


        driver.close();

    }
}
