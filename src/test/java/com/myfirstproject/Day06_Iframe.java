package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day06_Iframe extends TestBase {
   /* Create a class: IFrameTest
    Create a method: iframeTest
    Go to https://the-internet.herokuapp.com/iframe
    Verify the Bolded text contains “Editor”
    Locate the text box
    Delete the text in the text box
    Type “This text box is inside the iframe”
    Verify the text Elemental Selenium text is displayed on the page

    */

    @Test
    public void iframeTest(){
        driver.get("https://the-internet.herokuapp.com/iframe");
 String pageHeader= driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
 Assert.assertTrue(pageHeader.contains("Editor"));
  driver.switchTo().frame(0);
        //driver.switchTo().frame("mce_0_ifr");//using id
       // WebElement iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        //driver.switchTo().frame(iframe);
  WebElement box =  driver.findElement(By.xpath("//p"));
  box.clear();
  box.sendKeys("This text box is inside the iframe");

  //driver is still in iframe ,we need to exit
        driver.switchTo().parentFrame();
      WebElement elementalSelenium =  driver.findElement(By.linkText("Elemental Selenium"));
      Assert.assertTrue(elementalSelenium.isDisplayed());


    }

}
