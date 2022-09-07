package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Day08_Actions3 extends TestBase {
   /* Create a class: ActionClass3
    Create test method : scrollUpDown()
    Go to techproeducation
    Scroll the page down
    Scroll the page up

    */

    @Test
    public void pageUpDownTest() throws InterruptedException {

     driver.get("https://www.amazon.com");

     Actions actions = new Actions(driver);

     actions.sendKeys(Keys.PAGE_DOWN).perform();
     actions.sendKeys(Keys.PAGE_DOWN).perform();
     actions.sendKeys(Keys.PAGE_DOWN).perform();

     actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys().build().perform();

     Thread.sleep(2000);
  actions.sendKeys(Keys.ARROW_DOWN).perform();

  actions.sendKeys(Keys.PAGE_UP).perform();
  actions.sendKeys(Keys.ARROW_UP).perform();


    }
}
