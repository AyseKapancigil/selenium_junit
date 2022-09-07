package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Day09_WebTables extends TestBase {
  /*  https://the-internet.herokuapp.com/tables
    Create a class: Day10_WebTables
    Task 1 : Print the entire table
    Task 2 : Print All Rows
    Task 3 : Print Last row data only
    Task 4 : Print column 5 data in the table body
    Task 5 : Write a method that accepts 2 parameters
    Parameter 1 = row number
    Parameter 2 = column number
    printData(2,3);  => prints data in 2nd row 3rd column

   */

@Test
    public void printTable(){
    driver.get(" https://the-internet.herokuapp.com/tables");


    System.out.println( driver.findElement(By.xpath("//table[@id='table1']")).getText());

}

@Test
    public void printAllRows(){
    driver.get("https://the-internet.herokuapp.com/tables");


  List<WebElement> allRows= driver.findElements(By.xpath("//table[@id='table1']//tr"));
  for(WebElement w: allRows){
      System.out.println(w.getText());


  }
    System.out.println( allRows.get(3).getText());

 // allRows.get(allRows.size()).
}

@Test
    public void printColumns(){
    driver.get("https://the-internet.herokuapp.com/tables");

  List<WebElement>allEmail = driver.findElements(By.xpath("//table[@id='table1']//tbody//td[5]"));

  for (WebElement w :allEmail){
      System.out.println( w.getText());

  }

    }
@Test
public void printDataTest(){
    printData(2,3);
    printData(4,5);
}


    public void printData(int rowNum,int colNum){
        driver.get("https://the-internet.herokuapp.com/tables");

        String xPath = "//table[@id='table1']//tbody//tr["+rowNum+"]//td["+colNum+"]";

      WebElement targetElement =  driver.findElement(By.xpath(xPath));
        System.out.println(targetElement.getText());
    }

}
