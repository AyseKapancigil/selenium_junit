package practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q04 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/key-click-display-test.html
    //Click on "click me" given number of times.
    //Press space button same given number of times
    //Add all the 2 digit numbers in down buttons(down 32==> add all 32s)
    //Subtract the length of all click texts

    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/key-click-display-test.html");
       WebElement clickMe= driver.findElement(By.xpath("//input[@id='button']"));

        int number = 5;
        for(int i = 0;i<number;i++){
            clickMe.click();

        }
        Actions actions = new Actions(driver);
        for(int i = 0;i<number;i++){
            actions.sendKeys(Keys.SPACE).perform();


        }
     List<WebElement> clickList=  driver.findElements(By.xpath("//p[.='click']"));
        int sumOfLenght = 0;
        for(WebElement w: clickList){
          sumOfLenght+=  w.getText().length();


        }
        System.out.println(sumOfLenght);

      List<WebElement> keyList=  driver.findElements(By.xpath("//*[@id='events']//p"));
  int sumOfNum=0;
     for(WebElement w:keyList){
       //  System.out.println(w.getText());
      String str=  w.getText().replaceAll("[^0-9]","");
  if(!str.equals("")){
      sumOfNum+=   Integer.valueOf(str);

  }


     }
        System.out.println(sumOfNum);

        System.out.println(sumOfNum/2-sumOfLenght);

    }
}
