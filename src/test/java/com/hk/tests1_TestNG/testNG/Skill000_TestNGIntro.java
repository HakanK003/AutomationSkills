package com.hk.tests1_TestNG.testNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class Skill000_TestNGIntro {

    /*

    TestNG Life Cycle Annotation

    @Test --> is our test

    @BeforeMethod --> Will execute before every single @Test's
    @AfterMethod --> Will execute after every single @Test's

    @BeforeClass --> Will execute before all the @Test's only one time
    @AfterClass --> Will execute before all the @Test's only one time

     */

        //this part is for execution order, if we don't assign it default order will be based on names by ASCII table
    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1 is running...");

        //Assert.assertEquals(actual, expected); --> compare 2 of the same things
        String actual = "hello";
        String expected = "hello";

        Assert.assertEquals(actual, expected);

    }

    @Test(priority = 2)
    public void test3(){
        System.out.println("Test 3 is running...");

        String actual = "Java";
        String expected = "Java";

        Assert.assertEquals(actual, expected);

    }

    @Test(priority = 3)
    public void test2(){
        System.out.println("Test 2 is running...");

        String actual = "TestNG";
        String expected = "TestNG";

        Assert.assertEquals(actual, expected);
    }

    @BeforeClass
    public void setupMethod(){
        System.out.println("-----> BeforeClass is running!");

    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> AfterClass is running!");

    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> AfterMethod is running!");
    }

}
