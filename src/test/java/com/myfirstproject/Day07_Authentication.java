package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day07_Authentication extends TestBase {

    @Test
    public void basicAuthTest(){
       /* https://username:password@URL

        username : admin
        password : admin
        url   : the-internet.herokuapp.com/basic_auth

        */
driver.get("www.the-internet.herokuapp.com/basic_auth");
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

//      String message=  driver.findElement(By.xpath("//p")).getText();
//     WebElement message1=  driver.findElement(By.xpath("//p"));
//     Assert.assertTrue(message1.isDisplayed());

       // Assert.assertTrue(message.contains("Congratulations!"));


    }

}
