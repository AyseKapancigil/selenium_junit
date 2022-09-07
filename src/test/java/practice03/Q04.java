package practice03;

import com.myfirstproject.utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04 extends TestBase {
    //Go to http://webdriveruniversity.com/To-Do-List/index.html
    //Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
    //Strikethrough all todos.
    //Delete all todos.
    //Verify that all todos deleted.
    @Test
    public void test() throws InterruptedException {

        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");


        List<String> todos = new ArrayList<>(Arrays.asList("Prepare breakfast", "Wash the dishes", "Take care of baby", "Help your kid's homework", "Study Selenium", "Sleep"));
        WebElement addToDo = driver.findElement(By.xpath("//input[@type='text']"));


        Actions actions = new Actions(driver);
        for (String w : todos) {
            actions.click(addToDo).sendKeys(w).sendKeys(Keys.ENTER).perform();


        }
        List<WebElement> todoStrike = driver.findElements(By.xpath("//li"));

        for (WebElement w : todoStrike) {

            w.click();

        }

       List <WebElement> deleteButtons= driver.findElements(By.xpath("//i[@class='fa fa-trash']"));

        for(WebElement w :deleteButtons){
            w.click();
           // Thread.sleep(2000);

        }
Thread.sleep(2000);
       List <WebElement> newTodos= driver.findElements(By.xpath("//li"));
        Assert.assertEquals(0,newTodos.size());

    }
}
