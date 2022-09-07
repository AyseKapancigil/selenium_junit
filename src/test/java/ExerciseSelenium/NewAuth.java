package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;

public class NewAuth extends TestBase {
      /* https://username:password@URL

        username : admin
        password : admin
        url   : the-internet.herokuapp.com/basic_auth

        */

    @Test
    public void test(){

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
