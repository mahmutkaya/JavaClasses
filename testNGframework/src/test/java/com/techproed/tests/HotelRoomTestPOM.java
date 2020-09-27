package com.techproed.tests;

import com.techproed.pages.KoalaDefaultPage;
import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HotelRoomTestPOM extends TestBase {
    KoalaLoginPage koalaLoginPage;
    KoalaMainPage koalaMainPage;
    KoalaDefaultPage koalaDefaultPage;

    @BeforeMethod
    public void koalaLogin(){
        driver.get(ConfigReader.getProperty("koala_url"));

        koalaMainPage = new KoalaMainPage(driver);
        koalaMainPage.mainLoginBtn.click();

        koalaLoginPage = new KoalaLoginPage(driver);
        koalaLoginPage.koalaUserName.sendKeys(ConfigReader.getProperty("username"));
        koalaLoginPage.koalaPassword.sendKeys(ConfigReader.getProperty("password"));
        koalaLoginPage.koalaSubmitBtn.click();
    }

    @Test
    public void hotelRoomTest() throws InterruptedException {
        koalaDefaultPage = new KoalaDefaultPage(driver);
        koalaDefaultPage.hotelManagement.click();
        koalaDefaultPage.hotelRooms.click();
        Thread.sleep(2000);
    }
}
