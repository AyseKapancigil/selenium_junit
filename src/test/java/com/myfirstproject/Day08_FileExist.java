package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day08_FileExist {
   /* Class: FileExistTest
    Method: isExist
    Pick a file on your desktop
    And verify if that file exist on your computer or not

    */

    @Test
    public void isExistTest(){
      String homeDirectory=  System.getProperty("user.home");
        System.out.println(homeDirectory);

        String userDirectory=System.getProperty("user.dir");
        System.out.println(userDirectory);

   String filePath="C:\\Users\\ayse8\\OneDrive\\Desktop\\OIP.jfif";
      boolean isExist =  Files.exists(Paths.get(filePath));
        Assert.assertTrue(isExist);
    }

    @Test

    public void isExist1(){
        String homeDirectory=  System.getProperty("user.home");
        System.out.println(homeDirectory);

        String userDirectory=System.getProperty("user.dir");
        System.out.println(userDirectory);

        String filePath= homeDirectory+"\\OneDrive\\Desktop\\OIP.jfif";
        boolean isExist =  Files.exists(Paths.get(filePath));
        Assert.assertTrue(isExist);


    }

}
