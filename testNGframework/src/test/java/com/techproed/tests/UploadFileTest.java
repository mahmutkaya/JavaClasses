package com.techproed.tests;


import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UploadFileTest extends TestBase {
    @Test
    public void uploadFileMethod() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        //locate teh element of choosefile
        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        //We need to send the path of the image
        //Each of your path will be different
        //Find your own path
        //Windows Example: C:\\Users\\Herr Yanik\\Downloads"
        String pathOfTheFile="/Users/mahmutkaya/Downloads/pictures/turkish-tea.jpg";
        //We will send this pathOfTheFile to the chooseFile button
        chooseFile.sendKeys(pathOfTheFile);
        Thread.sleep(3000);
        //Click on upload button
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();
        Thread.sleep(3000);
        //Verify "File Uploaded!" message
        WebElement fileUploadedText=driver.findElement(By.xpath("//h3"));
        String actualText=fileUploadedText.getText();
        String expectedText="File Uploaded!";
        Assert.assertTrue(actualText.equals(expectedText));
        Thread.sleep(3000);
    }
}
