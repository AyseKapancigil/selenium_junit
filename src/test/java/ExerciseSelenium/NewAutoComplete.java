package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NewAutoComplete extends TestBase {
    @Test
    public void autoCompleteTest() {
        driver.get("https://jqueryui.com/autocomplete/");
        driver.switchTo().frame(0);
        WebElement inputBox = driver.findElement(By.id("tags"));
        inputBox.sendKeys("Apple");

     //  driver.findElement(By.xpath("//li[@class='ui-menu-item']//div")).click();
  WebElement apple =  driver.findElement(By.xpath("//li[@class='ui-menu-item']//div"));

  clickByJS(apple);
    }

    @Test
    public void test(){
        driver.get("https://jqueryui.com/autocomplete/");
        driver.switchTo().frame(0);
        WebElement inputBox = driver.findElement(By.id("tags"));
        inputBox.sendKeys("A");

      List<WebElement> allOptions =  driver.findElements(By.className("ui-menu-item"));

      for(WebElement w:allOptions){


          System.out.println(w.getText());
      if(w.getText().equals("Java")){
          w.click();
          break;

      }


    }
}
    }