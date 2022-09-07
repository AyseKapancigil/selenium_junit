package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimerTask;

public class Homework02 extends TestBase {


    @Test
    public void test(){
        driver.get("https://jqueryui.com/datepicker");

        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();



       String currentTime =  new SimpleDateFormat("MM/dd/YYYY").format(new Date());
      String str= currentTime.substring(3,5);
        System.out.println(str);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(currentTime);
  List<WebElement> allDate=  driver.findElements(By.xpath("//td[@data-event='click']"));

  for(int i = 0;i< allDate.size();i++){
      if(currentTime==str){

    }

  }



//a[@data-date='2']

    }

}
