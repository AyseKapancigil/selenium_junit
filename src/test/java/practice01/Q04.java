package practice01;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
    // ...Exercise4...
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Verify the result
    // Print the result
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void test(){
        driver.get(" https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//*[@id=\"calculatetest\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"number1\"]")).sendKeys("15");
       driver.findElement(By.id("number2")).sendKeys("10");
       driver.findElement(By.xpath("//*[@id=\"calculate\"]")).click();

     String result= driver.findElement(By.xpath("//*[@id=\"answer\"]")).getText();

        Assert.assertEquals("25",result);

        System.out.println(result);
    }



}