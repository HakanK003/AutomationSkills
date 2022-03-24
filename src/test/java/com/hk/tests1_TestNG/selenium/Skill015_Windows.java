package com.hk.tests1_TestNG.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill015_Windows {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        /*
        For Selenium window and tab is same thing, and it can focus only one window at the same time

        Window handle is something like locator, we put these in to
        driver.switchTo().window(windowHandle);

        String mainHandle = driver.getWindowHandle(); //this will return us main window handle

        return String handle value of current window or tab
        1-String currentHandle = driver.getWindowHandle();

        return all window handles in a Set
        2-Set<String> allHandles = driver.getWindowHandles();
         */

        /*
        JS executor
         */

    }

}
