package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewIFrame extends TestBase {
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
    public void iFrame(){

      driver.get("https://the-internet.herokuapp.com/iframe");
     int iframeCount = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframeCount);

        driver.switchTo().frame("mce_0_ifr");

       WebElement text= driver.findElement(By.xpath("//p"));
       text.clear();

       driver.findElement(By.xpath("//p")).sendKeys("This text box is inside the iframe");
 driver.switchTo().defaultContent();
WebElement text2=  driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(text2.isDisplayed());

    }
}
