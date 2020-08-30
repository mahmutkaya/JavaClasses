package com.techproed;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {
    public static void main(String[] args) {
        //step 1: Create webDriverManager
        WebDriverManager.chromedriver().setup();

        //step 2: create chromeDriver
        WebDriver driver = new ChromeDriver();

        //step 3: go to a web page
        driver.get("https://www.google.com");

        //search for a random name and see haw many results are there
        //get fake data with javaFaker
        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@name='q']"))
                .sendKeys(faker.name().fullName(), Keys.ENTER);
        String res = driver.findElement(By.xpath("(//div[@id='result-stats']/descendant::text()[1])"))
                .getText().replaceAll("\\D+","");
        System.out.println("result: "+res);



//        driver.quit();
    }

}
