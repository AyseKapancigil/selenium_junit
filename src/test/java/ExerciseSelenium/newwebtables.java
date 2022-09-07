package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class newwebtables extends TestBase {

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
    public void test() {

        driver.get(" https://the-internet.herokuapp.com/tables");

        String allTable = driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(allTable);
    }

    @Test
    public void test1() {


        driver.get(" https://the-internet.herokuapp.com/tables");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='table1']//tr"));

        for (WebElement w : allRows) {

            System.out.println(w.getText());

        }

        String lastRow = allRows.get(allRows.size() - 1).getText();
        System.out.println(lastRow);

        List<WebElement> fifthRow = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[5]"));
        for (WebElement w : fifthRow) {

            System.out.println(w.getText());
        }


    }
@Test
public void test4(){
    driver.get(" https://the-internet.herokuapp.com/tables");
    test3(2,3);

}
    public void test3(int rowNum, int colNum) {


      WebElement result =  driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+rowNum+"]//td["+colNum+"]"));

        System.out.println("Result"+result.getText());


    }

}