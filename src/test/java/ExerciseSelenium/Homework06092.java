package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework06092 extends TestBase {

/*    Create a class:Synchronization3. Create a method: synchronization1
    Go to https://the-internet.herokuapp.com/dynamic_controls
    Click on remove button
    And verify the message is equal to “It's gone!”
    Then click on Add button
    And verify the message is equal to “It's back!”

 */

    @Test
    public void test() {
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        driver.findElement(By.xpath("//form[@id='checkbox-example']//button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement text = driver.findElement(By.id("message"));
        wait.until(ExpectedConditions.visibilityOf(text));

        Assert.assertEquals("It's gone!", text.getText());

        driver.findElement(By.xpath("//form[@id='checkbox-example']//button")).click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement button = driver.findElement(By.xpath("//form[@id='checkbox-example']//p"));
        wait1.until(ExpectedConditions.visibilityOf(button));

       Assert.assertEquals("It's back!",button.getText());
    }
}