package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill014_iFrame {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        /*
        We have 3 way to change frame
        1- driver.switchTo().frame( frameIndexNumber );
        2- driver.switchTo().frame( iframeWebElement );
        3- driver.switchTo().frame( frameIdOrName );
         */

        /*
        We have two ways to turn back to parent frame
        1- driver.switchTo().parentFrame();      // this will go one level out
        2- driver.switchTo().defaultContent();   // this will go to main level
         */

    }

}
