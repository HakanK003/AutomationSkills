package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill002_GetMethodGeneral {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // get() -> going to a url
        driver.get("https://www.google.com");

        // getTitle() -> get the title of the current page *this will return us a String
        System.out.println( driver.getTitle() );

        // getCurrentUrl() -> get the url of current page *this will return us a String
        System.out.println( driver.getCurrentUrl() );

        // getPageSource() -> get the source codes of the current page *this will return us a String
        System.out.println(driver.getPageSource());


    }

}
