package ExerciseSelenium;

import com.github.javafaker.Faker;
import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Q01 extends TestBase {
   /*
Go to "https://www.automationexercise.com/"
Verify that the cart is initially empty.
Add first product to the cart
Verify that the product added.
Verify the color, size, quantity, price, shipping, Total Price
Click on Proceed to checkout
Verify that user is on the summary stage
Then verify the product is in stock
Then verify the Unit price matches the price that is on the Add To Card page
Click on + (plus) sign and verify the TOTAL price is 2*price+shipping => 2 * 16.51 + 2.00 = 35.02
Add one more product to the cart and delete second product
Verify that second product is deleted.

 */

    @Test
    public void test(){
        driver.get("https://www.automationexercise.com/");

        driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[1]")).click();

     WebElement text = driver.findElement(By.xpath("//b"));

        Assert.assertEquals("Cart is empty!",text.getText());
        driver.navigate().back();

        driver.findElement(By.xpath("//a[@data-product-id='1']")).click();

     WebElement added=  driver.findElement(By.xpath("(//h4)[4]"));

  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
 WebElement added1=   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4)[4]")));
String actual =added1.getText();
Assert.assertEquals("Added!",actual);

driver.findElement(By.xpath("//p[@class='text-center']//a")).click();
 WebElement blueTop= driver.findElement(By.xpath("//h4//a"));
 Assert.assertTrue(blueTop.isDisplayed());


WebElement price= driver.findElement(By.xpath("//td[@class='cart_price']//p"));
Assert.assertTrue(price.isDisplayed());

String actualQuantity=driver.findElement(By.xpath("//td[@class='cart_quantity']//button")).getText();
Assert.assertEquals("1",actualQuantity);

      WebElement totalPrice=driver.findElement(By.xpath("//td[@class='cart_total']//p"));
      Assert.assertTrue(totalPrice.isDisplayed());

      driver.findElement(By.xpath("//div[@class='col-sm-6']//a")).click();
 driver.findElement(By.xpath("//a//u")).click();
      Faker faker = new Faker();
      driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());
      driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password());
      driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}