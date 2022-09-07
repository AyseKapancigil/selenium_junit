package com.myfirstproject;

import org.junit.*;

public class Day02_JUnitAnnotations {
@BeforeClass
public  static void setUpClass(){
    System.out.println("Before Class");
}
@AfterClass
public static void tearDownClass(){
    System.out.println("After Class");
}
@Before
public void setUpMethod(){
    System.out.println("Before Method");
}
@After
public void tearDownMethod(){
    System.out.println("After Method");
}
    @Test
    public void test1() {
        System.out.println("Test 1");

    }

    @Test @Ignore
    public void test2() {
        System.out.println("Test 2");
    }
        @Test
        public void test3() {
            System.out.println("Test 3");


        }@Test
    public void test4(){
        System.out.println("Test 4");


    }
}