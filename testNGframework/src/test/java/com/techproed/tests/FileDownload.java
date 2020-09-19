package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload extends TestBase {

    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");
        WebElement flower = driver.findElement(By.linkText("FLOWER.JPG"));
        flower.click();
        Thread.sleep(1000);
        //We can find the user folder using System.getProperty();  // Dynamic for user folder
        String userFolder = System.getProperty("user.home");
        System.out.println(userFolder);
        String pathOfTheFile = userFolder+"/Downloads/FLOWER.jpg";
        boolean isDownloaded = Files.exists(Paths.get(pathOfTheFile));
        Assert.assertTrue(isDownloaded);
    }
}
