package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewScreenshot2 extends TestBase {
    //go to url amazon
    //take screenshot of the page
    //take screenshot of logo

    @Test
    public void screenshot2() throws IOException {

  //      driver.get("https://www.amazon.com");
//
//     File img = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//
//     String currentTime=new SimpleDateFormat("ddMMYYYYhhmmss").format(new Date());
//
//     String path = System.getProperty("user.dir")+"/test-output/Screenshots3/"+currentTime+"img.png";
//
//        FileUtils.copyFile(img,new File(path));
//
//
  }
  @Test
    public void test() throws IOException, InterruptedException {

      driver.get("https://www.metroline.co.uk");
      driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();

    WebElement logo= driver.findElement(By.xpath("//div[@class='aveta-logo']"));
    Thread.sleep(4000);
    File img1 = logo.getScreenshotAs(OutputType.FILE);

  String currentTime= new SimpleDateFormat("ddMMYYYYhhmmss").format(new Date());

   String path = System.getProperty("user.dir")+"/ozan/ayse/"+currentTime+"img.png";

    FileUtils.copyFile(img1,new File(path));

  }


}
