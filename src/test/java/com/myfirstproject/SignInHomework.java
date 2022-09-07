package com.myfirstproject;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignInHomework extends TestBase {
    Faker faker = new Faker();


        @Test
        public void signIn() {
            driver.get("http://automationpractice.com/index.php");

            driver.findElement(By.xpath("//a[@class='login']")).click();

            driver.findElement(By.name("email_create")).sendKeys(faker.internet().emailAddress());

            driver.findElement(By.xpath("//button[@name='SubmitCreate']")).click();

        String heading =  driver.findElement(By.xpath("//*[(text()='Create an account')]")).getText();
        Assert.assertEquals("CREATE AN ACCOUNT",heading);

        String actualText=   driver.findElement(By.xpath("//*[(text()='Your personal information')]")).getText();
         Assert.assertEquals("YOUR PERSONAL INFORMATION",actualText);

        String actualTitle =   driver.findElement(By.xpath("//*[(text()='Title')]")).getText();
         Assert.assertEquals("Title",actualTitle);


         driver.findElement(By.xpath("//input[@id='id_gender2']")).click();

         driver.findElement(By.id("customer_firstname")).sendKeys(faker.name().firstName());
         driver.findElement(By.id("customer_lastname")).sendKeys(faker.name().lastName());
         driver.findElement(By.id("passwd")).sendKeys(faker.internet().password());

        WebElement days= driver.findElement(By.id("days"));
        Select selectedDay = new Select(days);
        selectedDay.selectByValue("5");

       WebElement months= driver.findElement(By.xpath("//select[@name='months']"));
        Select selectedMonth= new Select(months);
        selectedMonth.selectByVisibleText("August ");

       WebElement years = driver.findElement(By.xpath("//select[@id='years']"));
       Select selectedYear= new Select(years);
       selectedYear.selectByValue("1985");

       driver.findElement(By.xpath("//input[@name='newsletter']")).click();

       driver.findElement(By.xpath("//input[@id='company']")).sendKeys(faker.company().name());

       driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(faker.address().fullAddress());

       driver.findElement(By.xpath("//input[@name='city']")).sendKeys(faker.address().city());

       WebElement selectedState=  driver.findElement(By.id("id_state"));
       Select state = new Select(selectedState);
       state.selectByVisibleText("Alaska");


     driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys(faker.address().zipCode().substring(0,5));

     WebElement selectedCountry=  driver.findElement(By.xpath("//select[@name='id_country']"));

     Select select = new Select(selectedCountry);
     select.selectByIndex(1);

     driver.findElement(By.xpath("//textarea[@name='other']")).sendKeys(faker.name().fullName());
     driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys(faker.phoneNumber().cellPhone());
     driver.findElement(By.xpath("//input[@name='alias']")).sendKeys(faker.address().fullAddress().substring(0,10));
     driver.findElement(By.xpath("//button[@id='submitAccount']")).click();

     WebElement pageHeader=driver.findElement(By.xpath("//h1[@class='page-heading']"));
     Assert.assertTrue(pageHeader.isDisplayed());
        }

    }
