package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework01 extends TestBase {

    @Test
    public void test(){
        driver.get("https://jqueryui.com/accordion/");

        driver.switchTo().frame(0);

        driver.findElement(By.id("ui-id-3")).click();

     WebElement text= driver.findElement(By.xpath("//div[@role='tabpanel']"));
        Assert.assertTrue(text.isDisplayed());
    }
}
