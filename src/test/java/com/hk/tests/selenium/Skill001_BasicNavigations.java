package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Skill001_BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // maximize screen
        driver.manage().window().maximize();

        // full screen view
        driver.manage().window().fullscreen();

        // going to a url
        driver.get("https://www.google.com");

        // going to a url 2
        driver.navigate().to("https://translate.google.com/");

        // waiting (milliseconds)
        Thread.sleep(3000);

        // turning back to last page
        driver.navigate().back();

        // going forward
        driver.navigate().forward();

        // refreshing page
        driver.navigate().refresh();

        // close current window
        driver.close();

        // close all the opened windows
        driver.quit();


    }

}
