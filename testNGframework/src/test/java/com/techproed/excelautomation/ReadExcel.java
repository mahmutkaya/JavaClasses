package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadExcel {
    /**
     * Import the apache poi dependency in your pom file
     * Create resources directory under java folder(right click on java and create the folder)
     * Add the excel file on the resources folder
     * Create a new package: excel automation
     * Createa a new class : ReadExcel
     * Create a new test method : readExcel()
     * Store the path of the  file in a string
     * Open the file
     * Open the workbook using fileinputstream
     * Open the first worksheet
     * Go to first row
     * Go to first cell on that first row and print
     * Go to second cell on that first row and print
     * Go to 2nd row first cell
     * Go to 3rd row 2nd cell-chain the row and cell
     * Find the number of row
     * Find the number of used row
     * Print country, capitol key value pairs as map object
     */
    @Test
    public void readExcel() throws Exception {
//        Store the path of the  file in a string
        String path = "./src/test/java/resources/Capitals.xlsx";
//        Open the file
        FileInputStream fileInputStream = new FileInputStream(path);
//        Open the workbook using fileinputstream
        Workbook workbook = WorkbookFactory.create(fileInputStream);
//        Open the first worksheet
        Sheet sheet = workbook.getSheetAt(0);
//        Go to first row
        Row row = sheet.getRow(0);
//        Go to first cell on that first row and print
        Cell cell = row.getCell(0);
        System.out.println("Data in the first cell : " + cell);
//        Go to second cell on that first row and print
        Cell cell1 = row.getCell(1);
        System.out.println(cell1);
//        Go to 2nd row first cell
        Row row1 = sheet.getRow(1);
        String cell2 = row1.getCell(0).toString();
        System.out.println(cell2);
//        Go to 3rd row 2nd cell-chain the row and cell
        String cell3 = workbook.getSheetAt(0).getRow(2).getCell(1).toString();
        System.out.println(cell3);
//        Find the number of row
        int rowNum = sheet.getLastRowNum();
        System.out.println("rowNum: " + ++rowNum);
//        Find the number of used row
        int usedRowNum = sheet.getPhysicalNumberOfRows();
        System.out.println("usedRowNum: " + usedRowNum);
//        Print country, capitol key value pairs as map object
        Map<String,String> capitols = new HashMap<>();
        for(int i=1; i<rowNum; i++){
            String country = sheet.getRow(i).getCell(0).toString();
            String capitol = sheet.getRow(i).getCell(1).toString();
            capitols.put(country, capitol);
        }
        System.out.println(capitols);
        fileInputStream.close();
        workbook.close();
    }
}
