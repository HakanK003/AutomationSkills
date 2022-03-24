package com.hk.tests1_TestNG.testNG;

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

/*
    @DataProvider(name="dataForTest1")
    public Object[][] provideData(){
        return new Object[][]{

//group27
                {"storemanager100"},
                {"salesmanager270"},

                {"storemanager99"},
                {"salesmanager267"},
//group1
                {"storemanager51"},
                {"salesmanager101"},

                {"storemanager54"},
                {"salesmanager103"},
//group2
                {"storemanager55"},
                {"salesmanager105"},

                {"storemanager58"},
                {"salesmanager108"},
//group3
                {"storemanager59"},
                {"salesmanager109"},

                {"storemanager62"},
                {"salesmanager112"},
//group4
                {"storemanager63"},
                {"salesmanager113"},

                {"storemanager66"},
                {"salesmanager116"},
//group5
                {"storemanager67"},
                {"salesmanager117"},

                {"storemanager70"},
                {"salesmanager120"},
//group6
                {"storemanager71"},
                {"salesmanager121"},

                {"storemanager74"},
                {"salesmanager124"},
//group7
                {"storemanager75"},
                {"salesmanager125"},

                {"storemanager78"},
                {"salesmanager128"},
//group8
                {"storemanager79"},
                {"salesmanager129"},

                {"storemanager82"},
                {"salesmanager132"},
//group9
                {"storemanager83"},
                {"salesmanager137"},

                {"storemanager86"},
                {"salesmanager136"},
//group10
                {"storemanager87"},
                {"salesmanager137"},

                {"storemanager90"},
                {"salesmanager140"},
//group11
                {"storemanager65"},
                {"salesmanager141"},

                {"storemanager69"},
                {"salesmanager143"},
//group12
                {"storemanager205"},
                {"salesmanager144"},

                {"storemanager208"},
                {"salesmanager147"},
//group13
                {"storemanager251"},
                {"salesmanager251"},

                {"storemanager254"},
                {"salesmanager254"},
//group14
                {"storemanager55"},
                {"salesmanager260"},

                {"storemanager58"},
                {"salesmanager265"},
//group15
                {"storemanager51"},
                {"salesmanager109"},

                {"storemanager54"},
                {"salesmanager112"},
//group16
                {"storemanager63"},
                {"salesmanager113"},

                {"storemanager66"},
                {"salesmanager116"},
//group17
                {"storemanager59"},
                {"salesmanager117"},

                {"storemanager62"},
                {"salesmanager120"},
//group18
                {"storemanager71"},
                {"salesmanager121"},

                {"storemanager74"},
                {"salesmanager124"},
//group19
                {"storemanager67"},
                {"salesmanager125"},

                {"storemanager70"},
                {"salesmanager128"},
//group20
                {"storemanager83"},
                {"salesmanager129"},

                {"storemanager86"},
                {"salesmanager132"},
//group21
                {"storemanager44"},
                {"salesmanager133"},

                {"storemanager49"},
                {"salesmanager136"},
//group22
                {"storemanager79"},
                {"salesmanager137"},

                {"storemanager82"},
                {"salesmanager140"},
//group23
                {"storemanager83"},
                {"salesmanager251"},

                {"storemanager86"},
                {"salesmanager254"},
//group24
                {"storemanager87"},
                {"salesmanager255"},

                {"storemanager90"},
                {"salesmanager258"},
//group25
                {"storemanager91"},
                {"salesmanager259"},

                {"storemanager94"},
                {"salesmanager262"},
//group26
                {"storemanager95"},
                {"salesmanager263"},

                {"storemanager98"},
                {"salesmanager266"},
//group28
                {"storemanager63"},
                {"salesmanager271"},

                {"storemanager66"},
                {"salesmanager274"},
//group29
                {"storemanager67"},
                {"salesmanager275"},

                {"storemanager72"},
                {"salesmanager278"},
        };
}
 */