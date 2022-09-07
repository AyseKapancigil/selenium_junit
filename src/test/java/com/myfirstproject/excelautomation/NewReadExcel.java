package com.myfirstproject.excelautomation;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.EvaluationWorkbook;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NewReadExcel {

@Test
        public void readExcel() throws IOException {


  String path =  "src/test/java/resources/Foods.xlsx";

  FileInputStream fileInputStream = new FileInputStream(path);


  Workbook workbook = WorkbookFactory.create(fileInputStream);

 Sheet sheet = workbook.getSheetAt(0);
//
//  Row row1 = sheet.getRow(0);
//
//  Cell cell = row1.getCell(0);

 String r4c2= sheet.getRow(3).getCell(1).toString();
  System.out.println(r4c2);

String r6c1=  sheet.getRow(5).getCell(0).toString();
    System.out.println(r6c1);


   int lastRow = sheet.getLastRowNum()+1 ;
    System.out.println(lastRow);

   int physical= sheet.getPhysicalNumberOfRows();
    System.out.println(physical);


    Map<String,String> map1 = new HashMap<>();

    for(int rowNum = 1;rowNum<lastRow ;rowNum++){

        String fruits = sheet.getRow(rowNum).getCell(0).toString();
        System.out.println(fruits);

        String vegtables= sheet.getRow(rowNum).getCell(1).toString();
        System.out.println(vegtables);

        map1.put(fruits,vegtables);







    }
    System.out.println(map1);
  }
}
