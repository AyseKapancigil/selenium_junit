package com.myfirstproject.excelautomation;

import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Day08_ReadExcel {

    @Test
    public void readExcel() throws IOException {

        String path = "./src/test/java/resources/capitals.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);


        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet1= workbook.getSheetAt(0);

        Row row1= sheet1.getRow(0);

        Cell cell1 = row1.getCell(0);
        System.out.println(cell1);

      String r2c1= sheet1.getRow(2).getCell(1).toString();
        System.out.println(r2c1);
        Assert.assertEquals("Ottowa",r2c1);

       int numOfRow= sheet1.getLastRowNum()+1;
        System.out.println(numOfRow);

       int physicelRowNum= sheet1.getPhysicalNumberOfRows();
        System.out.println(physicelRowNum);


        Map<String,String> capitals = new HashMap<>();

        for(int rowNum = 1;rowNum < numOfRow;rowNum++){

    String countries  = sheet1.getRow(rowNum).getCell(0).toString();
            System.out.println(countries);

    String capital = sheet1.getRow(rowNum).getCell(1).toString();
            System.out.println(capital);

      capitals.put(countries,capital);


        }
        System.out.println(capitals);
    }
}
