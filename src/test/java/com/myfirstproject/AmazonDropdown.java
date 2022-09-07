package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class AmazonDropdown  extends TestBase {

    @Test
    public void dropdownTest() throws InterruptedException {
        driver.get("https://www.amazon.co.uk");
        driver.findElement(By.xpath("//input[@name='accept']")).click();
      WebElement allButton=  driver.findElement(By.id("searchDropdownBox"));
     driver.findElement(By.id("searchDropdownBox")).click();
     Select selectedOption = new Select(allButton);
     String text= selectedOption.getFirstSelectedOption().getText();
     Assert.assertEquals("All Departments",text);



     selectedOption.selectByValue("search-alias=amazon-devices");
 String actualText= selectedOption.getFirstSelectedOption().getText();
        System.out.println(actualText);
        Assert.assertTrue(actualText.toLowerCase().contains("amazon devices"));

boolean flag=false;
       List<WebElement> allOptions =selectedOption.getOptions();
       for(WebElement w :allOptions){
           System.out.println(w.getText());

           if(w.getText().equals("Appliances")){
               flag = true;

           }

       }

       Assert.assertFalse("it does not contain",flag);
        System.out.println(flag);

 int numOfOptions=  allOptions.size();
        System.out.println(numOfOptions);

        LinkedList<String> actual = new LinkedList<>();
      for (WebElement w:allOptions){
            actual.add(w.getText());

        }
        System.out.println("actual list "+actual);

        LinkedList<String> newlist = new LinkedList<>(actual);
        newlist.sort(Comparator.naturalOrder());
        System.out.println(newlist);

        Assert.assertEquals(actual,newlist);

    }
}
