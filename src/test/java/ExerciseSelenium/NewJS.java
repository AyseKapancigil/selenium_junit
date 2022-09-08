package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class NewJS extends TestBase {

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.techproeducation.com");
        Thread.sleep(3000);
        WebElement weOffer = driver.findElement(By.xpath("//*[.='WE OFFER']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", weOffer);
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//input[@type='search']"));

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView(true)", button);

    }

    @Test
    public void test1() throws InterruptedException {


        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        scrollAllDownByJS();
        Thread.sleep(2000);
        scrollAllUpByJS();


    }

    @Test
    public void test2() {
        driver.get("https://www.techproeducation.com");
        WebElement login = driver.findElement(By.linkText("LMS Login"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", login);
    }

    @Test
    public void getValueByJStest() {
        driver.get("https://www.carettahotel.com/");
        WebElement checkIn = driver.findElement(By.id("checkin_date"));
        getValueByJS("checkin_date");


    }

    @Test
    public void changeBackgroundColorJSTest() {
        driver.get("https://www.carettahotel.com/");
      WebElement button =   driver.findElement(By.xpath("//input[@type='submit']"));
      changeBackgroundColorByJS(button,"red");

     WebElement login= driver.findElement(By.linkText("Log in"));
     addBorderWithJS(login,"5px solid purple");
    }
}