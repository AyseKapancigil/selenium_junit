package practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Q03 extends TestBase {
    /*
     * Navigate to  https://www.saucedemo.com/
     * Enter the username  as "standard_user"
     * Enter the password as   "secret_sauce"
     * Click on login button
     * Order products by "Price (low to high)"
     * Verify that last product costs $49.99, first product costs $7.99.
     */

    @Test
    public void test(){
        driver.get(" https://www.saucedemo.com/");

      WebElement username =driver.findElement(By.xpath("//input[@id='user-name']"));
      username.sendKeys("standard_user");

      driver.findElement(By.id("password")).sendKeys("secret_sauce");

      driver.findElement(By.id("login-button")).click();

     WebElement dropDown= driver.findElement(By.xpath("//select[@class='product_sort_container']"));

     Select select = new Select(dropDown);
    select.selectByValue("lohi");

   List<WebElement> prices= driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

                Assert.assertEquals("$49.99",prices.get(prices.size()-1).getText());
              //  Assert.assertEquals("$7.99",products.get(0).getText());

            }

        }



