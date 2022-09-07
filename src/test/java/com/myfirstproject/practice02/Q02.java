package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Q02 extends TestBase {
    // 1. Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    // 2. Click "CLICK ME" of JavaScript Alert
    // 3. Get the pop-up text
    // 4. Verify that message is "I am an alert box!"
    // 5. Accept pop-up

    @Test
    public void test(){
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        driver.findElement(By.xpath("//p")).click();

     String alertMessage =    driver.switchTo().alert().getText();
        Assert.assertEquals("I am an alert box!",alertMessage);

        driver.switchTo().alert().accept();
    }
}
