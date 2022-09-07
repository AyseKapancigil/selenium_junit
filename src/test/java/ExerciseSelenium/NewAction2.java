package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NewAction2 extends TestBase {

 /*  Create a class: Actions2
    Create test method : hoverOver() and test the following scenario:
    Given user is on the https://www.amazon.com/
    When use click on “Account” link
    Then verify the page title contains “Your Account”

   */

    @Test
    public void test(){
        driver.get("https://www.amazon.com");

      WebElement signIn= driver.findElement(By.xpath(" //span[@id='nav-link-accountList-nav-line-1']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(signIn).perform();

      driver.findElement(By.linkText("Account")).click();

    String title =  driver.getTitle();
     Assert.assertEquals("Your Account",title);





    }

}
