package ExerciseSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ayse8\\IdeaProjects\\myseleniumproject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:www.google.com");
        driver.manage().window().fullscreen();

        Thread.sleep(4000);


        driver.navigate().to("https:www.amazon.com");

        driver.quit();
    }


}
