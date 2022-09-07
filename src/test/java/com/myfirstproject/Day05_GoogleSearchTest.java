package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Day05_GoogleSearchTest  extends TestBase {


    @Test
    public void searchTest(){
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        driver.findElement(By.name("q")).sendKeys("porcelain teapot"+ Keys.ENTER);

     String result =   driver.findElement(By.id("result-stats")).getText();
     System.out.println(result);



    }
}
