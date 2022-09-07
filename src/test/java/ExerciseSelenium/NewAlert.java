package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewAlert extends TestBase {
/*
Go to https://the-internet.herokuapp.com/javascript_alerts
Create a class: AlertTest
Create setUp method
Create 3 test methods:
acceptAlert() => click on the first alert,
verify the text  “rI am a JS Alert” ,
click OK ,
and Verify “You successfully clicked an alert”


dismissAlert()=> click on the second alert,
verify text "I am a JS Confirm”,
click cancel,
and Verify “You clicked: Cancel”
sendKeysAlert()=> click on the third alert,
verify text “I am a JS prompt”,
type “Hello World”,
click OK

 */



   @Test

   public void alertTest() {

       driver.get("https://the-internet.herokuapp.com/javascript_alerts");

     driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
     String verify= driver.switchTo().alert().getText();
       Assert.assertTrue(verify.contains("I am a JS Alert"));
       driver.switchTo().alert().accept();
    driver.findElement(By.xpath("//p[@id='result']")).isDisplayed();

       //*[text()='You successfully clicked an alert']


   }
   @Test
    public void dismissAlert(){
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
  driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
 String jsConfirm= driver.switchTo().alert().getText();
 Assert.assertEquals("I am a JS Confirm",jsConfirm);
 driver.switchTo().alert().dismiss();

Assert.assertTrue( driver.findElement(By.id("result")).isDisplayed());

   }
   @Test
    public void sendKeys(){
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
     Assert.assertEquals( "I am a JS prompt",driver.switchTo().alert().getText());
     driver.switchTo().alert().sendKeys("Hello World");
     driver.switchTo().alert().accept();
    String text1= driver.findElement(By.xpath("//*[text()='You entered: Hello World']")).getText();
  Assert.assertEquals("You entered: Hello World",text1);
   }

}
