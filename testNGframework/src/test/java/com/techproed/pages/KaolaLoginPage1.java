package com.techproed.pages;

import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaolaLoginPage1 {

    public KaolaLoginPage1(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "UserName")
    public WebElement kaolaUsername;

    @FindBy(id = "Password")
    public WebElement kaolaPass;

    @FindBy(id = "btnSubmit")
    public WebElement kaolaLoginButton;

    public void login(){
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
        KaolaMainPage1 kaolaMainPage1=new KaolaMainPage1();
        kaolaMainPage1.kaolaMainLoginButton.click();
        KaolaLoginPage1 kaolaLoginPage1=new KaolaLoginPage1();
        kaolaLoginPage1.kaolaUsername.sendKeys(ConfigReader.getProperty("username"));
        kaolaLoginPage1.kaolaPass.sendKeys(ConfigReader.getProperty("password"));
        kaolaLoginPage1.kaolaLoginButton.click();
    }

}
