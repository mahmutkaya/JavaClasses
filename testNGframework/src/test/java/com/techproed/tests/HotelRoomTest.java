package com.techproed.tests;


import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HotelRoomTest extends TestBase {
    //Create a clickOnLogin method
    public void clickOnLogin(){
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        WebElement mainPageLoginButton=driver.findElement(By.linkText("Log in"));
        mainPageLoginButton.click();
    }
    @Test
    public void createHotelRoom() throws InterruptedException {
        clickOnLogin();
        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();
        //Click on Hotel Management
        WebElement hotelManagement=driver.findElement(By.linkText("Hotel Management"));
        hotelManagement.click();
        Thread.sleep(10000);
        //Click on Hotel Rooms
        WebElement hotelRooms=driver.findElement(By.partialLinkText("Hotel Rooms"));
        hotelRooms.click();
        Thread.sleep(10000);
        //Click on Add Hotel Room
        WebElement addHotelRoomButton=driver.findElement(By.partialLinkText("ADD HOTELROOM"));
        addHotelRoomButton.click();
        Thread.sleep(10000);
        //Enter All required fields
        WebElement idHotelDropdown=driver.findElement(By.id("IDHotel"));
        Select select=new Select(idHotelDropdown);
        select.selectByIndex(1);
        WebElement code=driver.findElement(By.id("Code"));
        code.sendKeys("12345");
        WebElement name=driver.findElement(By.id("Name"));
        name.sendKeys("Best Hotel");
        WebElement location = driver.findElement(By.id("Location"));
        location.sendKeys("Houston");
        WebElement description = driver.findElement(By.xpath("//textarea[@dir='ltr']"));
        description.sendKeys("This is Royal Class Hotel Room");
        //To enter a price, we can send keys, OR we can use actions class to drag and drop
        WebElement source=driver.findElement(By.xpath("//li[@data-id='700']"));
        WebElement target= driver.findElement(By.id("Price"));
        Actions actions=new Actions(driver);
        actions.dragAndDrop(source,target).perform();
        WebElement roomTypeDropdown=driver.findElement(By.id("IDGroupRoomType"));
        Select select1=new Select(roomTypeDropdown);
        select1.selectByVisibleText("Studio");
        WebElement maxAdultCount=driver.findElement(By.id("MaxAdultCount"));
        maxAdultCount.sendKeys("5");
        WebElement maxChildrenCount=driver.findElement(By.id("MaxChildCount"));
        maxChildrenCount.sendKeys("6");
        WebElement approvedCheckbox=driver.findElement(By.id("IsAvailable"));
        approvedCheckbox.click();
        //Click Save
        WebElement saveButton= driver.findElement(By.id("btnSubmit"));
        saveButton.click();
        Thread.sleep(10000);
        //Verify the message: HotelRoom was inserted successfully
        //Click OK
    }

}
