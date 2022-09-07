package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

    WebElement firstnameBox =  driver.findElement(By.name("firstname"));
    firstnameBox.sendKeys("John");

   WebElement lastnameBox = driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input"));
   lastnameBox.sendKeys("Doe");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();


  driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"exp-2\"]")).click();

driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("18.08.2022");

driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();

driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();

driver.findElement(By.xpath("//*[@id=\"continents\"]")).sendKeys("Ant");

driver.findElement(By.xpath("//*[@id=\"selenium_commands\"]/option[1]")).click();

driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();


    }
    @After
    public void tearDown(){
        driver.quit();
    }
}