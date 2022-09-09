package practice04;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Q05 extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/basic-html-form-test.html
    //Fill the username, password and textArea comment:
    //Choose a file and upload it
    //Select checkbox, radio item and dropdowns
    //Click on submit
    //Verify that uploaded file name is on the Form Details.

    @Test
    public void test(){
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ayse");

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
  WebElement commentBox= driver.findElement(By.xpath("//textarea[@name='comments']"));
  commentBox.clear();
  commentBox.sendKeys("Hi everybody");

  String filePath ="C:\\Users\\ayse8\\OneDrive\\Desktop\\interview4.png";

 driver.findElement(By.xpath("//input[@name='filename']")).sendKeys(filePath);

 WebElement checkBox1= driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[1]"));
 WebElement checkBox2= driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[2]"));
 WebElement checkBox3= driver.findElement(By.xpath("(//input[@name='checkboxes[]'])[3]"));

 if(!checkBox1.isSelected()){
     checkBox1.click();

 }
 if(checkBox2.isSelected()){
     checkBox2.click();

 }
 if(checkBox3.isSelected()){
     checkBox3.click();

 }
 driver.findElement(By.xpath("(//input[@name='radioval'])[3]")).click();
 driver.findElement(By.xpath("//option[@value='ms4']")).click();

 WebElement dropdown=driver.findElement(By.xpath("//select[@name='dropdown']"));
 Select select = new Select(dropdown);
 select.selectByValue("dd1");

 driver.findElement(By.xpath("//input[@type='submit']")).click();

WebElement fileName= driver.findElement(By.id("_valuefilename"));
      Assert.assertTrue(fileName.isDisplayed());

    }
}
