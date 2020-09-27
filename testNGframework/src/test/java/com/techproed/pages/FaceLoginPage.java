package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceLoginPage {
    WebDriver driver;
    //Create the constructor to initialize the driver
    public FaceLoginPage(WebDriver driver){
        this.driver=driver;
        //initElements initializes the driver in page object model
        PageFactory.initElements(driver,this);
        //We use initElements to initialize the driver in the constructor
    }
    @FindBy(id="email")
    public WebElement username;
    @FindBy(id="pass")
    public WebElement password;
    @FindBy(xpath="//button[@id='u_0_b']")
    public WebElement login;
    //create teh errorMessage element
    //Call it in the assertion in test class
    //REFACTOR
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement errorMessage;
}
