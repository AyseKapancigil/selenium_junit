package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewQ1 {
    // ...Exercise1...
    // Create a new class under Q1
    // Set Path
    // Create chrome driver
    // Maximize the window
    // Open google home page https://www.google.com/
    // On the same class, Navigate to amazon home page https://www.amazon.com/
    // Navigate back to google
    // Navigate forward to amazon
    // Refresh the page
    // Close/Quit the browser
    // And last step : print "ALL OK" on console

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown(){
        driver.quit();
        System.out.println("ALL OK");


    }
    @Test
    public void test(){

        driver.get(" https://www.google.com/");
        driver.navigate().to(" https://www.amazon.com/");

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



}
}