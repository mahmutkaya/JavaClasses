package com.techproed.smoketest;

import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.TestBase;
import org.testng.annotations.Test;

/**
 * Inside the smoke test, create a new class: FHCLogin
 * And verify the user is able to log in using the correct credentials.
 * Note: use page object model
 */

public class KoalaLoginTest extends TestBase {
    KoalaLoginPage koalaLoginPage;
    KoalaMainPage koalaMainPage;

    @Test
    public void koalaLogin(){
        driver.get(ConfigReader.getProperty("koala_url"));

        koalaMainPage = new KoalaMainPage(driver);
        koalaMainPage.mainLoginBtn.click();

        koalaLoginPage = new KoalaLoginPage(driver);
        koalaLoginPage.koalaUserName.sendKeys(ConfigReader.getProperty("username"));
        koalaLoginPage.koalaPassword.sendKeys(ConfigReader.getProperty("password"));
        koalaLoginPage.koalaSubmitBtn.click();
    }

}
