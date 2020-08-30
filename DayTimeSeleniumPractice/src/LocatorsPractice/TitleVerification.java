package LocatorsPractice;

import com.sun.tools.javac.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
    /**
     * 2. Go to website https://google.com
     * 3. Save the title in a string variable
     * 4. Navigate to https://etsy.com
     * 5. Save the title in a string variable
     * 6. Navigate back to previous page
     * 7. Verify that title is same is in step 3
     * 8. Navigate forward to previous page
     * 9. Verify that title is same is in step 5
     * 10. quite from the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/mahmutkaya/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2.Go to website https://google.com
        driver.get("https://www.google.com/");
        //3.Save the title in a string variable
        String gTitle = driver.getTitle();
        //4.Navigate to https://etsy.com
        driver.navigate().to("https://etsy.com");
        //5.Save the title in a string variable
        String eTitle = driver.getTitle();
        //6.Navigate back to previous page
        driver.navigate().back();
        //7.Verify that title is same is in step 3
        String backTitle = driver.getTitle();
        Assert.check(backTitle.equals(gTitle), "backTitle failed: "+backTitle+"!="+gTitle);
        //8.Navigate forward to previous page
        driver.navigate().forward();
        //9. Verify that title is same is in step 5
        String forwardTitle = driver.getTitle();
        Assert.check(forwardTitle.equals(eTitle), "forwardTitle failed: "+forwardTitle+"!="+eTitle);
        //10. quite from the browser
        driver.quit();
    }
}
