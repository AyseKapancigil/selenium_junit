package practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Q01 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
    //Click on "click me" button
    //Verify that "Event Triggered"

    @Test
    public void test() throws InterruptedException {

        driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");
     WebElement clickButton= driver.findElement(By.id("growbutton"));
     Thread.sleep(4000);
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("growbutton")));
     clickButton.click();
    String text = driver.findElement(By.id("growbuttonstatus")).getText();
        Assert.assertEquals("Event Triggered",text  );




    }
}
