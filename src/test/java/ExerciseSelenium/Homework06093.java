package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework06093  extends TestBase {

    /*
Create a class:Synchronization4. Create a method: isEnabled
Go to https://the-internet.herokuapp.com/dynamic_controls
Click enable Button
And verify the message is equal to “It's enabled!”
And verify the textbox is enabled (I can type in the box)
And click on Disable button
And verify the message is equal to “It's disabled!”
And verify the textbox is disabled (I cannot type in the box)
NOTE: .isEnabled(); is used to check if an element is enabled or not
 */

   @Test
    public void isEnabled(){
       driver.get("https://the-internet.herokuapp.com/dynamic_controls");

       driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();
       //p[@id='message']

       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    Boolean isTrue=  wait.until(ExpectedConditions.textToBe(By.xpath("//p[@id='message']"),"It's enabled!"));

       Assert.assertTrue(isTrue);

  WebElement box= driver.findElement(By.xpath("//form[@id='input-example']//input"));
 Boolean isTrue1= box.isEnabled();
 Assert.assertTrue(isTrue1);


 driver.findElement(By.xpath("//form[@id='input-example']//button")).click();
 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
 wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));

WebElement displayedButton = driver.findElement(By.xpath("//p[@id='message']"));
Assert.assertTrue(displayedButton.isDisplayed());

WebElement textBox =driver.findElement(By.xpath("//form[@id='input-example']//input"));
Assert.assertFalse(textBox.isEnabled());



   }
}
