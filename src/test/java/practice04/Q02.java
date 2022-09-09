package practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Q02 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons

    @Test
    public void test(){
        driver.get(" https://testpages.herokuapp.com/styled/events/javascript-events.html");

        driver.findElement(By.id("onblur")).click();
        driver.findElement(By.id("onclick")).click();
        driver.findElement(By.id("onclick")).click();
      WebElement contextMenu= driver.findElement(By.id("oncontextmenu"));

      Actions actions = new Actions(driver);
      actions.contextClick(contextMenu).perform();

      WebElement doubleClick=driver.findElement(By.id("ondoubleclick"));
      actions.doubleClick(doubleClick).perform();

      driver.findElement(By.id("onfocus")).click();

      WebElement keyDown = driver.findElement(By.id("onkeydown"));
      actions.click(keyDown).sendKeys(Keys.ENTER).perform();

      WebElement keyUp=driver.findElement(By.id("onkeyup"));
      actions.click(keyUp).sendKeys(Keys.ENTER).perform();

      WebElement keyPress=driver.findElement(By.id("onkeypress"));
      actions.click(keyPress).sendKeys(Keys.ENTER).perform();

     WebElement mouseOver= driver.findElement(By.id("onmouseover"));
     actions.moveToElement(mouseOver).perform();

     WebElement mouseLeave=driver.findElement(By.id("onmouseleave"));
     actions.moveToElement(mouseLeave).moveToElement(mouseOver).perform();

     WebElement mouseDown=driver.findElement(By.id("onmousedown"));
     mouseDown.click();

    List<WebElement> allClickButtons=driver.findElements(By.xpath("//p[.='Event Triggered']"));
        Assert.assertEquals(11,allClickButtons.size());

    }
}
