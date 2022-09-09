package practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Q03 extends TestBase {
    //Go to https://testpages.herokuapp.com/
    //Click on File Downloads
    //Click on Server Download
    //Verify that file is downloaded

    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/");
        driver.findElement(By.xpath("//a[@id='download']")).click();
        driver.findElement(By.id("server-download")).click();

      String homeDirectory=  System.getProperty("user.home");
       // System.out.println(homeDirectory);

        String filePath=homeDirectory+"/Downloads/textfile.txt";
      Boolean isDownloaded=Files.exists(Paths.get(filePath));
        Assert.assertTrue(isDownloaded);

    }
}
