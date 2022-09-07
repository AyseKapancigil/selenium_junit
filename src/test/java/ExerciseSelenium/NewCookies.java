package ExerciseSelenium;

import com.myfirstproject.utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.sql.SQLOutput;
import java.util.Set;

public class NewCookies extends TestBase {

    @Test
    public void cookies(){

        driver.get("https://www.amazon.com");
      Set<Cookie> cookie = driver.manage().getCookies();
        System.out.println(cookie);
       int numOfCookie= cookie.size();
        System.out.println(numOfCookie);

        for(Cookie w : cookie){
            System.out.println(  w.getName());
            System.out.println( w.getValue());

        }
        Cookie cookieObj= new Cookie("milk","choclate");
        driver.manage().addCookie(cookieObj);
        System.out.println(cookieObj);
      Set<Cookie> cookie2=driver.manage().getCookies();
        //System.out.println( cookie2.size());
    driver.manage().deleteCookieNamed("milk");
     Set<Cookie> cookie3 =  driver.manage().getCookies();
        System.out.println( cookie3.size());

        driver.manage().deleteAllCookies();
      Set<Cookie> cookies4=  driver.manage().getCookies();
        System.out.println( cookies4.size());

        System.out.println(  driver.manage().getCookieNamed("milk"));
    }

}
