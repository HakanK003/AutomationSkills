package com.hk.tests1_TestNG.testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Skill006_BeforeSuiteAfterSuite {

    @BeforeSuite
    public void setupSuite(){
        System.out.println("<-- @BeforeSuite run once before entire suite -->");
    }

    
    @BeforeTest
    public void setupTestSet(){
        System.out.println("@BeforeTest run once before each test set in suite xml file");
    }


    @AfterTest
    public void teardownTestSet(){
        System.out.println("@AfterTest run once after each test set in suite xml file");
    }
    
    
    @AfterSuite
    public void teardownSuite(){
        System.out.println("<-- @AfterSuite run once after entire suite -->");
    }

}
