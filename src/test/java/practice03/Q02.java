package practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Q02 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/drag-drop-javascript.html
    //Drag yellow elements on the red elements below them
    //Then verify they are dropped.


    @Test
    public void test() throws InterruptedException {

        driver.get(" https://testpages.herokuapp.com/styled/drag-drop-javascript.html");

        WebElement dragMe1= driver.findElement(By.id("draggable1"));
        WebElement dragMe2= driver.findElement(By.id("draggable2"));
        WebElement dropHere1= driver.findElement(By.id("droppable1"));
        WebElement dropHere2= driver.findElement(By.id("droppable2"));

       Actions actions = new Actions(driver);
      // Thread.sleep(2000);
       actions.dragAndDrop(dragMe1,dropHere1).perform();
        //Thread.sleep(2000);
       actions.dragAndDrop(dragMe2,dropHere2).perform();

        Assert.assertEquals("Dropped!",dropHere1.getText());
        Assert.assertEquals("Dropped!",dropHere2.getText());


    }
}
