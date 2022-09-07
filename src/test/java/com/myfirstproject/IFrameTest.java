package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrameTest extends TestBase {
   /* Create a class: IframeTest
● Method : iframeTest
● When a user goes to https://html.com/tags/iframe/
            ● Then click on the first video play to play the video
● Then wait for a 5 second (hard wait)
● Then stop the play
●
        ● Note:
            ● The page is too slow. Do some manual testing and understand the behavior

    */

    @Test

    public void iframeTest() throws InterruptedException {
   driver.get("https://html.com/tags/iframe/");
      int frames =  driver.findElements(By.tagName("iframe")).size();
      System.out.println(frames);

     WebElement youTube = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
     driver.switchTo().frame(youTube);

    driver.findElement(By.xpath("//button[@aria-label='Play']")).click();
    Thread.sleep(5000);

    driver.findElement(By.xpath("//button[@title='Pause (k)']")).click();



    }


}
