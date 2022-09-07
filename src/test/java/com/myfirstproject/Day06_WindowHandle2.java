package com.myfirstproject;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;
public class Day06_WindowHandle2 extends TestBase {
    @Test
    public void newWindowTest() throws InterruptedException {
//     Open techproeducation on window 1
        driver.get("https://www.techproeducation.com");
        System.out.println("TechPro Title : "+driver.getTitle());
        String techProHandle = driver.getWindowHandle();
//        Open amazon on a new window 2
        driver.switchTo().newWindow(WindowType.WINDOW);//create and switch a new window
        driver.get("https://www.amazon.com");
        System.out.println("Amazon Title : "+driver.getTitle());
        String amazonHandle= driver.getWindowHandle();
//      Open linkedin on a new window 3
        driver.switchTo().newWindow(WindowType.WINDOW);//create and switch a new window
        driver.get("https://www.linkedin.com");
        System.out.println("Linkedin Title : "+driver.getTitle());
        String linkedinHandle = driver.getWindowHandle();
        Thread.sleep(2000);
//        switching techpro page
        driver.switchTo().window(techProHandle);
        Thread.sleep(2000);
//        switch amazon page
        driver.switchTo().window(amazonHandle);
        Thread.sleep(2000);
//        switch linkedin page
        driver.switchTo().window(linkedinHandle);
    }

    @Test
    public void newTabTest() throws InterruptedException {
      //  Open techproeducation on window 1
        driver.get("https://www.techproeducation.com");
        System.out.println("TechPro Title : "+driver.getTitle());
        String techProHandle = driver.getWindowHandle();

       //switch lms
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://lms.techproeducation.com/");
       String title = driver.getTitle();
        System.out.println(title);

       String lmsHandle= driver.getWindowHandle();

       //techpro main window
        Thread.sleep(3000);
        driver.switchTo().window(techProHandle);

        System.out.println( driver.getCurrentUrl());

        Thread.sleep(3000);

        driver.switchTo().window(lmsHandle);
        System.out.println( driver.getCurrentUrl());
    }
}
