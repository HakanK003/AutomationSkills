
//@Ignore  //this will ignore all package
package com.hk.tests.testNG;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore //will ignore all class
public class Skill005_IgnoreTest {

    /*
     We can ignore different levels
    -In a class
    -In a particular package
    -In a package and all of its child packages
     */

    //@Ignore //will ignore this method
    @Test
    public void test1(){
        System.out.println("Test 1 is running");
        Assert.assertEquals(3, 3);
    }

    //This is a second way to ignore
    @Test(enabled = false)
    public void test2(){
        System.out.println("Test 2 is running");
        Assert.assertEquals(3, 3);
    }

    @Test
    public void test3(){
        System.out.println("Test 3 is running");
        Assert.assertEquals(3, 3);
    }


}
