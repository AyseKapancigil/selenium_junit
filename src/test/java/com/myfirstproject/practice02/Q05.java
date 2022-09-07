package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q05  extends TestBase {
    //Signup For Facebook by using Actions class
    //Go to Facebook
    //Click on Create New Account
    //fill all the boxes by using keyboard actions
    @Test
    public void test(){
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("(//button[@value='1'])[2]")).click();

        driver.findElement(By.linkText("Create New Account")).click();

      WebElement firstname= driver.findElement(By.name("firstname"));

      Actions actions = new Actions(driver);

      actions.click(firstname).sendKeys("John").sendKeys(Keys.TAB).sendKeys("Doe").
          sendKeys(Keys.TAB).sendKeys("0987654").sendKeys(Keys.TAB).sendKeys("6765").perform();
    }
}
