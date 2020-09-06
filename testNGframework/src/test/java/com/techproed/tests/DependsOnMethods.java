package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
    @Test
    public void logIn(){
        System.out.println("log in Test");
    }
    @Test
    public void homePage(){
        System.out.println("Home Page Test");
        Assert.assertTrue(false);
    }
    //I want searchTest to be dependent on homePage. I want seachTest skipped if homePage fails
    @Test(dependsOnMethods = "homePage")
    public void searchTest(){
        System.out.println("Search Test");
    }
    @Test
    public void results(){
        System.out.println("results");
    }

}
