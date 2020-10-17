package com.techproed.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    /**
     * Create a new class: WriteExcel
     * Create a new method: writeExcel()
     * Store the path of the file as string and open the file
     * Open the workbook
     * Open the first worksheet
     * Go to the first row
     * Create a cell on the 3rd index on the first row
     * Write “POPULATION” on that cell
     * Create a cell on the 2nd row 4th cell(index3), and write 150000
     * Create a cell on the 3rd row 4th cell(index3), and write 250000
     * Create a cell on the 4th row 4th cell(index3), and write 54000
     * Write and save the workbook
     * Close the file
     * @throws IOException
     */

    @Test
    public void writeExcel() throws IOException {
        //        Store the path of the file as string and open the file
        String path = "./src/test/java/resources/Capitals.xlsx";
//        Open the file/workbook
        FileInputStream fileInputStream = new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fileInputStream);
//        Open the first worksheet
        Sheet sheet=workbook.getSheetAt(0);
//        Go to the first row
        Row row = sheet.getRow(0);
//        Create a cell on the 3rd index on the first row
        Cell cell4 = row.createCell(3);
//        Write “POPULATION” on that cell
        cell4.setCellValue("POPULATION");
        System.out.println(cell4);
//        Create a cell on the 2nd row 4th cell(index3), and write 150000
        sheet.getRow(1).createCell(3).setCellValue("15000");
//        Create a cell on the 3rd row 4th cell(index3), and write 250000
        sheet.getRow(2).createCell(3).setCellValue("250000");
//        Create a cell on the 4th row 4th cell(index3), and write 54000
        sheet.getRow(3).createCell(3).setCellValue("54000");

//        Write and save the workbook
//        FileInputStream is to READ, FileOutputStream is to WRITE
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);

//        Close the file
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();
    }
}
