package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Set;

public class NewWindowHandle extends TestBase {

    @Test
    public void newHandle(){
        driver.get("https://the-internet.herokuapp.com/windows");

        driver.findElement(By.linkText("Click Here")).click();
        Assert.assertTrue( driver.findElement(By.xpath("//h3")).isDisplayed());
       String handle1= driver.getWindowHandle();
        System.out.println(handle1);

     Set<String> allHandles=   driver.getWindowHandles();
        System.out.println(allHandles);

        for(String w :allHandles){
            if(!w.equals(handle1)){

                System.out.println(w);
String handle2 = w;
driver.switchTo().window(handle2);
                System.out.println(handle2);


            }

            }


        }

    }



