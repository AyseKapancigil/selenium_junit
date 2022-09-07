package ExerciseSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NewCheckbox {

    WebDriver driver;

    @Before

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();

    }
    @After

    public void tearDown(){
        driver.quit();
    }

    @Test
    public void checkBoxTest(){

        driver.get("https://the-internet.herokuapp.com/checkboxes");
       WebElement checkBox1= driver.findElement(By.xpath(("//input[@type='checkbox'][1]")));
        WebElement checkBox2 = driver.findElement(By.xpath(("//input[@type='checkbox'][2]")));


        if(!checkBox1.isSelected()){
            checkBox1.click();

        }
        if(!checkBox2.isSelected()){
            checkBox2.click();

        }
        Assert.assertTrue(checkBox1.isSelected());
    }

}
