package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_GetPageSource {


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
      String pageSource =  driver.getPageSource();
       // System.out.println(pageSource);


        if(pageSource.contains("Registry")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("page source");
            System.out.println();
        }

        driver.quit();
    }
}
