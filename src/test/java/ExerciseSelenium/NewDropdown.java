package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class NewDropdown extends TestBase {

    @Test
    public void dropDown() {
        driver.get(" https://the-internet.herokuapp.com/dropdown");
        WebElement index = driver.findElement(By.cssSelector("*[id='dropdown']"));
        Select select = new Select(index);
        select.selectByIndex(1);


        WebElement index2 = driver.findElement(By.cssSelector("*[id='dropdown']"));
        Select select2 = new Select(index2);
        select.selectByValue("2");
    }



        // WebElement index3 = driver.findElement(By.cssSelector("*[id='dropdown']"));



    @Test
    public void visibleText() {


        driver.get(" https://the-internet.herokuapp.com/dropdown");
        WebElement index = driver.findElement(By.cssSelector("*[id='dropdown']"));
        Select select = new Select(index);
        select.selectByVisibleText("Option 1");

    }

    @Test
    public void printAll(){
        driver.get(" https://the-internet.herokuapp.com/dropdown");
        WebElement index = driver.findElement(By.cssSelector("*[id='dropdown']"));
        Select select = new Select(index);

       List<WebElement>allOptions =  select.getOptions();

       for(WebElement w :allOptions){
        String eachElement=    w.getText();
           System.out.println(eachElement);


       }
       boolean flag = false;
     for(WebElement w : allOptions){
         w.getText().equals("Option 2");
         flag=true;


     }
        System.out.println(flag);

   String firstSelected = select.getFirstSelectedOption().getText();
        System.out.println(firstSelected);


        List<WebElement>allOptions1 =  select.getOptions();
         int size = allOptions1.size();

        Assert.assertEquals("Not Equal",3,size);
    }

}