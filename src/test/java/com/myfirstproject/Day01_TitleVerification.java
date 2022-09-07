package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_TitleVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");


      String actualTitle =  driver.getTitle();
      String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";

      if(actualTitle.equals(expectedTitle)){
          System.out.println("PASS");


      }else{

          System.out.println("FAIL");
          System.out.println(actualTitle);
          System.out.println(expectedTitle);

      }
driver.quit();

    }
}
