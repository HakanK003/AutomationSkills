package com.hk.tests.testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Skill001_Assert {

    @Test
    public void test1(){

        String str1 = null;
        int a = 3;
        int b = 3;
        int c = 6;

        Assert.assertEquals( a, b );  //message part is for us if test fails the message will display
        Assert.assertEquals( a, b , "a isn't equal b");

        Assert.assertNotEquals(a, c, "a is equal b");

        Assert.assertTrue(a==b );
        //Assert.assertTrue(a==b , "a isn't equal b");

        Assert.assertFalse(a==c);
        //Assert.assertFalse(a==c, "a is equal to c");

        Assert.assertNull(str1);

        //Assert.assertNotNull(str1, "it is null");

        //if one of five asserts fail, test will fail

    }

}
