package com.myfirstproject;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileDownloadTest extends TestBase {
   /* Create a class:FileDownloadTest
    downloadTest()
    In the downloadTest() method, do the following test:
    Go to https://the-internet.herokuapp.com/download
    Download flower.png file
    Then verify if the file downloaded successfully

    */

    @Test
    public void downloadTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/download");

        driver.findElement(By.linkText("usa.png")).click();

        Thread.sleep(1000);
        String homeDirectory=  System.getProperty("user.home");
        String filePath =homeDirectory+"//Downloads//usa.png";
        boolean isDownloaded = Files.exists(Paths.get(filePath));
        Assert.assertTrue(isDownloaded);

    }
}
