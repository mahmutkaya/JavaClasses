package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KoalaLoginPage {
    WebDriver driver;

    public KoalaLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "UserName")
    public WebElement koalaUserName;

    @FindBy(id = "Password")
    public WebElement koalaPassword;

    @FindBy(id = "btnSubmit")
    public WebElement koalaSubmitBtn;
}
