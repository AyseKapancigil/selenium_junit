package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Day02_LocatorsIntro {
    /*Create a class : LocatorsIntro
    Create test method locators
    user goes to http://a.testaddressbook.com/sign_in
    Locate the elements of email textbox, password textbox, and signin button
    Enter below username and password then click sign in button
    Username :  testtechproed@gmail.com
    Password : Test1234!
    Then verify that the expected user id  testtechproed@gmail.com (USE getText() method to get the text from the page)
    Verify the Addresses and Sign Out  texts are displayed
    Find the number of total link on the page
    Sign out from the page

     */
    WebDriver driver;


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//wait time
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){
        driver.quit();

    }


    @Test
    public void login() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("http://a.testaddressbook.com/sign_in");

        driver.findElement(By.id("session_email")).sendKeys(" testtechproed@gmail.com");
       driver.findElement(By.id("session_password")).sendKeys("Test1234!");
       driver.findElement(By.name("commit")).click();


        //driver.quit();
      /*  Then verify that the expected user id testtechproed@gmail.com (USE getText() method to get the text from the page)
        Verify the Addresses and Sign Out texts are displayed
        Find the number of total link on the page
        Sign out from the page

       */
  //   String actualIdText=  driver.findElement(By.className("navbar-text")).getText();
//     String expectedIdText ="testtechproed@gmail.com";
//        Assert.assertEquals(actualIdText,expectedIdText);

  WebElement addressElement = driver.findElement(By.linkText("Addresses"));
  Assert.assertTrue(addressElement.isDisplayed());

 WebElement signOutElement =   driver.findElement(By.linkText("Sign out"));
 Assert.assertTrue(signOutElement.isDisplayed());

    List<WebElement> linkList = driver.findElements(By.tagName("a"));
    int numOfLinks = linkList.size();
        System.out.println(numOfLinks);

//        Print all link names
        for (WebElement eachElement: linkList){

            System.out.println(eachElement.getText());

        }

        driver.findElement(By.xpath("//a[@data-test='sign-out']")).click();

        String currentUrl = driver.getCurrentUrl();
        //Assert.assertTrue(currentUrl.equals("http://a.testaddressbook.com/sign_in"));

        Assert.assertEquals("http://a.testaddressbook.com/sign_in",driver.getCurrentUrl());



    }
}
