package com.hk.tests.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skill013_Alerts {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //HTML pop-ups we can inspect

    /*
    //JavaScript alerts we can't inspect
    1-Click alert  ( click ok )
    2-Confirm alert ( click cancel or ok)
    3-Prompt alert ( enter hat is asked )
     */

        Alert alertObj = driver.switchTo().alert();

        driver.switchTo().alert().accept();  // click ok

        alertObj.accept();  // click ok

        driver.switchTo().alert().dismiss();  // click cancel

        alertObj.dismiss();

        driver.switchTo().alert().sendKeys("Hello There");

        driver.switchTo().alert().accept();

        driver.switchTo().alert().getText();

    }

}
