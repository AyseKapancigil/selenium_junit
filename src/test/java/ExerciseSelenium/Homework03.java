package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework03 extends TestBase{

    @Test
    public void test(){
        driver.get("https://jqueryui.com/toggle/");
        driver.switchTo().frame(0);

      WebElement text = driver.findElement(By.xpath("//div[@id='effect']//p"));
        System.out.println(text.getText());

        driver.findElement(By.xpath("//button[@id='button']")).click();

       WebElement emptyText= driver.findElement(By.xpath("//div[@class='toggler']"));
       // System.out.println("Empty Text :"+emptyText.getText());

    }
}
