package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewScreenshot extends TestBase {

    @Test
    public void test() throws IOException {

      driver.get("https://www.amazon.com");

     screenShot();

    }


    public void screenShot() throws IOException {

        File img =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

        //File img1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE)


 String currentTime =new SimpleDateFormat("ddmmyyyyhhmmss").format(new Date());

// String currentTime1 = new  SimpleDateFormat("ddMMyyyhhmmss").format(new Date());

     String path = System.getProperty("user.dir")+"/test-output/Screenshots2/"+currentTime+"img.png";
    // String path1=System.

    // System.out.println(path);

  //  FileUtils.copyFile(img,new File(path));




    }
}