package com.techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class IsExistClass {
    //check if a file exist in local pc
    @Test
    public void isExist(){
        //find the path of the file
        String pathOfTheFile="/Users/mahmutkaya/Downloads/pictures/turkish-tea.jpg";
        //we will use java to check if file exist or not
        boolean isExist = Files.exists(Paths.get(pathOfTheFile));
        //Assert if the path exist
        Assert.assertTrue(isExist, "file doesn't exist in local pc");

    }
}
