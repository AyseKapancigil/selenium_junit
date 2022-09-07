package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day08_FileUpload extends TestBase {
   /* Class Name: FileUploadTest
    Method Name: fileUploadTest
    When user goes to https://the-internet.herokuapp.com/upload
    When user selects an image from the desktop
    And click on the upload button
    Then verify the File Uploaded!  Message displayed

    */
    @Test
    public void fileUploadTest(){
        driver.get("https://the-internet.herokuapp.com/upload");
        String filePath="C:\\Users\\ayse8\\OneDrive\\Desktop\\OIP.jfif";

      WebElement chooseFileButton= driver.findElement(By.id("file-upload"));
      chooseFileButton.sendKeys(filePath);

     WebElement uploadButton= driver.findElement(By.id("file-submit"));
     uploadButton.click();


   String actual= driver.findElement(By.xpath("//h3[.='File Uploaded!']")).getText();
        Assert.assertEquals("File Uploaded!",actual);



    }
}
