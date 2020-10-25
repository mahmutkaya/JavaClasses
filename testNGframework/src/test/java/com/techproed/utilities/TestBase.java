package com.techproed.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    protected WebDriver driver;
    protected static ExtentReports extentReports;//This is to initialize the extent report
    protected static ExtentTest extentTest;//This one is to log if a test fails or passes. We use this to attached the screenshot
    protected static ExtentHtmlReporter extentHtmlReporter;//this is to generate html report.

    @BeforeTest(alwaysRun = true)
    public void setUpTest() {//This is how to set up Extent report. We will create and use this one in out test classes
        extentReports = new ExtentReports();//1. create object to set the location of the report
        String filePath = System.getProperty("user.dir") + "/test-output/myprojectreport.html";//create a custom report in the current project.
        //Folder name = test-output, File name = myprojectreport.html
        //String filePath = System.getProperty("user.dir") + "\\test-output\\report.html";//THIS IS FOR WINDOWS USER
        extentHtmlReporter = new ExtentHtmlReporter(filePath);//2. creating the report with the path we created
        extentReports.attachReporter(extentHtmlReporter);//3. attaching the html report to our custom report
        //WE CAN ADD CUSTOM INFO. NOT NECESSARY. JUST TO GIVE MORE INFORMATION TO THE USER OR TEAM
        //BELOW LINES ARE OPTIONAL> THEY ARE JUST TO ADD ADDITIONAL INFORMATION TO OUR HTML REPORT
        extentReports.setSystemInfo("Team Name","Jaguars");
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReports.setSystemInfo("Automation Engineer", "John");
        extentHtmlReporter.config().setDocumentTitle("Koala Reports");
        extentHtmlReporter.config().setReportName("Koala Automation Reports");

    }

    @BeforeMethod(alwaysRun = true)
    public void setupMethod() {
        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get(ConfigReader.getProperty("kaola_url"));
    }

    @AfterMethod(alwaysRun = true)//In AfterMethod, we are getting the screenshots and attaching the report when test fails
    public void tearDownMethod(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {//When test case fails, then take the screenshot and attached the report
            String screenshotLocation = ReusableMethods.getScreenshot(result.getName());//getScreenshot is coming from ReusableMethods
            extentTest.fail(result.getName());
            extentTest.addScreenCaptureFromPath(screenshotLocation);//adding the screenshot to the report
            extentTest.fail(result.getThrowable());
        } else if (result.getStatus() == ITestResult.SKIP) {
            extentTest.skip("Test Case is skipped: " + result.getName());
        }
        Driver.closeDriver();
    }


    @AfterTest(alwaysRun = true)
    public void tearDownTest() {
        //flush will close the extend reports
        extentReports.flush();
    }
}

