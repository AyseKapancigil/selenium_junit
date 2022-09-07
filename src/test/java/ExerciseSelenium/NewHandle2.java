package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class NewHandle2 extends TestBase {

    @Test
    public void test(){
      driver.get("https://www.techproeducation.com");
      String techHandle=  driver.getWindowHandle();


      driver.switchTo().newWindow(WindowType.WINDOW);
      driver.get("https://amazon.com");
    String amazonHandle=  driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com");
       String googleHandle= driver.getWindowHandle();

    driver.switchTo().window(techHandle);
    driver.switchTo().window(googleHandle);


    //driver.switchTo().newWindow(WindowType.TAB);

    }



}
