package com.myfirstproject.practice02;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 extends TestBase {
    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
// click on the "Animals and Nature" emoji
// click all the "Animals and Nature"  emoji elements
// fill the form
// press the apply button

    @Test
    public void test(){
     driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
     //switch iframe
      WebElement iframe= driver.findElement(By.xpath("//iframe[@id='emoojis']"));
      driver.switchTo().frame(iframe);

     driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

   List<WebElement> allEmojis= driver.findElements(By.xpath("//*[@id=\"nature\"]/div/img"));

//   for(WebElement w :allEmojis){
//       w.click();
//
//   }
///Lambda
        allEmojis.stream().forEach(t->t.click());
        driver.switchTo().defaultContent();

        List<WebElement> inputs=driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));

        List<String> words = new ArrayList<>(Arrays.asList("This","iframe","example","looks","very","funny","does","not","it","?","!"));

        for(int i = 0;i< inputs.size();i++){
            inputs.get(i).sendKeys(words.get(i));

        }
      driver.findElement(By.id("send")).click();
    WebElement code=     driver.findElement(By.id("code"));

        Assert.assertTrue(code.isDisplayed());





    }
}
