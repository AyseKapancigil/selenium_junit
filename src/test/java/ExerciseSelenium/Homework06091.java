package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework06091 extends TestBase {

   /* Create a class:Synchronization2.
    Create a method: synchronization2
    Go to https://the-internet.herokuapp.com/dynamic_loading/2
    When user clicks on the Start button
    Then verify the ‘Hello World!’ Shows up on the screen

    */

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
      driver.findElement(By.xpath("//div[@id='start']//button")).click();

   WebElement text =   driver.findElement(By.xpath("(//h4)[2]"));

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(text));

        Assert.assertEquals("Hello World!",text.getText());







    }

}
