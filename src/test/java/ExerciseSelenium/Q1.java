package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1  extends TestBase {
    // go to the URL https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/
// click on the "Animals and Nature" emoji
// click all the "Animals and Nature"  emoji elements
// fill the form
// press the apply button

    @Test
    public void iframe(){
       driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
  driver.switchTo().frame("emoojis");

  driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();

  List<WebElement> allEmojis=driver.findElements(By.xpath("//div[@id='nature']/div/img"));
        System.out.println(allEmojis);

        for(WebElement w :allEmojis){
            w.click();

        }
      driver.switchTo().defaultContent();

//        Actions actions = new Actions(driver);
//     WebElement text=   driver.findElement(By.xpath("//div[@class='mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded']"));
//
//     actions.click(text).perform();
//     actions.sendKeys("Ayse").sendKeys(Keys.TAB);
//     actions.sendKeys("ozan").sendKeys(Keys.TAB);
//     actions.sendKeys("sena").sendKeys(Keys.TAB);
//     actions.sendKeys("elis").sendKeys(Keys.TAB);
//     actions.sendKeys("Atiye").sendKeys(Keys.TAB);
//     actions.sendKeys("Aslan").sendKeys(Keys.TAB);
//     actions.sendKeys("yigit").sendKeys(Keys.TAB);
//     actions.sendKeys("suat").sendKeys(Keys.TAB);
//     actions.sendKeys("akif").sendKeys(Keys.TAB);
//     actions.sendKeys("hafsa").sendKeys(Keys.TAB);
//     actions.sendKeys("clara").sendKeys(Keys.TAB).perform();

 List<String> list = new ArrayList<>(Arrays.asList("ayse","atiye","aslan","Clara","cengiz","sena","elis","yigit","suat","akif","kerem"));
        System.out.println(list);
List<WebElement> textList =driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));

        for(int i=0;i< textList.size();i++){
textList.get(i).sendKeys(list.get(i));


      }

        System.out.println(textList);

driver.findElement(By.id("send")).click();

    }

}
