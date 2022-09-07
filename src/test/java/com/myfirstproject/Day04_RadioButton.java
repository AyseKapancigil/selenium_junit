package com.myfirstproject;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Day04_RadioButton {

    WebDriver driver;
    Faker faker = new Faker();
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void accountSignUp(){

        driver.get("https://facebook.com");
        driver.findElement(By.xpath("(//button[@data-testid='cookie-policy-manage-dialog-accept-button'])[2]")).click();

 driver.findElement(By.linkText("Create New Account")).click();
 driver.findElement(By.name("firstname")).sendKeys(faker.name().firstName());
 driver.findElement(By.name("lastname")).sendKeys(faker.name().lastName());
 driver.findElement(By.name("reg_email__")).sendKeys(faker.phoneNumber().phoneNumber());
driver.findElement(By.name("reg_passwd__")).sendKeys(faker.internet().password());

   WebElement month =driver.findElement(By.id("month"));
   Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("Jan");

     WebElement day=   driver.findElement(By.name("birthday_day"));
     Select selectDay = new Select(day);
        selectDay.selectByValue("10");


       WebElement year =  driver.findElement(By.id("year"));
       Select selectYear = new Select(year);
       selectYear.selectByVisibleText("2000");

       driver.findElement(By.xpath("//input[@value='1']")).click();
      driver.findElement(By.name("websubmit")).click();




    }
}


