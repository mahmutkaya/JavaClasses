package com.techproed.tests;

import com.techproed.pages.KoalaLoginPage;
import com.techproed.pages.KoalaMainPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class FirstDriverTest {

    @Test
    public void firstDriverTest(){
//    When user goes to the application http://www.kaolapalace-qa-environment2.com/
//    And click on the Login button
//    Then verify user is able to log in
        //driver   ==== >>>>>>>  Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
        KoalaMainPage kaolaMainPage=new KoalaMainPage(Driver.getDriver());
        kaolaMainPage.mainLoginBtn.click();
        KoalaLoginPage koalaLoginPage=new KoalaLoginPage(Driver.getDriver());
        koalaLoginPage.koalaUserName.sendKeys(ConfigReader.getProperty("username"));
        koalaLoginPage.koalaPassword.sendKeys(ConfigReader.getProperty("password"));
        koalaLoginPage.koalaSubmitBtn.click();
        //Closing the driver
        Driver.closeDriver();
    }

}
