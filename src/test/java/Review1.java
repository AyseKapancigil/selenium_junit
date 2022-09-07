import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Review1 {
    public static void main(String[] args) {

       /* Create a new class : Review1
        Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        Verify if the page URL contains youtube if not, print the right url.
        Then Navigate to https://www.amazon.com/
        Navigate back to youtube
        Refresh the page
        Navigate forward to amazon
        Maximize the window
        Then verify if page title includes “Amazon”, If not, print the correct title.
        Verify if the page URL is https://www.amazon.com/, if not print the correct url
        Quit the browser

        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.youtube.com");
       String actualTitle = driver.getTitle();
       String expectedTitle = "youtube";

       if(actualTitle.equals(expectedTitle)){
           System.out.println("Pass");

       }else{
           System.out.println("Fail " + actualTitle);
       }

  String actualUrl =   driver.getCurrentUrl();

       if(actualUrl.contains("youtube")){
           System.out.println("Pass");

       }else{
           System.out.println("Fail " +actualUrl);

       driver.get("https:www.youtube.com");
           driver.navigate().to("https://www.amazon.com");
           driver.navigate().back();

           driver.navigate().refresh();
           driver.navigate().forward();

          String actualTitle1 =  driver.getTitle();
          if(actualTitle1.contains("Amazon")){
              System.out.println("Pass");

          }else{
              System.out.println("Fail");

          }

       String actualUrl1 =    driver.getCurrentUrl();
        String expectedUrl ="https://www.amazon.com/";
        if(actualUrl1.equals(expectedUrl)){
            System.out.println("Pass");


          }else{
            System.out.println("Fail " +actualUrl1);
        }

       }

    }



    }

