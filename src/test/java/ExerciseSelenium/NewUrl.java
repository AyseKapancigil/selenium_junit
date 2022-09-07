package ExerciseSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewUrl {

    public static void main(String[] args) {
        /*
    1.Create a new class: VerifyURLTest
	2.Navigate to TechProEducation homepage
	3.Verify if google homepage url is “https://techproeducation.com/”
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://techproeducation.com/");

       String actualUrl =  driver.getCurrentUrl();
        String ExpectedUrl ="https://techproeducation.com/";

       if(actualUrl.equals(ExpectedUrl)){
           System.out.println("Pass");

       }else{
           System.out.println("Fail");
       }
        driver.quit();
    }
}
