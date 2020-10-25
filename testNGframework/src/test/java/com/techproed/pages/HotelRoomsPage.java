package com.techproed.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelRoomsPage {
    WebDriver driver;

    public HotelRoomsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "ADD HOTELROOM")
    public WebElement addHotelRoomButton;
    @FindBy(id = "IDHotel")
    public WebElement hotelIDropDown;
    @FindBy(id = "Code")
    public WebElement code;
    @FindBy(id = "Name")
    public WebElement name;
    @FindBy(id = "Location")
    public WebElement location;
    @FindBy(xpath = "//textarea[@dir='ltr']")
    public WebElement description;
    @FindBy(id = "Price")
    public WebElement price;
    @FindBy(id = "IDGroupRoomType")
    public WebElement roomType;
    @FindBy(id = "MaxAdultCount")
    public WebElement maxAdult;
    @FindBy(id = "MaxChildCount")
    public WebElement maxChild;
    @FindBy(id = "uniform-IsAvailable")
    public WebElement approve;
    @FindBy(id = "btnSubmit")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement successMessage;
    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement okButton;

}