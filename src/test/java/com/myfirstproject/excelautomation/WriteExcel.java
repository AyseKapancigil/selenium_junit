package com.myfirstproject.excelautomation;

import com.myfirstproject.utilities.TestBase;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteExcel extends TestBase {

    @Test

    public void writeExcel() throws IOException {

       String path = "src/test/java/resources/Foods.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);

      Sheet sheet1 = workbook.getSheetAt(0);




      sheet1.getRow(0).createCell(2).setCellValue("Calorie");
      sheet1.getRow(0).createCell(3).setCellValue("Protein");
      sheet1.getRow(1).createCell(3).setCellValue("Carbonhydrate");
      sheet1.getRow(3).createCell(2).setCellValue(10);
      sheet1.getRow(3).createCell(3).setCellValue(10);


        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);

       fileInputStream.close();
    fileOutputStream.close();
   workbook.close();

 }

}
