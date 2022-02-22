package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill000_WebDriver {

    public static void main(String[] args) {

        //  WebDriverManager.driverTypeDriver().setup();
            WebDriverManager.chromedriver().setup();

        //  Creating a driver object
        //  ObjectType ObjectName = newKeyword driverTypeDriver();
            WebDriver driver = new ChromeDriver();


    }

}
