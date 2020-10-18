package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTables extends TestBase {
    /**
     * Create a class: WebTables
     * Create a method: login()
     * Log in  http://www.kaolapalace-qa-environment2.com/
     * //Click on Hotel Management
     * //Click on Hotel Rooms
     *
     * Create a test method: entireTable() and Find the size of the entire table body and print all of headers
     * Create a test method: printRows() and Print all of the rows and print the element s on the 4th row
     * Create a test method: printCells() and Find the total number of cells in the table body
     *      and print all of the cells
     * Create a test method: printColumns() and print Find the total number of columns
     *      and Print the elements of the 5th column
     * Create a test method: printData(int row, int column); This method should print the given cell.
     *      Example: printData(2,3); should print 2nd row,3rd column
     */

    @BeforeMethod
    public void login() {
        driver.get("http://www.kaolapalace-qa-environment2.com/");
        WebElement mainPageLoginButton=driver.findElement(By.linkText("Log in"));
        mainPageLoginButton.click();

        driver.findElement(By.id("UserName")).sendKeys("manager2");
        driver.findElement(By.id("Password")).sendKeys("Man1ager2!");
        driver.findElement(By.id("btnSubmit")).click();

        //Click on Hotel Management
        WebElement hotelManagement=driver.findElement(By.linkText("Hotel Management"));
        hotelManagement.click();
        //Click on Hotel Rooms
        WebElement hotelRooms=driver.findElement(By.partialLinkText("Hotel Rooms"));
        hotelRooms.click();
    }

    @Test
    public void entireTable() throws InterruptedException {
        //Find the size of the entire table body
        Thread.sleep(3000);
        WebElement tBody = driver.findElement(By.xpath("//tbody"));
        System.out.println(tBody.getText());

        List<WebElement> tData = driver.findElements(By.xpath("//td"));
        System.out.println("there are "+tData.size()+" data in table");
        for(WebElement data : tData){
            System.out.println(data.getText());
        }
        //          what is diffrence for each and tBody.getText()
        //Answer: In for each, i get each data one by one and print them one by one.
        //tBody gives me one SINGLE element that has ALL OF THE DATA AS A WHOLE.

        //and print all of headers
        List<WebElement> allHeaders=driver.findElements(By.xpath("//th"));
        for (WebElement eachHeader:allHeaders){
            System.out.println(eachHeader.getText()+", ");
        }
    }
    //    Create a test method: printRows()
    @Test
    public void printRows(){
        //and Print all of the rows in the TABLE BODY
        List<WebElement> allRows=driver.findElements(By.xpath("//tbody//tr"));
        for (WebElement eachRow:allRows){
            System.out.println(eachRow.getText());
        }
        //and print the elements on the 4th row
        WebElement forthRow=driver.findElement(By.xpath("//tbody//tr[4]"));
        System.out.println("4th row: "+forthRow.getText());

    }

    @Test
    public void printCells(){
        //Find the total number of cells in the table body
        List<WebElement> allCells = driver.findElements(By.xpath("//tbody//td"));
        System.out.println(allCells.size());
        // and print all of the cells
        for(WebElement cell : allCells){
            System.out.println(cell.getText());
        }
    }

    @Test
    public void printColumns() throws InterruptedException {
        //and print Find the total number of columns
        List<WebElement> allColumns=driver.findElements(By.tagName("th"));
        System.out.println(allColumns.size());
        //and Print the elements of the 5th column
        Thread.sleep(5000);
        List<WebElement> fifthColumn=driver.findElements(By.xpath("//tr//td[5]"));
        //    //tr//td[5]  => give me 5th elements on each row
        for (WebElement eachElement:fifthColumn){
            System.out.println(eachElement.getText());
        }
    }

    // printData(3,6); => print the data in row 3 column 6
    //Create a test method: printData(int row, int column);
    // This method should print the given cell. Example: printData(2,3);
    // should print 2nd row,3rd column
    //This custom method will take a row, and a column number
    //and print the data on that row and column
    //This will not be a test method, but this will be a custom method
    public void printData(int row,int column){
//        String xPath="//tbody//tr[9]//td[5]";//NJ
//        String xPath2="//tbody//tr[2]//td[3]";//12746376
        //Only the index numbers keep changing in teh webtable xpath
        String xPath="//tbody//tr["+row+"]//td["+column+"]";
        WebElement data=driver.findElement(By.xpath(xPath));
        System.out.println(data.getText());
    }
    @Test(groups ="regression1")
    public void printDataTest(){
        login();
        printData(2,3);
        printData(5,4);
    }



    //HOMEWORK:
    /*
    Create a test method: webTableHW
    test if the 6th column includes price of 1000
    test if the first table row has Orlando
    test if there 4th column has Hotel name called Hilton
     */
    @Test
    public void webTableHW() {
        List<WebElement> column6 = driver.findElements(By.xpath("//td[6]"));
        for (WebElement column : column6) {
            if (column.getText().contains("1000"))
                System.out.println(column.getText());
        }
        List<WebElement> row1 = driver.findElements(By.xpath("//tbody//tr[1]"));
        for (WebElement w : row1) {
            if (w.getText().contains("Orlando"))
                System.out.println(w.getText());
        }
        List<WebElement> column4 = driver.findElements(By.xpath("//td[4]"));
        for (WebElement column : column4) {
            if (column.getText().contains("Hilton")) {
                System.out.println(column.getText());
            }
        }
    }

}
