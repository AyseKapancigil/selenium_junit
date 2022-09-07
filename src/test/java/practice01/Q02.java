package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02 {
    //  ...Exercise2...
    // Create a new class under Q02
    // Set Path
    // Create chrome driver
    // Maximize the window
    // Open google home page https://www.google.com/.
    // Wait for 3 seconds
    // Go to the "https://www.amazon.com"
    // Get the title and URL of the page
    // Check if the title contains the word "Smile" print console "Title contains Smile" or "Title does not contain Smile"
    // Check if the URL contains the word "auto" print console "URL contains auto" or "URL does not contain auto"
    // Then go to "https://techproeducation.com/"
    // Get the title and check if it contains the word "site" and print "Title contains site" or "Title does not contain site"
    // Back to the previous webpage, https://www.amazon.com"
    // Refresh the page
    // Navigate to techproeducation.com
    // Wait for 3 seconds
    // Close the browser
    WebDriver driver;
    @Before
   public void setUp(){
      WebDriverManager.chromedriver().setup();
      driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();

    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.get("https://www.amazon.com");

      String amazonTitle =  driver.getTitle();
        System.out.println(amazonTitle);// Amazon.com. Spend less. Smile more.

       String amazonUrl=  driver.getCurrentUrl();
        System.out.println(amazonUrl);// https://www.amazon.com/

      if(amazonTitle.contains("Smile")){
          System.out.println("It contains");

      }else{
          System.out.println("It doesn't contain");
      }

      if(amazonUrl.contains("auto")){
          System.out.println("URL contains");

      }else{
          System.out.println("URL does not contain");
      }
    driver.get("https://techproeducation.com/");
     String techProTitle = driver.getTitle();
        System.out.println(techProTitle);

        if(techProTitle.contains("site")){
            System.out.println("It contains");

        }else{
            System.out.println("It does not contain site");

        }
     driver.navigate().back();
     driver.navigate().refresh();
     driver.navigate().forward();


    }
    @After
    public void tearDown() throws InterruptedException {
        driver.quit();
        Thread.sleep(3000);

    }
}
