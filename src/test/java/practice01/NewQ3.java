package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewQ3 {
    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @After
    public void tearDown(){
       driver.quit();
    }
    @Test
    public void test() throws InterruptedException {
        driver.get( "https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Ayse");
   //driver.findElement(By.name("firstname"));

        driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("Kapancigil");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();
   Thread.sleep(4000);
      //  driver.findElement(By.xpath("//*[@id=\"ez-accept-all\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"sex-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"exp-2\"]")).click();
        driver.findElement(By.id("datepicker")).sendKeys("19.08.2022");

        driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"continents\"]")).sendKeys("Ant");
       // driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
    }
}
