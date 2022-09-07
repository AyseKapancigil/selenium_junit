package practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;

public class Q05 extends TestBase {
    //Go to "http://webdriveruniversity.com/Popup-Alerts/index.html"
    //Click on Ajax Loader
    //Then click on "Click Me!" button.
    //Take screenshot after each step.

    @Test
    public void test() throws IOException {
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        takeScreenShot();
  driver.findElement(By.id("button3")).click();
  takeScreenShot();

  driver.findElement(By.id("button1")).click();
  takeScreenShot();
    }
}
