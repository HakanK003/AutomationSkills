package com.hk.tests.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Skill002_DataProvider {

    //Same test with multiple data

    @DataProvider(name="myData")
    public Object[][] provideData(){
                //We can use what we need for type
        return new Object[][]{
                {"Adam"},
                {"John"},
                {"Mary"},
                {"Alice"},
        };
    }


    @Test(dataProvider = "myData")
    public void testMultipleData(String name){

        System.out.println(name);

    }


    @DataProvider(name = "TwoSetOfData")
    public Object[][] provideData2(){

        return new Object[][]{
                {"Adam", 20},
                {"Alice", 23},
                {"Mary", 26},
                {"John", 29},
        };
    }

    @Test(dataProvider = "TwoSetOfData")
    public void testNameAndAge(String name, int age){
        System.out.println(name + " is " + age + " years old");
    }


}
