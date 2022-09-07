package practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewQ2 {
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
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @After
    public void tearDown(){
        driver.quit();
        System.out.println("ALL OK");


    }
    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.google.com/");
        Thread.sleep(3);
        driver.get( "https://www.amazon.com");

       String amazonTitle = driver.getTitle();
        System.out.println(amazonTitle);
       String amazonUrl =  driver.getCurrentUrl();
        System.out.println(amazonUrl);

        if(amazonTitle.contains("Smile")){
            System.out.println("contains");

        }else{
            System.out.println("Does not contain");
        }
        if(amazonUrl.contains("auto")){
            System.out.println("It contains");

        }else{
            System.out.println("It does not contain");

            driver.get("https://techproeducation.com/");
           String techproTitle = driver.getTitle();
            System.out.println(techproTitle);
       if(techproTitle.contains("site")){
           System.out.println("Title contains");

       }else{
           System.out.println("Title does not contain");

       }
       driver.navigate().back();
       driver.navigate().refresh();
       driver.navigate().forward();
       Thread.sleep(3);
        }



    }
}