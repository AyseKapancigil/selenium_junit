package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewAction extends TestBase {
    /* Create a class: Actions1
    Create a test method : contextClickMethod() and test the following scenario:
    Given user is on the https://the-internet.herokuapp.com/context_menu
    When use Right clicks on the box
    Then verify the alert message is “You selected a context menu”
    Then accept the alert

     */
    @Test
    public void contextClickMethod(){
        driver.get("https://the-internet.herokuapp.com/context_menu");

     WebElement box=driver.findElement(By.xpath("//div[@id='hot-spot']"));
     Actions actions = new Actions(driver);
     actions.contextClick(box).perform();

    String actual = driver.switchTo().alert().getText();
    Assert.assertEquals("You selected a context menu",actual);

    driver.switchTo().alert().accept();

    }
}
