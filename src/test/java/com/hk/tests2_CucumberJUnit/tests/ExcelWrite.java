package com.hk.tests2_CucumberJUnit.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {

    @Test
    public void read_from_excel_file() throws IOException {

        String path ="SampleData.xlsx";

        File file = new File(path);

        //to read from excel we need to load it to FileInput Stream
        FileInputStream fileInputStream = new FileInputStream(file);

        //workbook>sheet>row>cell

        //<1> Create a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //<2> We need to get specific sheet from currently opened workbook
        XSSFSheet sheet = workbook.getSheet("Employees");


        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");


        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(200000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(110000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(135000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(125000);



        // TODO: Change Mary's lastname to Jones
        for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {

            if (sheet.getRow(rowNum).getCell(0).toString().equals("Mary")){

                sheet.getRow(rowNum).getCell(1).setCellValue("Jones");

            }

        }



        //
        //open to write to the file  : FileInputStream --> reading
        // save changes              : FileInputStream --> writing
        FileOutputStream outputStream = new FileOutputStream(path);

        //save/write changes to the workbook
        workbook.write(outputStream);


        //close all
        outputStream.close();
        workbook.close();
        fileInputStream.close();




    }


}
