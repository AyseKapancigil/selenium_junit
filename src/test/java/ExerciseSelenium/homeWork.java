package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class homeWork  extends TestBase {
// Go to http://the-internet.herokuapp.com/add_remove_elements/
// Click on the "Add Element" button 100 times
// Write a function that takes a number, and clicks the "Delete" button given number of times
// Then validates that given number of buttons were deleted


    @Test
    public void test() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

      int counterAdd=0;
        WebElement addButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 0; i < 100; i++) {
            addButton.click();
          counterAdd++;

        }
        System.out.println(counterAdd);

        List<WebElement> deleteButton= driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));






        Actions actions = new Actions(driver);
      int counterDelete=0;
      for(int k=0;k<counterAdd;k++){

       actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
          // deleteButton.get(i).click();

          counterDelete++;
       }
      System.out.println(counterDelete);

  Assert.assertTrue("counter doesn't equal to each other",counterAdd==counterDelete);

    }
}