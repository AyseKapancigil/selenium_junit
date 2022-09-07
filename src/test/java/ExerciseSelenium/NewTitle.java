package ExerciseSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https:www.amazon.com");
      String actualData=  driver.getTitle();
        System.out.println(actualData);
     String expectedData = "Amazon.com. Spend less. Smile more.";

     if(actualData.equals(expectedData)) {
         System.out.println("Pass");

        }else{
         System.out.println("Fail");
     }


 driver.quit();


    }
}
