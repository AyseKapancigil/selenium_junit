package ExerciseSelenium;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class newFileExist {
     /* Class: FileExistTest
    Method: isExist
    Pick a file on your desktop
    And verify if that file exist on your computer or not

    */

    @Test
    public void test(){
        String homeDirectory=  System.getProperty("user.home");
        System.out.println(homeDirectory);

        String userDirectory=System.getProperty("user.dir");
        System.out.println(userDirectory);

      String path=homeDirectory+"\\OneDrive\\Desktop\\OIP.jfif";

        Assert.assertTrue( Files.exists(Paths.get(path)));

    }
}
