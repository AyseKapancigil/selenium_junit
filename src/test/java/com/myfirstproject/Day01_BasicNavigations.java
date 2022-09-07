package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_BasicNavigations {
/*
    Steps:
    Create a new class under : BasicNavigations
    Create main method
    Set Path
    Create chrome driver
    Maximize the window
    Open google home page https://www.walmart.com/.
    On the same class, Navigate to amazon home page https://www.amazon.com/
    Navigate back to google
    Navigate forward to amazon
    Refresh the page
    Close/Quit the browser


 */

    public static void main(String[] args) throws InterruptedException {

 // set driver and path

 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe") ;

 //create webdriver object
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// use to maximize window
   //start your case
        driver.get("https://www.youtube.com/"); // go to url/ website
        Thread.sleep(3000);//wait for 3 sec at this point

      driver.navigate().to("https://www.amazon.com/");
       Thread.sleep(3000);

       driver.navigate().back();
        Thread.sleep(3000);
       driver.navigate().forward();
        Thread.sleep(3000);

    driver.navigate().refresh();

        driver.quit();


    }
}
