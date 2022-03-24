package com.hk.tests1_TestNG.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skill004_DependsOn {

    @Test
    public void test1(){
        System.out.println("Test 1 is running");
        Assert.assertEquals(6, 3);
    }
    
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("Test 2 is running");
        Assert.assertEquals(3, 3);
    }
    
    @Test(dependsOnMethods = {"test1", "test2"}, alwaysRun = true)
    public void test3(){
        System.out.println("Test 3 is running");
        Assert.assertEquals(3, 3);
    }

}
