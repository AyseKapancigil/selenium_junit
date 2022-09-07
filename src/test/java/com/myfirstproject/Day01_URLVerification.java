package com.myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_URLVerification {
    	/* 1.Create a new class: VerifyURLTest
	2.Navigate to TechProEducation homepage
	3.Verify if google homepage url is “https://techproeducation.com/”

    	 */


    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");

       String actualURL= driver.getCurrentUrl();
       String expectedURL = "https://techproeducation.com/";


        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");


        }else{

            System.out.println("FAIL");
            System.out.println(actualURL);
            System.out.println(expectedURL);

        }
        driver.quit();

    }
}



