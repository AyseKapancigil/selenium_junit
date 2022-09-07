package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends TestBase {
     /* Class Name: FileUploadTest
    Method Name: fileUploadTest
    When user goes to https://the-internet.herokuapp.com/upload
    When user selects an image from the desktop
    And click on the upload button
    Then verify the File Uploaded!  Message displayed

    */

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/upload");
        String homeDirectory= System.getProperty("user.home");
        String path= homeDirectory+"\\Downloads\\nature (1).jpg";

       WebElement chooseFile =driver.findElement(By.id("file-upload"));
       chooseFile.sendKeys(path);
        driver.findElement(By.id("file-submit")).click();

        String actual =driver.findElement(By.xpath("//h3")).getText();


        Assert.assertEquals("File Uploaded!",actual);


    }
}
