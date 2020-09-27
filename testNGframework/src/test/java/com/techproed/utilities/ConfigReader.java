package com.techproed.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    // this class will read the data from configuration.properties file!!

    //create a properties instance.
    private static Properties properties;

    static {
        //path of the configuration.properties file
        String path = "configuration.properties";
        try {
            //opening the configuration.properties file.
            FileInputStream file = new FileInputStream(path);
            //load and read the file
            properties = new Properties();
            properties.load(file);
            //close the file
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Create a method to READ
    //This method weill get the KEY and return the VALUE
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
    //TESTING IF OUR LOGIC WORKS
//    public static void main(String[] args) {
//        System.out.println(properties.getProperty("url"));
//    }


}
