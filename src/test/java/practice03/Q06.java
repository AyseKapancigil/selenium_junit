package practice03;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Q06 extends TestBase {
// Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculator under Micro Apps
    // Type 9 in the first input
    // Type 3 in the second input
    // Click on Calculate
    // Get the result
    // Verify the result
    // Print the result
    // Do same process for each math operation on page.

    @Test
    public void test() {
        driver.get(" https://testpages.herokuapp.com/styled/index.html");
       driver.findElement(By.id("calculatetest")).click();

       driver.findElement(By.id("number1")).sendKeys("9");
       driver.findElement(By.id("number2")).sendKeys("3");

       driver.findElement(By.id("calculate")).click();
       String resultAdd= driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("12",resultAdd);
        System.out.println(resultAdd);

        WebElement selectElement = driver.findElement(By.id("function"));
        Select select = new Select(selectElement);
        select.selectByValue("times");
        driver.findElement(By.id("calculate")).click();
        String resultMult= driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("27",resultMult);
        System.out.println(resultMult);

        WebElement selectElement1 = driver.findElement(By.id("function"));
        Select select1 = new Select(selectElement1);
        select1.selectByValue("minus");
        driver.findElement(By.id("calculate")).click();
        String resultMin= driver.findElement(By.id("answer")).getText();
        Assert.assertEquals("6",resultMin);
        System.out.println(resultMin);






    }
}